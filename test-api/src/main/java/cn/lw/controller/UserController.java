package cn.lw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {

    @Autowired
    public USrv userService;

    @RequestMapping("/user")
    public String user(HttpServletRequest request) {
        String name = request.getParameter("name");
        if(StringUtils.isEmpty(name))
            name = "lw";
        return userService.rename(name);
    }
}
