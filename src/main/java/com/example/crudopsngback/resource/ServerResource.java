package com.example.crudopsngback.resource;

import com.example.crudopsngback.model.Server;
import com.example.crudopsngback.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server")
public class ServerResource {

    @Autowired
    private ServerService serverService;

    @PostMapping("/")
    public Server saveS(Server server){
        return serverService.saveServer(server);
    }
    @GetMapping("/ipaAddress/{ipaAddress}/")
    public Server getServer(String ipaAddress,String name){
        return serverService.findServer(ipaAddress,name);
    }
}
