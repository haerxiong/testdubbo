package cn.lw;

import cn.lw.controller.USrv;
import cn.lw.interfaces.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
public class TestApiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(TestApiApplication.class, args);
		System.out.println(run.getBean(USrv.class).rename("lw"));
	}

}

