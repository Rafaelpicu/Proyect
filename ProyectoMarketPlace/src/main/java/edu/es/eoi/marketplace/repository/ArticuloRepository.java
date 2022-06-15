package edu.es.eoi.marketplace.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.es.eoi.marketplace.entity.Articulo;
@Repository
public interface ArticuloRepository extends JpaRepository <Articulo, Integer> {

	public List <Articulo> findByNombreContaining (String nombre);
	public Optional <Articulo> finById (Integer nombre);
	
	
}