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
/**
* RutaPaquete - Creación de Entidad y Atributos Set y Get.
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:48 
*/
@Entity
@Table(name="ruta_paquete", schema = "repartos")
public class RutaPaquete implements Serializable
{
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long  id;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "id_ruta")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler"})
private Ruta ruta;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "id_paquete")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler"})
private Paquete paquete;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "id_campania")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler"})
private Campania campania;
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
* @return the ruta
*/
public Ruta getRuta() {
return ruta;
}
/**
* @param ruta 
*/
public void setRuta(Ruta ruta) {
this.ruta = ruta;
}
/**
* @return the paquete
*/
public Paquete getPaquete() {
return paquete;
}
/**
* @param paquete 
*/
public void setPaquete(Paquete paquete) {
this.paquete = paquete;
}
/**
* @return the campania
*/
public Campania getCampania() {
return campania;
}
/**
* @param campania 
*/
public void setCampania(Campania campania) {
this.campania = campania;
}
}
