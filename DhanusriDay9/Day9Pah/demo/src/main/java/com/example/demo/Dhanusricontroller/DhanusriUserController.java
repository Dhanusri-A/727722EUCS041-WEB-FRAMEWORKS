package com.example.demo.Dhanusricontroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dhanusrimodel.DhanusriUser;
import com.example.demo.Dhanusriservice.DhanusriUserService;


@RestController
@RequestMapping("/api")
public class DhanusriUserController {
    
    @Autowired
    private DhanusriUserService userService;

    @PostMapping("/user")
    public ResponseEntity<DhanusriUser> post(@RequestBody DhanusriUser user)
    {
        if(userService.postUser(user))
        {
            return new ResponseEntity<DhanusriUser>(user, HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<DhanusriUser> getById(@PathVariable int userId)
    {
        DhanusriUser user = userService.getById(userId);
        if(user == null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<DhanusriUser>(user, HttpStatus.OK);
        }
    }

    @GetMapping("/user/byName/{userName}")
    public ResponseEntity<DhanusriUser> getByUserName(@PathVariable String userName)
    {
        DhanusriUser user = userService.getByUserName(userName);
        if(user == null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<DhanusriUser>(user, HttpStatus.OK);
        }
    }
}

