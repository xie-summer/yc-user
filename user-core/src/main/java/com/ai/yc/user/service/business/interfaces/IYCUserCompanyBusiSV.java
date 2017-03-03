package com.ai.yc.user.service.business.interfaces;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.user.api.userCompany.param.UserCompanyInfoRequest;
import com.ai.yc.user.api.userCompany.param.UserCompanyInfoResponse;
import com.ai.yc.user.dao.mapper.bo.UsrCompany;

public interface IYCUserCompanyBusiSV {
	public BaseResponse insertCompanyInfo(UsrCompany companyInfo);
	public BaseResponse updateCompanyInfo(UsrCompany companyInfo);
	public UserCompanyInfoResponse queryCompanyInfo(UserCompanyInfoRequest userInfoRequest);
}
