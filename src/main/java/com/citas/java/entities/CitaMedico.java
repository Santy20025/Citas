package com.citas.java.entities;

import java.time.LocalDateTime;

import com.citas.java.interfaces.IAgendable;

public class CitaMedico extends Cita implements IAgendable{

    private Medico medico;
    private String motivo;
    private EstadoCita estado;

    public CitaMedico(Integer id, LocalDateTime fecha, com.citas.java.entities.Paciente paciente,
            com.citas.java.entities.Consultorio consultorio, Medico medico, String motivo, EstadoCita estado) {
        super(id, fecha, paciente, consultorio);
        this.medico = medico;
        this.motivo = motivo;
        this.estado = estado;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public EstadoCita getEstado() {
        return estado;
    }

    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }

    @Override
    public void agendarCita(LocalDateTime fecha) {
        super.setFecha(fecha);
        this.estado = EstadoCita.AGENDADA;
    }

    @Override
    public void cancelarCita() {
        
    }

    @Override
    public void reagendarCita(LocalDateTime fecha) {
        
    }

}
