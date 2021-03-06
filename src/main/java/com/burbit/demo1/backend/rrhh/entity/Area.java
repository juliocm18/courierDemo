package com.burbit.demo1.backend.rrhh.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import org.hibernate.annotations.OrderBy;

/**
 * Area - Creación de Entidad y Atributos Set y Get.
 *
 * @author Julio Becerra Urbina
 * @since 1.0 - fecha: 23 abril 2019 - 18:29:48
 */
@Entity
@Table(name = "area", schema = "rrhh")
public class Area implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    private String nombre;
    @Column(nullable = true, length = 250)
    private String descripcion;
    @Column(nullable = false)
    private short condicion;

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
}
