package com.hdl.Controller;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;

/**
 * @author hdl
 * @create 2019/12/4-19:22
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody      //必须加这个注解,因为你还没有相应的页面,所以想直接将返回结果显示在页面上,
    public String hello(){
        return "hello Word!";

    }
}
