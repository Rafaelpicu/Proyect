package edu.es.eoi.marketplace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.marketplace.dto.ArticuloDto;
import edu.es.eoi.marketplace.entity.Articulo;
import edu.es.eoi.marketplace.repository.ArticuloRepository;

@Service
public  class ArticuloServiceImpl implements ArticuloService {

	@Autowired
	ArticuloRepository articuloRepo;
	
	public ArticuloDto entityToDto(Articulo entity) {

		ArticuloDto dto = new ArticuloDto();
		dto.setNombre(entity.getNombre());
		dto.setPrecio(entity.getPrecio());
		dto.setStock(entity.getStock());
		return dto;
	}
	
	public Articulo dtoToEntity(ArticuloDto dto) {

		Articulo articulo = new Articulo();
		articulo.setNombre(dto.getNombre());
		articulo.setPrecio(dto.getPrecio());
		articulo.setStock(dto.getStock());
		return articulo;
	}

	@Override
	public List<ArticuloDto> findByNombreParcial(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	@Override
	public Articulo updateArticulo(ArticuloDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public Articulo getArticulo(int id_ar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArticuloDto findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Articulo findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArticuloDto createArticuloDto(ArticuloDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Articulo createArticulo(Articulo articulo) {
		// TODO Auto-generated method stub
		return null;
	}
	
}