package com.enrique.Biblioteca;

public class Autor {
    private Integer id;
    private String nombre;
    private String apellidos;
    private Integer fechanacimiento;
    private String localidad;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public Integer getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Integer fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
}
