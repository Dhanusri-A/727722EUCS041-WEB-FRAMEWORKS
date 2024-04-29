package com.example.demo.Dhanusricontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dhanusrimodel.DhanusriAuthor;
import com.example.demo.Dhanusrimodel.DhanusriBook;
import com.example.demo.Dhanusriservice.DhanusriAuthorService;
import com.example.demo.Dhanusriservice.DhanusriBookService;

@RestController
public class DhanusriAuthorController {
    @Autowired
    private DhanusriAuthorService authorService;
@Autowired
private DhanusriBookService bookService;
    @PostMapping("/author")
    public ResponseEntity<DhanusriAuthor> createAuthor(@RequestBody DhanusriAuthor author) {
        DhanusriAuthor savedAuthor = authorService.saveAuthor(author);
        return new ResponseEntity<>(savedAuthor, HttpStatus.CREATED);
    }

    @PostMapping("/book/author/{authorId}")
    public ResponseEntity<DhanusriBook> createBookForAuthor(@PathVariable Long authorId, @RequestBody DhanusriBook book) {
        DhanusriBook savedBook = bookService.saveBook(authorId, book);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

    @GetMapping("/author/{authorId}")
    public ResponseEntity<DhanusriAuthor> getAuthorById(@PathVariable Long authorId) {
        DhanusriAuthor author = authorService.getAuthorById(authorId);
        if (author != null) {
            return new ResponseEntity<>(author, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/author")
    public ResponseEntity<List<DhanusriAuthor>> getAllAuthors() {
        List<DhanusriAuthor> authors = authorService.getAllAuthors();
        return new ResponseEntity<>(authors, HttpStatus.OK);
    }

    @PutMapping("/author/{authorId}")
    public ResponseEntity<DhanusriAuthor> updateAuthor(@PathVariable Long authorId, @RequestBody DhanusriAuthor author) {
        DhanusriAuthor updatedAuthor = authorService.updateAuthor(authorId, author);
        if (updatedAuthor != null) {
            return new ResponseEntity<>(updatedAuthor, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @DeleteMapping("/book/{bookId}")
    public ResponseEntity<String> deleteBook(@PathVariable Long bookId) {
        bookService.deleteBook(bookId);
        return new ResponseEntity<>("Book deleted successfully", HttpStatus.OK);
    }
}
