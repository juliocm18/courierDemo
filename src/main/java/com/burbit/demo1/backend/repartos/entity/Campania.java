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
* Campania - Creación de Entidad y Atributos Set y Get.
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:47 
*/
@Entity
@Table(name="campania", schema = "repartos")
public class Campania implements Serializable
{
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long  id;
@Column(nullable=false, length=50)
private String nombre;
@Column(nullable=false)
private boolean esActivo;
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
public String getNombre() {
return nombre;
}
/**
* @param 
*/
public void setNombre(String nombre) {
this.nombre = nombre;
}
/**
* @return the EsActivo
*/
public boolean isEsActivo() {
return esActivo;
}
/**
* @param 
*/
public void setEsActivo(boolean esActivo) {
this.esActivo = esActivo;
}
}
