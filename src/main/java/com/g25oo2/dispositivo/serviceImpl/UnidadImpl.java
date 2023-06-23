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
		List<Unidad> lstActivos = lstDispositivos.stream()
				.filter(disp -> disp.getEstado() != 0)
				.collect(Collectors.toList());
		return lstActivos;
	}

	@Override
	public void guardar(UtilCreateObject body) throws Exception {
		Optional<Unidad> aux = daoUnidad.findById(body.getNombreUnidad());
		if (aux.isPresent()) {
			throw new Exception("Esta unidad ya existe");
		} else {
			Unidad unidad = new Unidad();

			// body.getNombreUnidad(),1,dispositivoService.traer(body.getIdDispositivo())

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

}
