package com.qfedu.demo.sysView;

import com.qfedu.demo.user.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class sysInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        Object User = httpServletRequest.getSession().getAttribute("user");
        if (User != null) {
            return true;
        } else {
            httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + "/index");
        }

        return false;

//        HttpSession session = httpServletRequest.getSession(false);
//        User user = (User) session.getAttribute("user");
//        String contextPath = httpServletRequest.getContextPath();
//        if (user == null) {
//            httpServletResponse.sendRedirect(contextPath + "/");
//
//        } else {
//            if (user == null) {
//                httpServletResponse.sendRedirect(contextPath + "/");
//            } else {
//                return true;
//            }
//        }
//        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
