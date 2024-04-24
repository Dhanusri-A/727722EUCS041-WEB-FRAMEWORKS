package com.example.demo.Dhanusricontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dhanusrimodel.DhanusriPerson;
import com.example.demo.Dhanusriservice.DhanusriPersonService;

import java.util.*;
@RestController
public class DhanusriPersonController {
    @Autowired
    private DhanusriPersonService ser;

    @PostMapping("/person")
    public ResponseEntity<DhanusriPerson> post(@RequestBody DhanusriPerson person) {
        if (ser.post(person)) {
            return new ResponseEntity<>(person, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/person/findByLastnameNot")
    public ResponseEntity<List<DhanusriPerson>> getAll(@RequestParam String lastname) {
        List<DhanusriPerson> li = ser.start(lastname);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/person/findByAgeNotIn")
    public ResponseEntity<List<DhanusriPerson>> getbyAge(@RequestParam List<Integer> ages) {
        List<DhanusriPerson> li = ser.end(ages);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

