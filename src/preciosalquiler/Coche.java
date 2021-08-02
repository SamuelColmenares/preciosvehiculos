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
public class Coche extends Vehiculo {

    @Override
    public double calcularPrecio() {
        return super.cantDiasAlquiler() * (50 + 1.5);
    }
    
}
