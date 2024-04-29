package com.example.demo.Dhanusriservice;

import com.example.demo.Dhanusrimodel.DhanusriBook;
import com.example.demo.Dhanusrirepository.DhanusriBookRepo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DhanusriBookService {
    private final DhanusriBookRepo bookRepo;

    public DhanusriBookService(DhanusriBookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public DhanusriBook createBook(DhanusriBook Book) {
        return bookRepo.save(Book);
    }
    public List<DhanusriBook> getAllBooks() {
        return bookRepo.findAll();
    }
    public DhanusriBook getBookById(Long id) {
        return bookRepo.findById(id).orElse(null);
    }
    public DhanusriBook updateBookById(Long id,DhanusriBook book){
        DhanusriBook b = bookRepo.findById(id).orElse(null);
        if(b!=null){
            b.setAuthor(book.getAuthor());
            b.setAvailableCopies(book.getAvailableCopies());
            b.setTitle(book.getTitle());
            b.setTotalCopies(book.getTotalCopies());
            bookRepo.save(b);
        }
        return b;
    }
}
