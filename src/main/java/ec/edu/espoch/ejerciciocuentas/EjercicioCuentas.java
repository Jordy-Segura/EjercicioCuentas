/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.ejerciciocuentas;

import ec.edu.espoch.ejerciciocuentas.clases.CuentaAhorros;
import ec.edu.espoch.ejerciciocuentas.clases.CuentaCorriente;

/**
 *
 * @author SO-LAB1-PC19
 */
public class EjercicioCuentas {

    public static void main(String[] args) {
        CuentaAhorros cuentaAhorros = new CuentaAhorros(15000, 5);
        
        System.out.println("Cuenta de Ahorros:");
        cuentaAhorros.consignar(5000);
        cuentaAhorros.retirar(2000);
        cuentaAhorros.extractoMensual();
        cuentaAhorros.imprimir();

        CuentaCorriente cuentaCorriente = new CuentaCorriente(5000, 5);
        
        System.out.println("\nCuenta Corriente:");
        cuentaCorriente.consignar(2000);
        cuentaCorriente.retirar(8000); // Esto generará un sobregiro
        cuentaCorriente.extractoMensual();
        cuentaCorriente.imprimir();
    }
}
