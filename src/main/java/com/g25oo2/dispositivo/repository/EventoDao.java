package com.g25oo2.dispositivo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.g25oo2.dispositivo.entity.Evento;

public interface EventoDao extends  JpaRepository<Evento, Integer> {

}
