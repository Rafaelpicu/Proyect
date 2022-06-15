package edu.es.eoi.marketplace.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(schema = "marketplace", name = "Pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_pe;
	
	@Column
	private LocalDate fecha;
	
	@Column
	private String nombre;
	
	
	@ManyToOne
	@JoinColumn(name = "id_us", referencedColumnName = "id")
	private Usuario usuario;
	
	
	@OneToMany (mappedBy="id_pe", targetEntity = Pertenece_a.class, cascade = CascadeType.ALL)
	private List <Pertenece_a> pertenece_a;

	
	public List<Pertenece_a> getPertenece_a() {
		return pertenece_a;
	}

	public void setPertenece_a(List<Pertenece_a> pertenece_a) {
		this.pertenece_a = pertenece_a;
	}



	
	
}
