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
* Paquete - Creación de Entidad y Atributos Set y Get.
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:47 
*/
@Entity
@Table(name="paquete", schema = "repartos")
public class Paquete implements Serializable
{
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long  id;
@Column(nullable=false, length=15)
private String codigo;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "id_zona")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler"})
private Zona zona;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "id_destinatario")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler"})
private Destinatario destinatario;
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
* @return the Codigo
*/
public String getCodigo() {
return codigo;
}
/**
* @param 
*/
public void setCodigo(String codigo) {
this.codigo = codigo;
}
/**
* @return the zona
*/
public Zona getZona() {
return zona;
}
/**
* @param zona 
*/
public void setZona(Zona zona) {
this.zona = zona;
}
/**
* @return the destinatario
*/
public Destinatario getDestinatario() {
return destinatario;
}
/**
* @param destinatario 
*/
public void setDestinatario(Destinatario destinatario) {
this.destinatario = destinatario;
}
}
