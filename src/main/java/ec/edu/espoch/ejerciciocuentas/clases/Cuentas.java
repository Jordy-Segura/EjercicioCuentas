/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.ejerciciocuentas.clases;

/**
 *
 * @author SO-LAB1-PC19
 */
public class Cuentas {
    protected float saldo;
    protected int consignacion=0;
    protected int retiros=0;
    protected float tasaAnual;
    protected float comisionMensual=0;

    public Cuentas(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
    
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getConsignacion() {
        return consignacion;
    }

    public void setConsignacion(int consignacion) {
        this.consignacion = consignacion;
    }

    public int getRetiros() {
        return retiros;
    }

    public void setRetiros(int retiros) {
        this.retiros = retiros;
    }

    public float getTasaAnual() {
        return tasaAnual;
    }

    public void setTasaAnual(float tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public float getComisionMensual() {
        return comisionMensual;
    }

    public void setComisionMensual(float comisionMensual) {
        this.comisionMensual = comisionMensual;
    }
    
    public void consignar(float cantidad) {
        saldo += cantidad;
        consignacion++;
    }

    public boolean retirar(float cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            retiros++;
            return true;
        }
        return false;
    }

    public void calcularInteresMensual() {
        float interesMensual = (saldo * (tasaAnual / 100)) / 12;
        saldo += interesMensual;
    }

    public void extractoMensual() {
        calcularInteresMensual();
        saldo -= comisionMensual;
    }

    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Comisión Mensual: " + comisionMensual);
        System.out.println("Número de Consignaciones: " + consignacion);
        System.out.println("Número de Retiros: " + retiros);
    }

    
}
