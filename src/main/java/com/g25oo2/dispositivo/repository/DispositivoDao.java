package com.g25oo2.dispositivo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.g25oo2.dispositivo.entity.Dispositivo;

public interface DispositivoDao extends JpaRepository<Dispositivo, Integer>  {
	
	

}
