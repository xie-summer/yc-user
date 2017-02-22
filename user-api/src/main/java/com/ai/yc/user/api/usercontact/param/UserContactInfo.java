package com.ai.yc.user.api.usercontact.param;

public class UserContactInfo {
private static final long serialVersionUID = 1L;
	
	/**
	 * 联系人id,主键
	 */
	private String contactId;

	/**
	 * 国家编号
	 * 必填
	 */
    private Integer gnCountryId;
	
	/**
	 * 姓名
	 */
	private String userName;
	
	/**
	 * 手机
	 */
	private String mobelPhone;
	
	/**
	 * 邮箱
	 */
	private String email;
	
	/**
	 * 是否默认
	 */

	private Integer isDefault;

	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public Integer getGnCountryId() {
		return gnCountryId;
	}

	public void setGnCountryId(Integer gnCountryId) {
		this.gnCountryId = gnCountryId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMobelPhone() {
		return mobelPhone;
	}

	public void setMobelPhone(String mobelPhone) {
		this.mobelPhone = mobelPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
	}	
}