package com.g25oo2.dispositivo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.g25oo2.dispositivo.entity.Unidad;
import com.g25oo2.dispositivo.util.UtilCreateObject;

@Service
public interface UnidadService {

	public List<Unidad> traer();

	public void eliminar(String id) throws Exception;

	public void modificar(Unidad unidad, String id) throws Exception;

	public void guardar(UtilCreateObject body) throws Exception;

	public Unidad traer(String idUnidad) throws Exception;
}
