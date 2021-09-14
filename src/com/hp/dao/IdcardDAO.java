package com.hp.dao;

import com.hp.util.Idcard;
import com.hp.util.IdcardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IdcardDAO {
    long countByExample(IdcardExample example);

    int deleteByExample(IdcardExample example);

    int deleteByPrimaryKey(Integer zid);

    int insert(Idcard record);

    int insertSelective(Idcard record);

    List<Idcard> selectByExample(IdcardExample example);

    Idcard selectByPrimaryKey(Integer zid);

    int updateByExampleSelective(@Param("record") Idcard record, @Param("example") IdcardExample example);

    int updateByExample(@Param("record") Idcard record, @Param("example") IdcardExample example);

    int updateByPrimaryKeySelective(Idcard record);

    int updateByPrimaryKey(Idcard record);
}