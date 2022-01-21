package com.example.crudopsngback.resource;

import com.example.crudopsngback.model.Server;
import com.example.crudopsngback.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @GetMapping("/ipaAddress/{ipaAddress}/name/{name}")
    public Server getServer(@PathVariable String ipaAddress,@PathVariable String name){
        return serverService.findServer(ipaAddress,name);
    }
    @GetMapping("/servers/")
    public List<Server> getServers(){
        return serverService.getServers();
    }
    @GetMapping("/id/{id}/")
    public Optional<Server> getServerById(@PathVariable Long id){
        return serverService.findServerById(id);
    }

}
