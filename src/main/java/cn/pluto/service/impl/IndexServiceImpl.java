package cn.pluto.service.impl;

import cn.pluto.mapper.*;
import cn.pluto.po.*;
import cn.pluto.service.IndexService;
import cn.pluto.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class IndexServiceImpl implements IndexService {

    @Autowired
    private IndexMapper indexMapper;

    @Autowired
    private IndexCarouselMapper indexCarouselMapper;
    @Autowired
    private PhotographMapper photographMapper;
    @Autowired
    private KindMapper kindMapper;
    @Autowired
    private ReviewMapper reviewMapper;

    @Override
    public IndexCustom getIndexCustom() {
        //查询index第一条数据
        Index index = indexMapper.selectByPrimaryKey(1);

        //查询所有轮播图
        IndexCarouselExample example = new IndexCarouselExample();
        IndexCarouselExample.Criteria criteria = example.createCriteria();
        criteria.andSpEqualTo("0");
        List<IndexCarousel> indexCarousels = indexCarouselMapper.selectByExample(example);

        //查询中间图片
        example.clear();
        IndexCarouselExample.Criteria criteria2 = example.createCriteria();
        criteria2.andSpEqualTo("1");
        List<IndexCarousel> indexImgItems = indexCarouselMapper.selectByExample(example);

        //查询图片列表
        List<Photograph> photographs = photographMapper.selectTopSixPhoto();

        //查询主页日志，每类前4个日志，截取前20字内容
        //查询所有类别，带journal数据
        List<KindCustom> kindCustoms = kindMapper.selectAllKindWithTopNumJournal(4);
        //遍历journal，把类3空值remove，截取内容
        for (KindCustom kindCustom:
                kindCustoms) {
            for (Journal j :
                    kindCustom.getJournals()) {
                if (j.getJid() == null) {
                    kindCustom.getJournals().remove(j);
                    break;
                }
                else{
                    j.setContent(j.getContent().substring(0,20));
                }
            }
        }

        //查询前4评论，带visitor
        List<ReviewCustom> reviewCustom = reviewMapper.selectTopNum(4);

        //创建IndexCustom，将父类index属性提取，赋值indexCustom
        IndexCustom indexCustom = new IndexCustom();
        CommonUtils.BeantoBean(index, indexCustom);

        indexCustom.setIndexCarouselList(indexCarousels);
        indexCustom.setIndexImgItems(indexImgItems);
        indexCustom.setPhotographs(photographs);
        indexCustom.setKindCustoms(kindCustoms);
        indexCustom.setReviewCustoms(reviewCustom);

        System.out.println(indexImgItems);
        return indexCustom;
    }
}
