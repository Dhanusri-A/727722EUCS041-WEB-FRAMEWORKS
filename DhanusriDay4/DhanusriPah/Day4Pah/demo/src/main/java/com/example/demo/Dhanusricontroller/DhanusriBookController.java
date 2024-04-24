package com.example.demo.Dhanusricontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dhanusrimodel.DhanusriBook;
import com.example.demo.Dhanusriservice.DhanusriBookService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class DhanusriBookController {

     @Autowired
     public DhanusriBookService bookService;

     List<DhanusriBook> list;

     @PostMapping("/api/book")
     public ResponseEntity<DhanusriBook> postMethodName(@RequestBody DhanusriBook entity) {

          DhanusriBook inst = bookService.SaveEntity(entity);

          return new ResponseEntity<DhanusriBook>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/book")
     public ResponseEntity<List<DhanusriBook>> getMethodName() {

          List<DhanusriBook> show = bookService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<DhanusriBook>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<DhanusriBook>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/book/{bookId}")
     public DhanusriBook getMethodName(@PathVariable int bookId) {

          DhanusriBook getid = bookService.getBookById(bookId);
          return getid;
     }

}

