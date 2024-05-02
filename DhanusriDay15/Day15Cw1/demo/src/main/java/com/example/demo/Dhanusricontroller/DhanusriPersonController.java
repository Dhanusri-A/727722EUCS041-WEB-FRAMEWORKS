package com.example.demo.Dhanusricontroller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Dhanusrimodel.DhanusriPerson;
import com.example.demo.Dhanusriservice.DhanusriPersonService;

@RestController
public class DhanusriPersonController {
    @Autowired
    private DhanusriPersonService service;

    private static final Logger logger = LoggerFactory.getLogger(DhanusriPersonController.class);

    @PostMapping("/persons")
    public ResponseEntity<DhanusriPerson> create(@RequestBody DhanusriPerson person) {
        logger.info("POST Request received for /persons ");
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createPerson(person));
    }

    @GetMapping("/persons")
    public ResponseEntity<List<DhanusriPerson>> getallpersons() {
        logger.debug("GET Request received for /persons");
        return ResponseEntity.ok(service.getAllPersons());
    }
}


