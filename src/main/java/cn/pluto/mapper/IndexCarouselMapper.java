package cn.pluto.mapper;

import cn.pluto.po.IndexCarousel;
import cn.pluto.po.IndexCarouselExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndexCarouselMapper {
    int countByExample(IndexCarouselExample example);

    int deleteByExample(IndexCarouselExample example);

    int deleteByPrimaryKey(Integer imgid);

    int insert(IndexCarousel record);

    int insertSelective(IndexCarousel record);

    List<IndexCarousel> selectByExample(IndexCarouselExample example);

    IndexCarousel selectByPrimaryKey(Integer imgid);

    int updateByExampleSelective(@Param("record") IndexCarousel record, @Param("example") IndexCarouselExample example);

    int updateByExample(@Param("record") IndexCarousel record, @Param("example") IndexCarouselExample example);

    int updateByPrimaryKeySelective(IndexCarousel record);

    int updateByPrimaryKey(IndexCarousel record);
}