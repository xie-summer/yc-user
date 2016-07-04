package com.ai.slp.user.api.ucuser.intefaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.slp.user.api.ucuser.param.QueryBaseInfoRequest;
import com.ai.slp.user.api.ucuser.param.SearchUserListResponse;
import com.ai.slp.user.api.ucuser.param.SearchUserRequest;
import com.ai.slp.user.api.ucuser.param.SearchUserResponse;
import com.ai.slp.user.api.ucuser.param.UpdateUserInfoRequest;

@Path("/ucUserservice")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IUcUserSV {


    /**
     * 查询用户信息
     * 
     * @param userInfoRequest
     * @return
     * @author zhangqiang7
     * @UCUSER
     * @RestRelativeURL ucStateChgservice/searchUserList
     */
    @POST
    @Path("/searchUserList")
    public SearchUserListResponse searchUserList(SearchUserRequest userListRequest)
            throws BusinessException, SystemException;
    
    /**
     * 根据手机号码进行查询（不加状态）
     * @param request
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangyh7
     * @ApiCode 
     * @RestRelativeURL ucStateChgservice/queryByPhone
     */
    @POST
    @Path("/queryByPhone")
    SearchUserResponse queryByPhone(SearchUserRequest request) throws BusinessException,SystemException;
    
    /**
     * 根据email进行查询
     * @param request
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangyh7
     * @ApiCode 
     * @RestRelativeURL ucStateChgservice/queryByEmail
     */
    @POST
    @Path("/queryByEmail")
    SearchUserResponse queryByEmail(SearchUserRequest request) throws BusinessException,SystemException;
    
    /**
     * 根据UserId进行查询
     * @param request
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangyh7
     * @ApiCode 
     * RestRelativeURL ucStateChgservice/queryBaseInfo
     */
    @POST
    @Path("/queryBaseInfo")
    SearchUserResponse queryBaseInfo(SearchUserRequest accountQueryRequest) throws BusinessException,SystemException;
    
    /**
     * 更新用户基本信息
     * @param request
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangyh7
     * @ApiCode UAC_0015
     * RestRelativeURL ucStateChgservice/updateBaseInfo
     */
    @POST
    @Path("/updateBaseInfo")
    BaseResponse updateBaseInfo(UpdateUserInfoRequest request) throws BusinessException,SystemException;
    
    /**
     * 根据用户类型查询信息
     * @param request
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangqiang7
     * @ApiCode UAC_0016
     * RestRelativeURL ucStateChgservice/queryByBaseInfo
     */
    @POST
    @Path("/queryByBaseInfo")
    SearchUserResponse queryByBaseInfo(QueryBaseInfoRequest request) throws BusinessException,SystemException;
}
