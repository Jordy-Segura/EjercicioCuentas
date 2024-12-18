/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.ejerciciocuentas.clases;

/**
 *
 * @author SO-LAB1-PC20
 */
public class CuentaCorriente extends Cuentas{
    
    protected float sobregiro= 0;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }

    public float getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(float sobregiro) {
        this.sobregiro = sobregiro;
    }

    @Override
    public boolean retirar(float cantidad) {
        if (cantidad <= saldo) {
            return super.retirar(cantidad);
        } else {
            sobregiro += (cantidad - saldo);
            saldo = 0; 
            retiros++;
            return true;
        }
    }

    @Override
    public void consignar(float cantidad) {
        super.consignar(cantidad);
        if (sobregiro > 0) {
            if (cantidad >= sobregiro) {
                cantidad -= sobregiro;
                sobregiro = 0;
            } else {
                sobregiro -= cantidad;
                cantidad = 0;
            }
        }
        super.consignar(cantidad);
    }

    @Override
    public void extractoMensual() {
        super.extractoMensual();
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Sobregiro: " + sobregiro);
    }
   
    
}
