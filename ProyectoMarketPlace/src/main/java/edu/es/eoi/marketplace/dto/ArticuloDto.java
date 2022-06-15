package edu.es.eoi.marketplace.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArticuloDto {

	private int id;
	private String nombre;
	private double precio;
	private int stock;

}
