package study.dubbo.demo.provider;



import com.alibaba.dubbo.rpc.RpcContext;
import study.dubbo.demo.DemoService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by linrunhua on 2017/12/22.
 */
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
//        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
//        return "Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
        return "hello " + name;
    }
}
