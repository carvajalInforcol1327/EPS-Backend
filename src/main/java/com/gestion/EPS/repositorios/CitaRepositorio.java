package com.gestion.EPS.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.EPS.modelos.Cita;


@Repository
public interface CitaRepositorio extends JpaRepository<Cita, Long> {

}
