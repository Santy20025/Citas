package com.citas.java.entities;

import java.time.LocalDate;


public class Paciente extends Usuario{

private String correoElectronico;
private Integer celular;
private LocalDate fechaNacimiento;
private Double altura;
private Double peso;
private TipoSangre tipoSangre;
private Character factorRH;

public Paciente(Integer id, 
String nombres, 
String apellidos, 
TipoIdentificacion tipoIdentificacion,
Long numeroIdentificacion, 
String correoElectronico, 
Integer celular, 
LocalDate fechaNacimiento, 
Double altura,
        Double peso, 
        TipoSangre tipoSangre, 
        Character factorRH) {
    super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
    this.correoElectronico = correoElectronico;
    this.celular = celular;
    this.fechaNacimiento = fechaNacimiento;
    this.altura = altura;
    this.peso = peso;
    this.tipoSangre = tipoSangre;
    this.factorRH = factorRH;
}
public String getCorreoElectronico() {
    return correoElectronico;
}
public void setCorreoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
}
public Integer getCelular() {
    return celular;
}
public void setCelular(Integer celular) {
    this.celular = celular;
}
public LocalDate getFechaNacimiento() {
    return fechaNacimiento;
}
public void setFechaNacimiento(LocalDate fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
}
public Double getAltura() {
    return altura;
}
public void setAltura(Double altura) {
    this.altura = altura;
}
public Double getPeso() {
    return peso;
}
public void setPeso(Double peso) {
    this.peso = peso;
}
public TipoSangre getTipoSangre() {
    return tipoSangre;
}
public void setTipoSangre(TipoSangre tipoSangre) {
    this.tipoSangre = tipoSangre;
}
public Character getFactorRH() {
    return factorRH;
}
public void setFactorRH(Character factorRH) {
    this.factorRH = factorRH;
}




}
