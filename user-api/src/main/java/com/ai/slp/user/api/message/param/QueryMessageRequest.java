package com.ai.slp.user.api.message.param;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.ai.opt.base.vo.BaseInfo;
import com.ai.slp.user.api.message.interfaces.IUserMessageSV;

/**
 * 查询消息入参 Date: 2016年4月27日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class QueryMessageRequest extends BaseInfo {

    private static final long serialVersionUID = 1L;

    /**
     * pageNo
     */
    private Integer pageNo;

    /**
     * pageSize
     */
    private Integer pageSize;

    /**
     * userID NOT NULL
     */
    @NotNull(message = "用户ID不能为空", groups = { IUserMessageSV.QueryUserMessage.class })
    @Size(min = 18, max = 18, message = "用户Id长度不是18位", groups = {
            IUserMessageSV.QueryUserMessage.class })
    private String userId;

    /**
     * 消息类型
     */
    private String infoType;

    /**
     * 消息读取状态
     */
    private String readFlag;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getInfoType() {
        return infoType;
    }

    public void setInfoType(String infoType) {
        this.infoType = infoType;
    }

    public String getReadFlag() {
        return readFlag;
    }

    public void setReadFlag(String readFlag) {
        this.readFlag = readFlag;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

}
