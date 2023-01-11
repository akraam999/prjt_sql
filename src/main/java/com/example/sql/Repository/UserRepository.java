package com.example.sql.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sql.Client.Client;

@Repository
public interface UserRepository extends JpaRepository<Client,Long>{

}
