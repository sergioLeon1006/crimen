package com.crimen.crimen.repository;


import com.crimen.crimen.model.Artefactos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtefactosRepository extends JpaRepository<Artefactos,Integer>{
}
