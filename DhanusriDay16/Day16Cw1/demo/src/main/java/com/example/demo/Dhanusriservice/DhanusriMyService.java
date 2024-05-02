package com.example.demo.Dhanusriservice;

import org.springframework.stereotype.Service;

@Service
public class DhanusriMyService {

    public void doSomething() {
        System.out.println("Around advice: Executing after doSomething()");
    }
}
