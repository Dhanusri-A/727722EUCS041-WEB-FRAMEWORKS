package com.example.demo.Dhanusriservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Dhanusrimodel.DhanusriLanguage;
import com.example.demo.Dhanusrirepository.DhanusriLanguageRepo;



@Service
public class DhanusriLanguageService {
    private DhanusriLanguageRepo languageRepo;
    public DhanusriLanguageService(DhanusriLanguageRepo languageRepo)
    {
        this.languageRepo=languageRepo;
    }
    public boolean saveLanguage(DhanusriLanguage language)
    {
        try
        {
            languageRepo.save(language);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<DhanusriLanguage> getLanguages()
    {
        return languageRepo.findAll();
    }
    public boolean updateLanguage(int id,DhanusriLanguage language)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        try{
            languageRepo.save(language);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteLanguage(int id)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        languageRepo.deleteById(id);
        return true;
        
    }
    public DhanusriLanguage getLanguageById(int id)
    {
        return languageRepo.findById(id).orElse(null);
    }

}
