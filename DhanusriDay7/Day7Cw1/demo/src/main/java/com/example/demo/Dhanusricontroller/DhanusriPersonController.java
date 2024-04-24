package com.example.demo.Dhanusricontroller;


import java.util.List;

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


@RestController
public class DhanusriPersonController {

     @Autowired
     public DhanusriPersonService personService;

     @PostMapping("/api/person")
     public ResponseEntity<DhanusriPerson> postMethodName(@RequestBody DhanusriPerson entity) {

          DhanusriPerson inst = personService.SaveEntity(entity);

          return new ResponseEntity<DhanusriPerson>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/person")
     public ResponseEntity<List<DhanusriPerson>> getMethodName() {

          List<DhanusriPerson> show = personService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<DhanusriPerson>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<DhanusriPerson>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/person/byAge")
     public List<DhanusriPerson> custom(@RequestParam int byAge) {
          return personService.findByAge(byAge);

     }
}
