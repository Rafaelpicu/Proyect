package edu.es.eoi.marketplace.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "marketplace", name = "Pertenece_a")
public class Pertenece_a {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;

	@Column
	private int cantidad;
	
//	@Column (name= "id_articulo")
	@JoinColumn(name = "id_ar", referencedColumnName = "id")
	@ManyToOne()
	private Articulo idArticulo;
	
//	@Column (name= "id_pedido")
	@JoinColumn(name = "id_pe", referencedColumnName = "id")
	@ManyToOne()
	private Pedido idPedido;

	

	
	
}


