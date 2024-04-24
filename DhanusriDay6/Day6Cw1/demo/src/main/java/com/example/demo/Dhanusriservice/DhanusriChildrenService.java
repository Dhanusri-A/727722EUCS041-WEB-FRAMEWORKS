package com.example.demo.Dhanusriservice;

import java.util.List;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.Dhanusrimodel.DhanusriChildren;
import com.example.demo.Dhanusrirepository.DhanusriChildrenRepo;

@Service
public class DhanusriChildrenService {

     @Autowired
     public DhanusriChildrenRepo childrenRepo;

     public List<DhanusriChildren> sort(String field) {
          return childrenRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }

     public DhanusriChildren save(DhanusriChildren children) {
          return childrenRepo.save(children);

     }

     public List<DhanusriChildren> sortedPage(int offset, int pagesize, String field) {
          Page<DhanusriChildren> sortedPage = childrenRepo
                    .findAll(PageRequest.of(offset, pagesize, Sort.by(Sort.Direction.ASC, field)));
          return sortedPage.getContent();
     }

     public List<DhanusriChildren> pagination(int offset, int pagesize) {
          Page<DhanusriChildren> pages = childrenRepo.findAll(PageRequest.of(offset, pagesize));
          return pages.getContent();

     }

}
