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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dhanusrimodel.DhanusriDoor;
import com.example.demo.Dhanusriservice.DhanusriDoorService;



@RestController
@RequestMapping("/api")
public class DhanusriDoorController {

    @Autowired
    public DhanusriDoorService doorService;

    @PostMapping("/door")
    public ResponseEntity<DhanusriDoor> postData(@RequestBody DhanusriDoor door) {
        DhanusriDoor doorData = doorService.postData(door);
        if (doorData != null) {
            return new ResponseEntity<>(doorData, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping("door/bycolor/{color}")
    public ResponseEntity<List<DhanusriDoor>> getBycolor(@PathVariable String color) {
        List<DhanusriDoor> door = doorService.getBycolor(color);
        if (door != null) {
            return new ResponseEntity<>(door, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @PutMapping("door/{doorid}")
    public ResponseEntity<DhanusriDoor> updateDetailResponseEntity(@PathVariable int doorid, @RequestBody DhanusriDoor door) {
        DhanusriDoor doorData = doorService.updateDetail(doorid, door);
        if (doorData != null) {
            return new ResponseEntity<>(doorData, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("door/{doorid}")
    public ResponseEntity<String> deleteDoor(@PathVariable int doorid) {
        if (doorService.deleteDoor(doorid)) {
            return new ResponseEntity<>("Door deleted successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/door/bydoortype/{doortype}")
    public ResponseEntity<List<DhanusriDoor>> getByDoor(@PathVariable String doortype) {
        List<DhanusriDoor> door = doorService.getByDoorType(doortype);
        if (door != null) {
            return new ResponseEntity<>(door, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/door")
    public ResponseEntity<List<DhanusriDoor>> getAllDetails() {
        List<DhanusriDoor> door = doorService.getAllDetails();
        if (door != null) {

            return new ResponseEntity<>(door, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

    @GetMapping("/door/{doorid}")
    public ResponseEntity<DhanusriDoor> getDetailsById(@PathVariable int doorid) {
        DhanusriDoor door = doorService.getDetailsById(doorid);
        if (door != null) {
            return new ResponseEntity<>(door, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}