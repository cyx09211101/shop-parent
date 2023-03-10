package cn.wolfcode.controller;

import cn.wolfcode.service.impl.SentinelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TraceController {
    @Autowired
    private SentinelServiceImpl sentinelService;
    @RequestMapping("/trace1")
    public String trace1(){
        sentinelService.resourceMethod();
        return "trace1";
    }
    @RequestMapping("/trace2")
    public String trace2(){
        sentinelService.resourceMethod();
        return "trace2";
    }
}
