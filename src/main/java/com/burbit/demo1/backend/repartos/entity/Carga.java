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
* Carga - Creación de Entidad y Atributos Set y Get.
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:47 
*/
@Entity
@Table(name="carga", schema = "repartos")
public class Carga implements Serializable
{
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long  id;
@Column(nullable=false)
private java.sql.Timestamp fechaCreacion;
@Column(nullable=false)
private int idChofer;
@Column(nullable=false, unique=true)
private int idCampania;
@Column(nullable=false)
private short condicion;
@Column(nullable=false)
private int zona;
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
* @return the FechaCreacion
*/
public java.sql.Timestamp getFechaCreacion() {
return fechaCreacion;
}
/**
* @param 
*/
public void setFechaCreacion(java.sql.Timestamp fechaCreacion) {
this.fechaCreacion = fechaCreacion;
}
/**
* @return the IdChofer
*/
public int getIdChofer() {
return idChofer;
}
/**
* @param 
*/
public void setIdChofer(int idChofer) {
this.idChofer = idChofer;
}
/**
* @return the IdCampania
*/
public int getIdCampania() {
return idCampania;
}
/**
* @param 
*/
public void setIdCampania(int idCampania) {
this.idCampania = idCampania;
}
/**
* @return the Condicion
*/
public short getCondicion() {
return condicion;
}
/**
* @param 
*/
public void setCondicion(short condicion) {
this.condicion = condicion;
}
/**
* @return the Zona
*/
public int getZona() {
return zona;
}
/**
* @param 
*/
public void setZona(int zona) {
this.zona = zona;
}
}
