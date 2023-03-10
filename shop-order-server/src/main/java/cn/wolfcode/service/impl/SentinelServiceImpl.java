package cn.wolfcode.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SentinelServiceImpl {
    @SentinelResource(value = "resourceMethod")
    public void resourceMethod(){
        log.info("调⽤resourceMethod⽅法");
    }
}
