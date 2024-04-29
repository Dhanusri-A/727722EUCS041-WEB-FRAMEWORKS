package com.example.demo.Dhanusriservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dhanusrimodel.DhanusriAuthor;
import com.example.demo.Dhanusrirepository.DhanusriAuthorRepository;

@Service
public class DhanusriAuthorService {
    @Autowired
    private DhanusriAuthorRepository authorRepository;

    public DhanusriAuthor saveAuthor(DhanusriAuthor author) {
        return authorRepository.save(author);
    }

    public DhanusriAuthor getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<DhanusriAuthor> getAllAuthors() {
        return authorRepository.findAll();
    }

    public DhanusriAuthor updateAuthor(Long id, DhanusriAuthor author) {
        DhanusriAuthor existingAuthor = authorRepository.findById(id).orElse(null);
        if (existingAuthor != null) {
            existingAuthor.setEmail(author.getEmail());
            existingAuthor.setPhoneNumber(author.getPhoneNumber());
            existingAuthor.setAddress(author.getAddress());
            return authorRepository.save(existingAuthor);
        }
        return null;
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
