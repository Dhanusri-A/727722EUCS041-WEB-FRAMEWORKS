package com.example.demo.Dhanusriservice;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dhanusrimodel.DhanusriDoor;
import com.example.demo.Dhanusrirepository.DhanusriDoorRepo;


@Service
public class DhanusriDoorService {
    @Autowired
    private DhanusriDoorRepo rep;

    public boolean post(DhanusriDoor door)
    {
        try
        {
            rep.save(door);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<DhanusriDoor> getAll()
    {
        return rep.findAll();
    }

    public List<DhanusriDoor> getbyDoorId(int doorId)
    {
        return rep.findByDoorId(doorId);
    }
    public List<DhanusriDoor> getbyType(String type)
    {
        return rep.findByAccessType(type);
    }
    
}

