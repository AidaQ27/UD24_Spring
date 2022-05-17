package UD24.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="treballador")
public class Treballador {

	//Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "apellido")//no hace falta si se llama igual
	private String apellido;
	@Column(name = "tipo_feina")//no hace falta si se llama igual
	private String tipo_feina;
	@Column(name = "sou")//no hace falta si se llama igual
	private double sou;
	
	
	// Constructors
	

	public Treballador() {
		
	}


	public Treballador(Long id, String nombre, String apellido, String tipo_feina, double sou) {
		
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipo_feina = tipo_feina;
		this.sou = sou;
	}


	// Getters & Setters
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getTipo_feina() {
		return tipo_feina;
	}


	public void setTipo_feina(String tipo_feina) {
		this.tipo_feina = tipo_feina;
	}


	public double getSou() {
		return sou;
	}


	public void setSou(double sou) {
		this.sou = sou;
	}


	@Override
	public String toString() {
		return "Treballadors [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", tipo_feina=" + tipo_feina
				+ ", sou=" + sou + "]";
	}
	
	
	

	
	



}
