package com.segmentfault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@SpringBootApplication
public class SpringBootLesson1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLesson1Application.class, args);
    }

    @RequestMapping("/rest")
    @ResponseBody
    public Map<String,Object> rest(){
        Map<String,Object> data = new HashMap<>();
        data.put("1","A");
        data.put("4","D");
        return data;
    }
}
