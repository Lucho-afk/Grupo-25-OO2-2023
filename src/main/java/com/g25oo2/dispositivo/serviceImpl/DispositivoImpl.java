package com.g25oo2.dispositivo.serviceImpl;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.g25oo2.dispositivo.entity.Dispositivo;
import com.g25oo2.dispositivo.repository.DispositivoDao;
import com.g25oo2.dispositivo.service.DispositivoService;

@Service
public class DispositivoImpl implements DispositivoService {
	@Autowired
	DispositivoDao daoDispositivo;

	public List<Dispositivo> traer() {
		List<Dispositivo> lstDispositivos = daoDispositivo.findAll();
		List<Dispositivo> lstActivos = lstDispositivos.stream().filter(disp -> disp.getEstado() != 0)
				.collect(Collectors.toList());
		return lstActivos;
	}

	public void eliminar(int id) throws Exception {
		Optional<Dispositivo> aux = daoDispositivo.findById(id);
		if (aux.isPresent()) {
			Dispositivo dispositivo = aux.get();
			dispositivo.setEstado(0);
			daoDispositivo.save(dispositivo);
		} else {
			throw new Exception("No existe el dispositivo a eliminar");
		}

	}

	@Override
	public void modificar(Dispositivo dispositivo, int id) throws Exception {
		Optional<Dispositivo> aux = daoDispositivo.findById(id);
		if (aux.isPresent()) {
			Dispositivo dispositivoAux = aux.get();
			if (dispositivoAux.equals(dispositivo)) {
				throw new Exception("el dispositivo que se quiere ingresar es igual al de la base de datos");
			} else {
				daoDispositivo.save(dispositivo);
			}
		} else {
			throw new Exception("el dispositivo que se quiere modificar no existe en la base de datos");
		}

	}

	@Override
	public Dispositivo traer(int id) throws Exception {
		Optional<Dispositivo> aux = daoDispositivo.findById(id);
		Dispositivo dispositivoAux = null;
		if (aux.isPresent()) {
			dispositivoAux = aux.get();
		} else {
			throw new Exception("El dispositivo solicitado no existe");
		}
		return dispositivoAux;
	}

}
