package com.example.controller;

import com.example.utils.IMOOCJSONResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;


@ApiIgnore
@RestController
@RequestMapping("redis")
public class RedisController {

    @Autowired
    private RedisTemplate redisTemplate;

    final static Logger logger = LoggerFactory.getLogger(RedisController.class);

    @GetMapping("/set")
    public Object hello() {

        redisTemplate.opsForValue().set("111", "232323");
        return IMOOCJSONResult.ok("111");
    }

    @GetMapping("/get")
    public Object get() {
        String s = (String) redisTemplate.opsForValue().get("111");
        return IMOOCJSONResult.ok(s);
    }
}
