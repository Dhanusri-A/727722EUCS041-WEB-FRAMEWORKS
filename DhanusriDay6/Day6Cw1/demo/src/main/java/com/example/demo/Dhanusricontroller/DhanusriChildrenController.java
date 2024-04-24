package com.example.demo.Dhanusricontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
// import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dhanusrimodel.DhanusriChildren;
import com.example.demo.Dhanusriservice.DhanusriChildrenService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class DhanusriChildrenController {

     @Autowired
     public DhanusriChildrenService childrenService;

     @GetMapping("/api/children/sortBy/{babyFirstName}")
     public ResponseEntity<List<DhanusriChildren>> sort(@PathVariable String babyFirstName) {
          List<DhanusriChildren> child = childrenService.sort(babyFirstName);

          if (child.isEmpty()) {

               return new ResponseEntity<>(child, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<>(child, HttpStatus.OK);

     }

     // Pagination
     @GetMapping("api/children/{offset}/{pagesize}")
     public ResponseEntity<List<DhanusriChildren>> pagination(@PathVariable int offset, @PathVariable int pagesize) {
          List<DhanusriChildren> pages = childrenService.pagination(offset, pagesize);
          if (pages.isEmpty()) {
               return new ResponseEntity<List<DhanusriChildren>>(pages, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<DhanusriChildren>>(pages, HttpStatus.OK);
     }

     @GetMapping("/api/children/{offset}/{pagesize}/{field}")
     public ResponseEntity<List<DhanusriChildren>> sortedPage(@PathVariable int offset, @PathVariable int pagesize,
               @PathVariable String field) {
          List<DhanusriChildren> sortedPage = childrenService.sortedPage(offset, pagesize, field);
          if (sortedPage.isEmpty()) {

               return new ResponseEntity<>(sortedPage, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<>(sortedPage, HttpStatus.OK);
     }

     @PostMapping("/api/children")
     public ResponseEntity<DhanusriChildren> postDetails(@RequestBody DhanusriChildren children) {

          return new ResponseEntity<DhanusriChildren>(childrenService.save(children), HttpStatus.CREATED);
     }

}

