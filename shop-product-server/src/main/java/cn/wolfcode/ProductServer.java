package cn.wolfcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServer {//http://localhost:8081/product/1
    public static void main(String[] args) {
        SpringApplication.run(ProductServer.class,args);
    }
}