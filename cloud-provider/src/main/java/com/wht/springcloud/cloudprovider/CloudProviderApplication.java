package com.wht.springcloud.cloudprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient   //声明该微服务注册到服务注册中心
@SpringBootApplication
public class CloudProviderApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderApplication.class, args);
    }


    //使用Tomcat启动
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CloudProviderApplication.class);
    }
}
