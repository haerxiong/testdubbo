package cn.lw.controller;

import cn.lw.interfaces.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.RpcContext;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@Component
public class USrv {

    @Reference(cache = "lru", async = true)
    public UserService userService;

    public String rename(String name) {
        String rename = userService.rename(name);
        System.out.println(rename);
        Future<String> future = RpcContext.getContext().getFuture();
        String s = null;
        try {
            return future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {
        }
        return "error";
    }
}
