package cn.pluto.mapper;

import cn.pluto.po.Journal;
import cn.pluto.po.JournalExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JournalMapper {
    int countByExample(JournalExample example);

    int deleteByExample(JournalExample example);

    int deleteByPrimaryKey(Integer jid);

    int insert(Journal record);

    int insertSelective(Journal record);

    List<Journal> selectByExampleWithBLOBs(JournalExample example);

    List<Journal> selectByExample(JournalExample example);

    Journal selectByPrimaryKey(Integer jid);

    int updateByExampleSelective(@Param("record") Journal record, @Param("example") JournalExample example);

    int updateByExampleWithBLOBs(@Param("record") Journal record, @Param("example") JournalExample example);

    int updateByExample(@Param("record") Journal record, @Param("example") JournalExample example);

    int updateByPrimaryKeySelective(Journal record);

    int updateByPrimaryKeyWithBLOBs(Journal record);

    int updateByPrimaryKey(Journal record);

    List<Journal> selectTopNumEveryKind(Integer num);
}