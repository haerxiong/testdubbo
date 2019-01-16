package cn.lw.user;

import cn.lw.interfaces.UserService;
import com.alibaba.dubbo.config.annotation.Service;

@Service
public class UserSrvImpl implements UserService {
    public String rename(String name) {
        System.out.println("-------------");
        return "ok:" + name;
    }
}
