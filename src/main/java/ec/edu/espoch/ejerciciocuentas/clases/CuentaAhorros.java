/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.ejerciciocuentas.clases;

/**
 *
 * @author SO-LAB1-PC19
 */
public class CuentaAhorros extends Cuentas {
    private boolean activa;

    public CuentaAhorros(float saldoInicial, float tasaAnual) {
        super(saldoInicial, tasaAnual);
        this.activa = saldoInicial >= 10000;
    }

    @Override
    public void consignar(float cantidad) {
        if (activa) {
            super.consignar(cantidad);
        } else {
            System.out.println("La cuenta no está activa. No se puede consignar.");
        }
    }

    @Override
    public boolean retirar(float cantidad) {
        if (activa) {
            return super.retirar(cantidad);
        } else {
            System.out.println("La cuenta no está activa. No se puede retirar.");
            return false;
        }
    }

    @Override
    public void extractoMensual() {
        if (retiros > 4) {
            comisionMensual += (retiros - 4) * 1000;
        }
        super.extractoMensual();
        activa = saldo >= 10000; // Actualiza el estado de la cuenta
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Estado de la cuenta: " + (activa ? "Activa" : "Inactiva"));
    }
}
