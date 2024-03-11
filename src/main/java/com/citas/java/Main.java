package com.citas.java;

import com.citas.java.entities.Especialidad;
import com.citas.java.entities.Medico;
import com.citas.java.entities.TipoIdentificacion;

public class Main {
    public static void main(String[] args) {
        
        //Crear o instanciar un Medico
        Medico m = new Medico(1, 
        "Paco", 
        "Bolivar", 
        TipoIdentificacion.CC, 
        89134786578L, 
        "18974589465L", 
        Especialidad.PEDIATRA);

    }
}