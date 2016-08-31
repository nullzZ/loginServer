package com.server.core.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author nullzZ
 *
 */
public interface ILoginAction {
    /**
     * sdk登录回调
     * 
     * @param request
     * @param response
     */
    public void sdkCall(HttpServletRequest request, HttpServletResponse response);
}
