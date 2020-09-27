package com.atguigu.springboot;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.Set;
@SpringBootTest
class SpringbootSsmXmlApplicationTests {
    //整合Redis之后，可以直接自动装配StringRedisTemplate或RedisTemplate模板类的对象操作redis
    //StringRedisTemplate用来操作redis中5大数据类型存储字符串值的操作
    @Autowired
    StringRedisTemplate stringRedisTemplate; //使用多
    //RedisTemplate用来操作对象序列化后存到redis中的操作
    @Autowired
    RedisTemplate<Object,Object> redisTemplate;

    @Test
    void contextLoads() {
        Set<String> keys = stringRedisTemplate.keys("*");
        System.out.println("keys = " + keys);

    }




    @Test
    public void testStringRt(){
//        TAdmin admin = new TAdmin(1, "aa", "123456", "adasd", "@12.com", "2020-1-1");
//        //将一个对象存到redis中[必须将对象转为json字符串]
//        //opsForValue(): 以String类型存储数据
//        String adminStr = new Gson().toJson(admin);
//        stringRedisTemplate.opsForValue().set("admin:"+admin.getId() , adminStr , 10 , TimeUnit.HOURS);
//        //将redis中的对象读取回来
//        //获取过期时间
//        Long expire = stringRedisTemplate.getExpire("admin:" + admin.getId(), TimeUnit.MINUTES);
//
//        String adminJsonStr = stringRedisTemplate.opsForValue().get("admin:" + admin.getId());
//        //将json字符串转为java中的对象
//        TAdmin fromJson = new Gson().fromJson(adminJsonStr, TAdmin.class);
//        System.out.println("fromJson = " + fromJson);

        //删除redis中对象数据
        Boolean delete = stringRedisTemplate.delete("admin:" + 1);
        System.out.println(delete?"删除成功":"删除失败");

    }


}
