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
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
* Entrega - Creación de Entidad y Atributos Set y Get.
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:47 
*/
@Entity
@Table(name="entrega", schema = "repartos")
public class Entrega implements Serializable
{
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long  id;
@Column(nullable=false)
private java.sql.Timestamp fecraCreacion;
@Column(nullable = true)
private BigDecimal latitud;
@Column(nullable = true)
private BigDecimal longitud;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "id_ruta_paquete")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler"})
private RutaPaquete rutaPaquete;
@Column(nullable = true)
private boolean esTitular;
@Column(nullable = true, length=150)
private String receptor;
@Column(nullable = true)
private String huella;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "id_tipo_entrega")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler"})
private TipoEntrega tipoEntrega;
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
* @return the FecraCreacion
*/
public java.sql.Timestamp getFecraCreacion() {
return fecraCreacion;
}
/**
* @param 
*/
public void setFecraCreacion(java.sql.Timestamp fecraCreacion) {
this.fecraCreacion = fecraCreacion;
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
* @return the rutaPaquete
*/
public RutaPaquete getRutaPaquete() {
return rutaPaquete;
}
/**
* @param rutaPaquete 
*/
public void setRutaPaquete(RutaPaquete rutaPaquete) {
this.rutaPaquete = rutaPaquete;
}
/**
* @return the EsTitular
*/
public boolean isEsTitular() {
return esTitular;
}
/**
* @param 
*/
public void setEsTitular(boolean esTitular) {
this.esTitular = esTitular;
}
/**
* @return the Receptor
*/
public String getReceptor() {
return receptor;
}
/**
* @param 
*/
public void setReceptor(String receptor) {
this.receptor = receptor;
}
/**
* @return the Huella
*/
public String getHuella() {
return huella;
}
/**
* @param 
*/
public void setHuella(String huella) {
this.huella = huella;
}
/**
* @return the tipoEntrega
*/
public TipoEntrega getTipoEntrega() {
return tipoEntrega;
}
/**
* @param tipoEntrega 
*/
public void setTipoEntrega(TipoEntrega tipoEntrega) {
this.tipoEntrega = tipoEntrega;
}
}
