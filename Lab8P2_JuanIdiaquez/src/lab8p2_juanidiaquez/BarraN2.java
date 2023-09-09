/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_juanidiaquez;

import javax.swing.JProgressBar;

/**
 *
 * @author juanf
 */
public class BarraN2 extends Thread{
    int distancia;
    JProgressBar barra;
    int random;
    boolean winner;
    
    public BarraN2(int distancia, JProgressBar barra) {
        this.distancia = distancia;
        this.barra = barra;
    }
    
    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public int getRandom() {
        return random;
    }

    public void setRandom(int random) {
        this.random = random;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }
    
    
    
    @Override
    public void run(){
        while (barra.getValue()<distancia) {            
            barra.setValue(barra.getValue()+random);
            try {
                Thread.sleep(0);
            } catch (Exception e) {
            }
        }
    }
}
