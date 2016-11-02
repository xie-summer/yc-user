package com.ai.yc.user.dao.mapper.interfaces;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.ai.yc.user.dao.mapper.bo.UcLoginLog;
import com.ai.yc.user.dao.mapper.bo.UcLoginLogCriteria;

public interface UcLoginLogMapper {
    int countByExample(UcLoginLogCriteria example);

    int deleteByExample(UcLoginLogCriteria example);

    int insert(UcLoginLog record);

    int insertSelective(UcLoginLog record);

    List<UcLoginLog> selectByExample(UcLoginLogCriteria example);

    int updateByExampleSelective(@Param("record") UcLoginLog record, @Param("example") UcLoginLogCriteria example);

    int updateByExample(@Param("record") UcLoginLog record, @Param("example") UcLoginLogCriteria example);
}