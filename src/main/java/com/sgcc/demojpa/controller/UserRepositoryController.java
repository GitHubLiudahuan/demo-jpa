package com.sgcc.demojpa.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;
//import com.sgcc.demojpa.domain.User;
//import com.sgcc.demojpa.services.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
//import java.util.List;

@RestController
public class UserRepositoryController {

//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private RedisTemplate redisTemplate;

    @RequestMapping("/findAll")
    public String findAll(){
//        String msg = "";
//        Map map = new HashMap();
//        map.put("aaa","123");
//        map.put("BBB","456");
//        map.put("ccc","456");
//        map.put("ddd","456");
//        //转换成json格式字符串
//        ObjectMapper om = new ObjectMapper();
//        try {
//            msg = om.writeValueAsString(map);
//        } catch (JsonProcessingException e) {
//            msg =  "报错一场";
//            e.printStackTrace();
//        }

        return "123";
    }


//    @RequestMapping("/findAll")
//    public String findAll(){
//        String msg = "";
//        String userListData = "";
//        Object object = redisTemplate.boundValueOps("DATA-JPA5").get();
//        if(null == object ){//去数据库获取数据
//            List<User> findAll = userRepository.findAll();
//            //转换成json格式字符串
//            ObjectMapper om = new ObjectMapper();
//            try {
//                userListData = om.writeValueAsString(findAll);
//            } catch (JsonProcessingException e) {
//                e.printStackTrace();
//            }
//            redisTemplate.boundValueOps("DATA-JPA5").set(userListData);
//            System.out.println("===================  数据库获取数据  DATA-JPA5 ===================");
//        }else{ //redis 获取数据
//            userListData = object.toString();
//            System.out.println("===================  Redis获取数据  DATA-JPA5 ===================");
//        }
//        msg = userListData;
//        System.out.println(" DATA-JPA  : " + userListData);
//
//        return msg;
//    }
}
