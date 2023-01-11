package com.example.sql.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sql.Client.Vehicule;

@Repository
public interface VehiculeRepository extends JpaRepository<Vehicule,Long>{

}
