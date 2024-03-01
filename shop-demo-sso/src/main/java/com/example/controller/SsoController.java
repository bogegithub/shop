package com.example.controller;

import com.example.service.UserService;
import com.example.utils.RedisOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * @className: SsoController
 * @author: YanBo
 * @date: 2023/8/24 15:53
 */

@RestController
public class SsoController {

    @Autowired
    private UserService userService;

    @Autowired
    private RedisOperator redisOperator;

    public static final String REDIS_USER_TOKEN = "redis_user_token";

    public static final String REDIS_USER_TICKET = "redis_user_ticket";
    public static final String REDIS_TMP_TICKET = "redis_tmp_ticket";

    public static final String COOKIE_USER_TICKET = "cookie_user_ticket";


    @GetMapping("/login")
    public String login(String url, Model model) {
        model.addAttribute("url", url);
        return  "login";
    }

    private void setCookie(String key, String val, HttpServletResponse httpServletResponse) {
        Cookie cookie = new Cookie(key, val);
        cookie.setDomain("sso.com");
        cookie.setPath("/");
        httpServletResponse.addCookie(cookie);
    }

    private String getCookie(HttpServletRequest httpServletRequest, String key) {
        Cookie[] cookieList = httpServletRequest.getCookies();
        String cookieValue = null;
        for(int i = 0;  i < cookieList.length; i++) {
            if (cookieList[i].getName().equals(key)) {
                cookieValue = cookieList[i].getValue();
            }
        }
        return  cookieValue;
    }

    private void delCookie(String key, HttpServletResponse httpServletResponse) {
        Cookie cookie = new Cookie(key, null);
        cookie.setDomain("sso.com");
        cookie.setPath("/");
        cookie.setMaxAge(-1);
        httpServletResponse.addCookie(cookie);
    }

    private String createTemTicket() {
        String temTicket = UUID.randomUUID().toString().trim();
        try {
            redisOperator.set("1212", temTicket, 600);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return  temTicket;
    }
}
