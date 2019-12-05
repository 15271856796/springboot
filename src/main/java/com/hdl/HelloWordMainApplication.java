package com.hdl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hdl
 * @create 2019/12/4-18:37
 */

/**
 * @SpringBootApplication 来标注一个主程序类,说明这是一个SpringBoot应用
 */

@SpringBootApplication
public class HelloWordMainApplication {
    public static void main(String[] args) {
        //spring将应用启动起来
        SpringApplication.run(HelloWordMainApplication.class,args);
        System.out.print("ok");
    }

}
