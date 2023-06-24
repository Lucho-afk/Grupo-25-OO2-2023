package com.g25oo2.dispositivo.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.g25oo2.dispositivo.entity.Dispositivo;
import com.g25oo2.dispositivo.entity.Unidad;
import com.g25oo2.dispositivo.repository.DispositivoDao;
import com.g25oo2.dispositivo.repository.UnidadDao;
import com.g25oo2.dispositivo.service.DispositivoService;
import com.g25oo2.dispositivo.service.UnidadService;
import com.g25oo2.dispositivo.util.UtilCreateObject;

@Service
public class UnidadImpl implements UnidadService {
	@Autowired
	UnidadDao daoUnidad;

	@Autowired
	DispositivoService dispositivoService;

	public List<Unidad> traer() {
		List<Unidad> lstDispositivos = daoUnidad.findAll();
		List<Unidad> lstActivos = lstDispositivos.stream().filter(disp -> disp.getEstado() != 0)
				.collect(Collectors.toList());
		return lstActivos;
	}

	@Override
	public void guardar(UtilCreateObject body) throws Exception {
		Optional<Unidad> aux = daoUnidad.findById(body.getNombreUnidad());
		Unidad unidad = new Unidad();
		if (aux.isPresent()) {
			if (aux.get().getEstado() == 0) {
				unidad.setEstado(1);
				unidad.setId(aux.get().getId());
				unidad.setDispositivo(aux.get().getDispositivo());
//				unidad.setEventos(aux.get().getEventos()); quitar este comentario mata la lista de unidades en el front
				System.out.println(aux.get().toString());
				daoUnidad.save(unidad);
			} else {
				throw new Exception("Esta unidad ya existe");
			}
		} else {
			unidad.setDispositivo(dispositivoService.traer(body.getIdDispositivo()));
			unidad.setEstado(1);
			unidad.setId(body.getNombreUnidad());
			daoUnidad.save(unidad);
		}
	}

	public void eliminar(String id) throws Exception {
		Optional<Unidad> aux = daoUnidad.findById(id);
		if (aux.isPresent()) {
			Unidad Unidad = aux.get();
			Unidad.setEstado(0);
			daoUnidad.save(Unidad);
		} else {
			throw new Exception("No existe el Unidad a eliminar");
		}
	}

	@Override
	public void modificar(Unidad unidad, String id) throws Exception {
		Optional<Unidad> aux = daoUnidad.findById(id);
		if (aux.isPresent()) {
			Unidad unidadAux = aux.get();
			if (unidadAux.equals(unidad)) {
				throw new Exception("el unidad que se quiere ingresar es igual al de la base de datos");
			} else {
				daoUnidad.save(unidad);
			}
		} else {
			throw new Exception("el unidad que se quiere modificar no existe en la base de datos");
		}

	}

	public Unidad traer(String idUnidad) throws Exception {
		Optional<Unidad> aux = daoUnidad.findById(idUnidad);
		Unidad unidad = new Unidad();
		if (aux.isPresent()) {
			unidad = aux.get();
		} else {
			throw new Exception("la unidad no existe");
		}
		return unidad;
	}

}
