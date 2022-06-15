package edu.es.eoi.marketplace.entity;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Articulo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_ar;

	@Column
	private String nombre;

	@Column
	private Double precio;

	@Column
	private Integer stock;

	@OneToMany(mappedBy = "id_ar", targetEntity = Pertenece_a.class, cascade = CascadeType.ALL)
	private List <Pertenece_a> pertenece_a;


	public List<Pertenece_a> getArticulosPedido() {
		return pertenece_a;
	}

	public void setArticulosPedido(List<Pertenece_a> pertenece_a) {
		this.pertenece_a = pertenece_a;
	}

	public Articulo orElse(Articulo articulo) {
		// TODO Auto-generated method stub
		return null;
	}
}