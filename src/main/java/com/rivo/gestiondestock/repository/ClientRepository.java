package com.rivo.gestiondestock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rivo.gestiondestock.model.Client;

public interface ClientRepository extends JpaRepository<Integer, Client>{

}