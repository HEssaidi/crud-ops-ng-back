package com.example.crudopsngback.resource;

import com.example.crudopsngback.model.Server;
import com.example.crudopsngback.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/server")
@CrossOrigin(origins = "http://localhost:4200")
public class ServerResource {

    @Autowired
    private ServerService serverService;

    @PostMapping("/")
    public Server saveS(@RequestBody Server server){
        return serverService.saveServer(server);
    }
    @GetMapping("/ipaAddress/{ipaAddress}/")
    public Server getServer(String ipaAddress,String name){
        return serverService.findServer(ipaAddress,name);
    }
    @GetMapping("/servers/")
    public List<Server> getServers(){
        return serverService.getServers();
    }
}
