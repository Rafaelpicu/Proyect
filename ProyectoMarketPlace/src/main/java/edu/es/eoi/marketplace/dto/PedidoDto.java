package edu.es.eoi.marketplace.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PedidoDto {

	private int id;
	private String nombre;
	private Date fecha;


}
