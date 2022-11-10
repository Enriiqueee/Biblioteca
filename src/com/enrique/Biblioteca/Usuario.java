package com.enrique.Biblioteca;

public class Usuario {
    private Integer id;
    private String nombre;
    private String apellidos;
    private String dni;
    private Integer telefono;
    private String direccion;
    private String poblacion;

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
        public void setApellidos(String apellidos){
            this.apellidos=apellidos;
        }
     public String getDni(){
        return dni;
     }
     public void setDni(String dni){
        this.dni=dni;
     }
     public Integer getTelefono(){
        return telefono;
     }
     public void setTelefono(Integer telefono){
        this.telefono=telefono;
     }
     public String getDireccion(){
        return direccion;
     }
     public void setDireccion(String direccion){
        this.direccion=direccion;
     }
     public String getPoblacion(){
        return poblacion;
     }
     public void setPoblacion(String poblacion) {
         this.poblacion=poblacion;
     }
}
