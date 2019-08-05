package cn.pluto.mapper;

import cn.pluto.po.Photograph;
import cn.pluto.po.PhotographExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PhotographMapper {
    int countByExample(PhotographExample example);

    int deleteByExample(PhotographExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Photograph record);

    int insertSelective(Photograph record);

    List<Photograph> selectByExample(PhotographExample example);

    Photograph selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Photograph record, @Param("example") PhotographExample example);

    int updateByExample(@Param("record") Photograph record, @Param("example") PhotographExample example);

    int updateByPrimaryKeySelective(Photograph record);

    int updateByPrimaryKey(Photograph record);

    List<Photograph> selectTopSixPhoto();
}