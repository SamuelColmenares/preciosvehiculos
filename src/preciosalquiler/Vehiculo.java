/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preciosalquiler;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Samu-Pc
 */
public abstract class Vehiculo {
    
    private String placa;
    private String marca;
    private String modelo;
    private Date fechaEntrega;
    private Date fechaSalida;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    /**
     * Calcula el precio a pagar por vehiculo.
     * @return 
     */
    public abstract double calcularPrecio();
    
    /**
     * Calcula la cantidad de dias alquilado el vehiculo.
     * @return 
     */
    public int cantDiasAlquiler(){
        long diffInMillies = this.fechaSalida.getTime() -this.fechaEntrega.getTime();
        return (int)TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
    }
    
}
