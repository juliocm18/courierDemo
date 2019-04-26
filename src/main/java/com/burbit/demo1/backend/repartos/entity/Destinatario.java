package com.burbit.demo1.backend.repartos.entity;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import org.hibernate.annotations.OrderBy;
import java.math.BigDecimal;
/**
* Destinatario - Creación de Entidad y Atributos Set y Get.
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:47 
*/
@Entity
@Table(name="destinatario", schema = "repartos")
public class Destinatario implements Serializable
{
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long  id;
@Column(nullable=false, length=200)
private String nombres;
@Column(nullable=false, length=20)
private String numeroDocumento;
@Column(nullable=false)
private short condicion;
@Column(nullable=false, length=200)
private String direccion;
@Column(nullable=false)
private BigDecimal latitud;
@Column(nullable=false)
private BigDecimal longitud;
@Column(nullable=false, length=50)
private String telefono;
@Column(nullable=false, length=50)
private String celular;
@Column(nullable=false, length=100)
private String ciudad;
@Column(nullable=false, length=100)
private String ubicacion;
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
* @return the Nombres
*/
public String getNombres() {
return nombres;
}
/**
* @param 
*/
public void setNombres(String nombres) {
this.nombres = nombres;
}
/**
* @return the NumeroDocumento
*/
public String getNumeroDocumento() {
return numeroDocumento;
}
/**
* @param 
*/
public void setNumeroDocumento(String numeroDocumento) {
this.numeroDocumento = numeroDocumento;
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
* @return the Direccion
*/
public String getDireccion() {
return direccion;
}
/**
* @param 
*/
public void setDireccion(String direccion) {
this.direccion = direccion;
}
/**
* @return the Latitud
*/
public BigDecimal getLatitud() {
return latitud;
}
/**
* @param 
*/
public void setLatitud(BigDecimal latitud) {
this.latitud = latitud;
}
/**
* @return the Longitud
*/
public BigDecimal getLongitud() {
return longitud;
}
/**
* @param 
*/
public void setLongitud(BigDecimal longitud) {
this.longitud = longitud;
}
/**
* @return the Telefono
*/
public String getTelefono() {
return telefono;
}
/**
* @param 
*/
public void setTelefono(String telefono) {
this.telefono = telefono;
}
/**
* @return the Celular
*/
public String getCelular() {
return celular;
}
/**
* @param 
*/
public void setCelular(String celular) {
this.celular = celular;
}
/**
* @return the Ciudad
*/
public String getCiudad() {
return ciudad;
}
/**
* @param 
*/
public void setCiudad(String ciudad) {
this.ciudad = ciudad;
}
/**
* @return the Ubicacion
*/
public String getUbicacion() {
return ubicacion;
}
/**
* @param 
*/
public void setUbicacion(String ubicacion) {
this.ubicacion = ubicacion;
}
}
