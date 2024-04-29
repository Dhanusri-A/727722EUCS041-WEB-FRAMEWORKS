package com.example.demo.Dhanusricontroller;

import com.example.demo.Dhanusrimodel.DhanusriBook;
import com.example.demo.Dhanusriservice.DhanusriBookService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class DhanusriBookController {
    private final DhanusriBookService bookService;

    public DhanusriBookController(DhanusriBookService BookService) {
        this.bookService = BookService;
    }

    @PostMapping
    public ResponseEntity<DhanusriBook> createBook(@RequestBody DhanusriBook Book) {
        DhanusriBook createdBook = bookService.createBook(Book);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdBook);
    }

    @GetMapping
    public ResponseEntity<List<DhanusriBook>> getAllBooks() {
        List<DhanusriBook> Books = bookService.getAllBooks();
        return ResponseEntity.ok(Books);
    }
    @PutMapping("/{bookId}")
    public DhanusriBook updateBookById(@PathVariable Long bookId,@RequestBody DhanusriBook book){
        DhanusriBook b = bookService.updateBookById(bookId, book);
        return b;
    }
    @GetMapping("/{bookId}")
    public DhanusriBook getBookById(@PathVariable Long bookId) {
        DhanusriBook book = bookService.getBookById(bookId);
        return book;
    }
}
