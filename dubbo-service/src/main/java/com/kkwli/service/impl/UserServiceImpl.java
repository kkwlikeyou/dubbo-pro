package com.kkwli.service.impl;

import com.kkwli.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello() {
        return "Hello Dubbo";
    }
}
