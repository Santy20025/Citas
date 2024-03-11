package com.citas.java.entities;

public class Usuario {

    //lo protected en la clase padre
    //sera privado en las clases hijas
    protected Integer id;
    protected String nombres;
    protected String Apellidos;
    protected TipoIdentificacion tipoIdentificacion;
    protected Long numeroIdentificacion;


    public Usuario(Integer id, 
                    String nombres, 
                    String apellidos, 
                    TipoIdentificacion tipoIdentificacion,
                    Long numeroIdentificacion) {
        this.id = id;
        this.nombres = nombres;
        Apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getNombres() {
        return nombres;
    }


    public void setNombres(String nombres) {
        this.nombres = nombres;
    }


    public String getApellidos() {
        return Apellidos;
    }


    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }


    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }


    public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }


    public Long getNumeroIdentificacion() {
        return numeroIdentificacion;
    }


    public void setNumeroIdentificacion(Long numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    
}
