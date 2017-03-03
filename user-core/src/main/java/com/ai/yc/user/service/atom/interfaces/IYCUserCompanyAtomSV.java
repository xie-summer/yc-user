package com.ai.yc.user.service.atom.interfaces;

import java.util.List;

import com.ai.yc.user.dao.mapper.bo.UsrCompany;
import com.ai.yc.user.dao.mapper.bo.UsrCompanyCriteria;
import com.ai.yc.user.dao.mapper.bo.UsrContact;
import com.ai.yc.user.dao.mapper.bo.UsrContactCriteria;

public interface IYCUserCompanyAtomSV {
	public int insertCompanyInfo(UsrCompany companyInfo);
	public int updateCompanyInfo(UsrCompany companyInfo);
	public int deleteCompanyInfo(String contactId);
	public List<UsrCompany> queryCompanyInfo(UsrCompanyCriteria example);
	public int getCompanyCount(UsrCompanyCriteria example);
}
