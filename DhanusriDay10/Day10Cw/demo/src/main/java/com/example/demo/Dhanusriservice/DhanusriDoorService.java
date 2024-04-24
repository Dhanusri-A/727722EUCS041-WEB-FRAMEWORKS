package com.example.demo.Dhanusriservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dhanusrimodel.DhanusriDoor;
import com.example.demo.Dhanusrirepository.DhanusriDoorRepo;



@Service
public class DhanusriDoorService {
    @Autowired
    private DhanusriDoorRepo doorRepo;

    public DhanusriDoor postData(DhanusriDoor door) {
        return doorRepo.save(door);
    }

    public List<DhanusriDoor> getBycolor(String color) {
        return doorRepo.findByColor(color);
    }

    public DhanusriDoor updateDetail(int doorid, DhanusriDoor door) {
        return doorRepo.save(door);
    }

    public boolean deleteDoor(int doorid) {
        doorRepo.deleteById(doorid);
        return true;
    }

    public List<DhanusriDoor> getByDoorType(String doortype) {
        return doorRepo.findByDoorType(doortype);
    }

    public List<DhanusriDoor> getAllDetails() {

        return doorRepo.findAll();
    }

    public DhanusriDoor getDetailsById(int doorid) {
        return doorRepo.findById(doorid).orElse(null);
    }

}