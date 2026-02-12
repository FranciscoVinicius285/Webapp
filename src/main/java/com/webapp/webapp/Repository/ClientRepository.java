package com.webapp.webapp.Repository;

import com.webapp.webapp.Models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    public Client findByEmail(String email);
}
