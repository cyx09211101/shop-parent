package cn.wolfcode.feign;

import cn.wolfcode.domain.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//name的名称⼀定要和订单服务的服务名保持⼀致
@FeignClient(name = "product-service")
public interface ProductFeignApi {
    @RequestMapping("/product/{pid}")
    public Product findByPid(@PathVariable("pid") Long pid);
}
