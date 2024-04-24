package com.example.demo.Dhanusriservice;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Dhanusrimodel.DhanusriLanguage;
import com.example.demo.Dhanusrirepository.DhanusriLanguageRepo;


@Service
public class DhanusriLanguageService {
    public DhanusriLanguageRepo languageRepo;
    public DhanusriLanguageService(DhanusriLanguageRepo languageRepo)
    {
        this.languageRepo = languageRepo;
    }
    public boolean postLanguage(DhanusriLanguage language)
    {
        try{

            languageRepo.save(language);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<DhanusriLanguage> getSortedLanguages(String field)
    {
        return languageRepo.findAll(Sort.by(field));
    }
    public List<DhanusriLanguage> getPaginationLanguages(int offset,int size)
    {
        return languageRepo.findAll(PageRequest.of(offset, size)).getContent();
        // return childrenRepo.findAll(Pageable.ofSize(size).withPage(offset)).getContent();
                        
    }
    public List<DhanusriLanguage> getSortedPaginationLanguages(int offset,int size,String field)
    {
        return languageRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
}

