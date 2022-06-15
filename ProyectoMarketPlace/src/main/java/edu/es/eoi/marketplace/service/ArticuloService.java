package edu.es.eoi.marketplace.service;

import java.util.List;
import org.springframework.stereotype.Service;

import edu.es.eoi.marketplace.dto.ArticuloDto;
import edu.es.eoi.marketplace.entity.Articulo;

@Service
public interface ArticuloService {

	public ArticuloDto entityToDto(Articulo entity);

	public Articulo dtoToEntity(ArticuloDto dto);

	public List<ArticuloDto> findByNombreParcial(String nombre);

	public ArticuloDto findById(int id);

	public Articulo updateArticulo(ArticuloDto dto);

	public ArticuloDto createArticuloDto(ArticuloDto dto);
	
	public Articulo createArticulo(Articulo articulo);

	public Articulo getArticulo(int id_ar);

	public Articulo findAll();
}
