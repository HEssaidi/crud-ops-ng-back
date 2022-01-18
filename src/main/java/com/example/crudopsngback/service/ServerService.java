package com.example.crudopsngback.service;

import com.example.crudopsngback.model.Server;
import com.example.crudopsngback.repo.ServerRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class ServerService {

    @Autowired
    private ServerRepo serverRepo;

    public Server saveServer (Server server){
        return serverRepo.save(server);
    }
    public Server findServer (String ipAddress,String name){
        return serverRepo.findByIpAddressAndName(ipAddress,name);
    }
}
