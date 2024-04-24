package com.example.demo.Dhanusriservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dhanusrimodel.DhanusriBook;
import com.example.demo.Dhanusrirepository.DhanusriBookRepo;


@Service
public class DhanusriBookService {

     @Autowired
     private DhanusriBookRepo bookRepo;

     public DhanusriBook SaveEntity(DhanusriBook entity) {
          // TODO Auto-generated method stub
          throw new UnsupportedOperationException("Unimplemented method 'SaveEntity'");
     }

     public List<DhanusriBook> getDetails() {
          // TODO Auto-generated method stub
          throw new UnsupportedOperationException("Unimplemented method 'getDetails'");
     }

     public DhanusriBook getBookById(int bookId) {
          // TODO Auto-generated method stub
          throw new UnsupportedOperationException("Unimplemented method 'getBookById'");
     }

}

