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
public class Eventos implements Serializable{
    
    String Estilos;
    int Distancia;
    int RecordS; 

    public String getEstilos() {
        return Estilos;
    }

    public void setEstilos(String Estilos) {
        this.Estilos = Estilos;
    }

    public int getDistancia() {
        return Distancia;
    }

    public void setDistancia(int Distancia) {
        this.Distancia = Distancia;
    }

    public int getRecordS() {
        return RecordS;
    }

    public void setRecordS(int RecordS) {
        this.RecordS = RecordS;
    }

    public Eventos(String Estilos, int Distancia, int RecordS) {
        this.Estilos = Estilos;
        this.Distancia = Distancia;
        this.RecordS = RecordS;
    }

    @Override
    public String toString() {
        return "Eventos{" + "Estilos=" + Estilos + ", Distancia=" + Distancia + ", RecordS=" + RecordS + '}';
    }
    
    
    
    
    
}
