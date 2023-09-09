/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_juanidiaquez;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author juanf
 */
public class Pais implements Serializable{
    
    String Nombre;
    ArrayList <Nadador> nadadores= new ArrayList();
    int MedallasO; 

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Nadador> getNadadores() {
        return nadadores;
    }

    public void setNadadores(ArrayList<Nadador> nadadores) {
        this.nadadores = nadadores;
    }

    public int getMedallasO() {
        return MedallasO;
    }

    public void setMedallasO(int MedallasO) {
        this.MedallasO = MedallasO;
    }

    public Pais(String Nombre, int MedallasO) {
        this.Nombre = Nombre;
        this.MedallasO = MedallasO;
    }

    public Pais() {
    }

    
    
    @Override
    public String toString() {
        return Nombre;
    }

    
  
    
    
}
