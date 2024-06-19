package com.rivo.gestiondestock.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rivo.gestiondestock.model.Utilisateur;

public interface UtilisisateurRepository extends JpaRepository<Integer, Utilisateur>{
	
	// JPQL query
	  @Query(value = "select u from Utilisateur u where u.email = :email")
	  Optional<Utilisateur> findUtilisateurByEmail(@Param("email") String email);

}
