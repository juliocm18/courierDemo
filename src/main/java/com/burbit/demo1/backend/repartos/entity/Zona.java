package com.burbit.demo1.backend.repartos.entity;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import org.hibernate.annotations.OrderBy;
/**
* Zona - Creación de Entidad y Atributos Set y Get.
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:48 
*/
@Entity
@Table(name="zona", schema = "repartos")
public class Zona implements Serializable
{
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long  id;
@Column(nullable=false)
private int nombre;
@Column(nullable = true, length=250)
private String descripcion;
/**
* @return the Id
*/
public Long getId() {
return id;
}
/**
* @param 
*/
public void setId(Long id) {
this.id = id;
}
/**
* @return the Nombre
*/
public int getNombre() {
return nombre;
}
/**
* @param 
*/
public void setNombre(int nombre) {
this.nombre = nombre;
}
/**
* @return the Descripcion
*/
public String getDescripcion() {
return descripcion;
}
/**
* @param 
*/
public void setDescripcion(String descripcion) {
this.descripcion = descripcion;
}
}
