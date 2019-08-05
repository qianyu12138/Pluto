package cn.pluto.mapper;

import cn.pluto.po.Kind;
import cn.pluto.po.KindCustom;
import cn.pluto.po.KindExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KindMapper {
    int countByExample(KindExample example);

    int deleteByExample(KindExample example);

    int deleteByPrimaryKey(Integer kid);

    int insert(Kind record);

    int insertSelective(Kind record);

    List<Kind> selectByExample(KindExample example);

    Kind selectByPrimaryKey(Integer kid);

    int updateByExampleSelective(@Param("record") Kind record, @Param("example") KindExample example);

    int updateByExample(@Param("record") Kind record, @Param("example") KindExample example);

    int updateByPrimaryKeySelective(Kind record);

    int updateByPrimaryKey(Kind record);

    List<KindCustom> selectAllKindWithTopNumJournal(int num);
}