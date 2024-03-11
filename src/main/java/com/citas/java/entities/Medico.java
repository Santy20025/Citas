package com.citas.java.entities;

public class Medico extends Usuario {

    private String registroMedico;
    private Especialidad especialidad;

    public Medico(Integer id, 
                  String nombres, 
                  String apellidos, 
                  TipoIdentificacion tipoIdentificacion,
                  Long numeroIdentificacion, 
                  String registroMedico, 
                  Especialidad especialidad) {
        
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
        //Despues los atributos de la clase hija
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }
    public String getRegistroMedico() {
        return registroMedico;
    }
    public void setRegistroMedico(String registroMedico) {
        this.registroMedico = registroMedico;
    }
    public Especialidad getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    




}
