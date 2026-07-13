package org.miprimermodelo_simoneaa;

import java.time.Year;


public class MiPrimerModelo {
    
    private String nombre;
    private String apellido;
    private String documentoIdentidad;
    private int añoNacimiento;
    private int edad;
    
    public MiPrimerModelo(String nombre, String apellido, String documentoIdentidad, int añoNacimiento) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.documentoIdentidad = documentoIdentidad;
    this.añoNacimiento = añoNacimiento;
    this.edad = calcularEdad();
    }
    
    private int calcularEdad() {
        int añoActual = Year.now().getValue();
        return añoActual - this.añoNacimiento;
    }
    
    public String getNombre() {
    return this.nombre;
    }
    public String getApellido() {
    return this.apellido;
    }
    public String getDocumentoIdentidad() {
    return this.documentoIdentidad;
    }
    public int getAñoNacimiento() {
    return this.añoNacimiento;
    }
    public int getEdad() {
    return this.edad;
    }
}