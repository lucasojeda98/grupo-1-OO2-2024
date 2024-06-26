package com.unla.grupo1.services;

import java.util.List;
import java.util.Optional;

import com.unla.grupo1.dtos.ProveedorDTO;
import com.unla.grupo1.entities.Proveedor;

public interface IProveedorService {

	public List<ProveedorDTO> getAll();
	public Optional<Proveedor> getById(int id);
	public ProveedorDTO insertOrUpdate(ProveedorDTO proveedorDTO);
	public void removeById(int id);
}
