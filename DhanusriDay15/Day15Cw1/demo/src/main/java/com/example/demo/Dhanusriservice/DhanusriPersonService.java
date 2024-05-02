package com.example.demo.Dhanusriservice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Dhanusrimodel.DhanusriPerson;
import com.example.demo.Dhanusrirepository.DhanusriPersonRepo;

@Service
public class DhanusriPersonService {
    @Autowired
    private DhanusriPersonRepo repo;

    public DhanusriPerson createPerson(DhanusriPerson person) {
        return repo.save(person);
    }

    public List<DhanusriPerson> getAllPersons() {
        return repo.findAll();
    }
}
