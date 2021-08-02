/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preciosalquiler;

/**
 *
 * @author Samu-Pc
 */
public class Furgoneta extends Vehiculo{
    
    private int pesoMax;
    
    public Furgoneta() {
        this.pesoMax = 0;
    }
    
    public int getPesoMax() {
        return pesoMax;
    }
    
    public void setPesoMax(int pesoMax) {
        this.pesoMax = pesoMax;
    }
    
    @Override
    public double calcularPrecio() {
        return super.cantDiasAlquiler() * (50 +(20 * this.pesoMax));
    }
}
