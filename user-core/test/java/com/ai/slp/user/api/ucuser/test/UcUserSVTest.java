package com.ai.slp.user.api.ucuser.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.slp.user.api.ucuser.intefaces.IUcUserInfoSV;
import com.ai.slp.user.api.ucuser.param.SearchUserInfoRequest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class UcUserSVTest {

    @Autowired
    private IUcUserInfoSV ucUserInfoSV;

    @Test
    public void searchUserTest() {
        SearchUserInfoRequest request = new SearchUserInfoRequest();
        request.setTenantId("test111");
        //request.setUserId(111L);
        request.setBeginTime("2016-4-27 00:00:00");
       request.setEndTime("2016-4-30 00:00:00");
        
        System.out.println(ucUserInfoSV.searchUserInfo(request).getPageInfo().getResult().size());
    }
}