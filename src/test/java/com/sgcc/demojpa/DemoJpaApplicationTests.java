//package com.sgcc.demojpa;
//
//import java.util.List;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.sgcc.demojpa.DemoJpaApplication;
//import com.sgcc.demojpa.domain.User;
//import com.sgcc.demojpa.services.UserRepository;
//
//@SpringBootTest(classes = DemoJpaApplication.class)
//@RunWith(SpringRunner.class)
//public class DemoJpaApplicationTests {
//
//
//        @Autowired
//        private UserRepository userRepository;
//
//        @Autowired
////	private RedisTemplate<String, String> redisTemplate;
//        private RedisTemplate redisTemplate;
//
//        @Test
//        public void contextLoads() {
//            String userListData = "";
//            Object object = redisTemplate.boundValueOps("DATA-JPA5").get();
//            if(null == object ){//去数据库获取数据
//                List<User> findAll = userRepository.findAll();
//                //转换成json格式字符串
//                ObjectMapper om = new ObjectMapper();
//                try {
//                    userListData = om.writeValueAsString(findAll);
//                } catch (JsonProcessingException e) {
//                    e.printStackTrace();
//                }
//                redisTemplate.boundValueOps("DATA-JPA5").set(userListData);
//                System.out.println("===================  数据库获取数据  DATA-JPA5 ===================");
//            }else{ //redis 获取数据
//                userListData = object.toString();
//                System.out.println("===================  Redis获取数据  DATA-JPA5 ===================");
//            }
//
//            System.out.println(" DATA-JPA  : " + userListData);
//
//        }
//
//    }