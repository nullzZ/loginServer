package com.server.action.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author nullzZ
 *
 */
public interface ILoginAction {
    /**
     * anysdk登录回调
     * 
     * @param request
     * @param response
     */
    public void anySDKCall(HttpServletRequest request, HttpServletResponse response);
}
