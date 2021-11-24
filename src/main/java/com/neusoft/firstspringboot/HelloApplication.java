package com.neusoft.firstspringboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: wudagai
 * @date: 2021/11/23 10:32
 * @description:
 * springboot启动类
 * 1. @SpringBootApplication注解指定该类为SpringBoot的程序入口类。
 * 2. SpringBoot项目的Bean默认装配规则是：根据入口类所在包位置从上往下扫描。
 * 例如：如果DemoApplication类所在的包为：com.neusoft.demo；那么就会自动扫描com.neusoft.demo 包及其所有子包，否则不会被扫描！
 * 所以，应将SpringBoot的程序入口类放到mapper、service所在包的上级。
 * 3. SpringApplication类中的run方法会对当前SpringBoot工程进程初始化创建。
 */
@SpringBootApplication//@SpringBootApplication注解指定该类为SpringBoot的程序入口类
public class HelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class,args);
    }
}
