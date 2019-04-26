package com.burbit.demo1.backend.repartos.entity;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import org.hibernate.annotations.OrderBy;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.burbit.demo1.backend.rrhh.entity.Empleado;
import com.burbit.demo1.backend.transporte.entity.Vehiculo;
/**
* Ruta - Creación de Entidad y Atributos Set y Get.
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:47 
*/
@Entity
@Table(name="ruta", schema = "repartos")
public class Ruta implements Serializable
{
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long  id;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "id_repartidor")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler"})
private Empleado empleado;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "id_vehiculo")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler"})
private Vehiculo vehiculo;
@Column(nullable = true)
private java.sql.Timestamp fechaCreacion;
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
* @return the empleado
*/
public Empleado getEmpleado() {
return empleado;
}
/**
* @param empleado 
*/
public void setEmpleado(Empleado empleado) {
this.empleado = empleado;
}
/**
* @return the vehiculo
*/
public Vehiculo getVehiculo() {
return vehiculo;
}
/**
* @param vehiculo 
*/
public void setVehiculo(Vehiculo vehiculo) {
this.vehiculo = vehiculo;
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
}
