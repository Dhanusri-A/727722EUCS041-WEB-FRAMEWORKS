package com.example.demo.Dhanusriservice;

import org.springframework.stereotype.Service;

@Service
public class DhanusriMyService {

    public String process(String input) {
        System.out.println("Processing: " + input);
        return "Processed: " + input;
    }
}

