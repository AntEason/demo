package com.demo.service.impl;

import com.demo.service.TestService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    @Cacheable(value = "test",key="#i")
    public String cacheFunction(int i){
        try {
            long time = 2000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        return "success"+ i;
    }
}
