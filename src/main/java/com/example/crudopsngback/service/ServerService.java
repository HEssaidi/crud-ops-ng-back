package com.example.crudopsngback.service;

import com.example.crudopsngback.model.Server;
import com.example.crudopsngback.repo.ServerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServerService {

    @Autowired
    private ServerRepo serverRepo;

    public Server saveServer (Server server){
        return serverRepo.save(server);
    }
    public Server findServer (String ipAddress,String name){
        return serverRepo.findByIpAddressAndName(ipAddress,name);
    }
    public List<Server> getServers (){
        return serverRepo.findAll(PageRequest.of(0,3)).toList();
    }
}
