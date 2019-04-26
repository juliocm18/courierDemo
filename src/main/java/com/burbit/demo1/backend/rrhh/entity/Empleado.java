package com.burbit.demo1.backend.rrhh.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import org.hibernate.annotations.OrderBy;
import javax.validation.constraints.Email;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Empleado - Creación de Entidad y Atributos Set y Get.
 *
 * @author Julio Becerra Urbina
 * @since 1.0 - fecha: 23 abril 2019 - 18:29:48
 */
@Entity
@Table(name = "empleado", schema = "rrhh")
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cargo")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Cargo cargo;
    @Column(nullable = false, length = 100)
    private String nombre;
    @Column(nullable = false, length = 100)
    private String apellidoPaterno;
    @Column(nullable = false, length = 100)
    private String apellidoMaterno;
    @Email
    @Column(nullable = false, length = 150)
    private String email;
    @Column(nullable = false, length = 200)
    private String direccion;
    @Column(nullable = false)
    private java.sql.Date fechaNacimiento;
    @Column(nullable = false, unique = true, length = 8)
    private String dni;
    @Column(nullable = false)
    private boolean sexo;
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
     * @return the cargo
     */
    public Cargo getCargo() {
        return cargo;
    }

    /**
     * @param cargo
     */
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
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
     * @return the ApellidoPaterno
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * @param
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * @return the ApellidoMaterno
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * @param
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param
     */
    public void setEmail(String email) {
        this.email = email;
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
     * @return the FechaNacimiento
     */
    public java.sql.Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param
     */
    public void setFechaNacimiento(java.sql.Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the Dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the Sexo
     */
    public boolean isSexo() {
        return sexo;
    }

    /**
     * @param
     */
    public void setSexo(boolean sexo) {
        this.sexo = sexo;
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
