package com.g25oo2.dispositivo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.g25oo2.dispositivo.entity.Evento;

@Repository
public interface EventoDao extends  JpaRepository<Evento, Integer> {

}
