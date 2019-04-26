package com.burbit.demo1.backend.transporte.entity;
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
* Vehiculo - Creación de Entidad y Atributos Set y Get.
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:48 
*/
@Entity
@Table(name="vehiculo", schema = "transporte")
public class Vehiculo implements Serializable
{
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long  id;
@Column(nullable=false, unique=true, length=15)
private String placa;
@Column(nullable = true, length=150)
private String certificado;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "id_tipo_vehiculo")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler"})
private TipoVehiculo tipoVehiculo;
@Column(nullable=false)
private short condicion;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "id_marca_vehiculo")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler"})
private MarcaVehiculo marcaVehiculo;
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
* @return the Placa
*/
public String getPlaca() {
return placa;
}
/**
* @param 
*/
public void setPlaca(String placa) {
this.placa = placa;
}
/**
* @return the Certificado
*/
public String getCertificado() {
return certificado;
}
/**
* @param 
*/
public void setCertificado(String certificado) {
this.certificado = certificado;
}
/**
* @return the tipoVehiculo
*/
public TipoVehiculo getTipoVehiculo() {
return tipoVehiculo;
}
/**
* @param tipoVehiculo 
*/
public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
this.tipoVehiculo = tipoVehiculo;
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
* @return the marcaVehiculo
*/
public MarcaVehiculo getMarcaVehiculo() {
return marcaVehiculo;
}
/**
* @param marcaVehiculo 
*/
public void setMarcaVehiculo(MarcaVehiculo marcaVehiculo) {
this.marcaVehiculo = marcaVehiculo;
}
}
