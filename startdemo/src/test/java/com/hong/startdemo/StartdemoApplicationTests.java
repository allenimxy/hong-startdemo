package com.hong.startdemo;

import com.hong.startdemo.utils.RedisUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StartdemoApplicationTests {

    @Autowired
    public RedisUtils redisUtils;

    @Test
    public void contextLoads() {
    }

    @Test
    public void redisLoads() {
//        Map<String,Object> map = new HashMap<>();
//        map.put("e1","12a");
//        map.put("wa","e1");
//        redisUtils.set("a","bba");
//        Map<String,Object> map = new HashMap<>();
//        map.put("book","go4");
//        map.put("author","a");
//        redisUtils.hmset("aut",map);
            redisUtils.set("ajk",new Person("aalex",19));
        System.out.println(redisUtils.get("ajk").toString());
    }

    class Person {
        private String name;
        private Integer age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

}
