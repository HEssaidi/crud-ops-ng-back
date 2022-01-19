package com.example.crudopsngback.repo;

import com.example.crudopsngback.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServerRepo extends JpaRepository<Server, Long> {
    public Server findByIpAddressAndName(String ipAddress, String name);
}
