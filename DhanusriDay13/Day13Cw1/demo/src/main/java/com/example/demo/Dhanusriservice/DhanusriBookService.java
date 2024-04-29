package com.example.demo.Dhanusriservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dhanusrimodel.DhanusriAuthor;
import com.example.demo.Dhanusrimodel.DhanusriBook;
import com.example.demo.Dhanusrirepository.DhanusriAuthorRepository;
import com.example.demo.Dhanusrirepository.DhanusriBookRepository;
@Service
public class DhanusriBookService {
    @Autowired
    private DhanusriBookRepository bookRepository;
@Autowired
private DhanusriAuthorRepository authorRepository;
    public DhanusriBook saveBook(Long authorId, DhanusriBook book) {
        DhanusriAuthor author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            book.setAuthor(author);
            author.getBooks().add(book);
            return bookRepository.save(book);
        }
        return null;
    }

    public DhanusriBook getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

