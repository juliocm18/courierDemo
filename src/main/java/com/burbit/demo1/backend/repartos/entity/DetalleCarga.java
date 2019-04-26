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
* DetalleCarga - Creación de Entidad y Atributos Set y Get.
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:47 
*/
@Entity
@Table(name="detalle_carga", schema = "repartos")
public class DetalleCarga implements Serializable
{
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long  id;
@Column(nullable=false, length=25)
private String codigoPaquete;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "id_carga")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler"})
private Carga carga;
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
* @return the CodigoPaquete
*/
public String getCodigoPaquete() {
return codigoPaquete;
}
/**
* @param 
*/
public void setCodigoPaquete(String codigoPaquete) {
this.codigoPaquete = codigoPaquete;
}
/**
* @return the carga
*/
public Carga getCarga() {
return carga;
}
/**
* @param carga 
*/
public void setCarga(Carga carga) {
this.carga = carga;
}
}
