/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_juanidiaquez;

import java.io.Serializable;

/**
 *
 * @author juanf
 */
public class Nadador implements Serializable{
  
    String Nombre;
    String Nacionalidad;
    int Edad;
    double Estatura;
    String EstiloN;
    int Distancia;
    int MejorTIempo;
    int NumeroM;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getEstatura() {
        return Estatura;
    }

    public void setEstatura(double Estatura) {
        this.Estatura = Estatura;
    }

    public String getEstiloN() {
        return EstiloN;
    }

    public void setEstiloN(String EstiloN) {
        this.EstiloN = EstiloN;
    }

    public int getDistancia() {
        return Distancia;
    }

    public void setDistancia(int Distancia) {
        this.Distancia = Distancia;
    }

    public int getMejorTIempo() {
        return MejorTIempo;
    }

    public void setMejorTIempo(int MejorTIempo) {
        this.MejorTIempo = MejorTIempo;
    }

    public int getNumeroM() {
        return NumeroM;
    }

    public void setNumeroM(int NumeroM) {
        this.NumeroM = NumeroM;
    }

    public Nadador(String Nombre, String Nacionalidad, int Edad, double Estatura, String EstiloN, int Distancia, int MejorTIempo, int NumeroM) {
        this.Nombre = Nombre;
        this.Nacionalidad = Nacionalidad;
        this.Edad = Edad;
        this.Estatura = Estatura;
        this.EstiloN = EstiloN;
        this.Distancia = Distancia;
        this.MejorTIempo = MejorTIempo;
        this.NumeroM = NumeroM;
    }

    public Nadador() {
    }
    
    
    
    @Override
    public String toString() {
        return Nombre ;
    }
    
    
            
            
    
}
