package com.gestion.EPS.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.EPS.modelos.Especialista;


@Repository
public interface EspecialistaRepositorio extends JpaRepository<Especialista, Long> {


}
