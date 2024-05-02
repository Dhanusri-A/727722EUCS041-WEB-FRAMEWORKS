package com.example.demo.Dhanusriservice;

import com.example.demo.Dhanusrimodel.DhanusriPlayer;
import com.example.demo.Dhanusrirepository.DhanusriPlayerRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DhanusriPlayerService {

    @Autowired
    private DhanusriPlayerRepo playerRepo;

    public List<DhanusriPlayer> getAllPlayers() {
        return playerRepo.findAll();
    }

    public DhanusriPlayer getPlayerById(int id) {
        return playerRepo.findById(id).orElse(null);
    }

    public DhanusriPlayer addPlayer(DhanusriPlayer player) {
        return playerRepo.save(player);
    }
}
