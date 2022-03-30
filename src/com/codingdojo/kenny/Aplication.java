package com.codingdojo.kenny;

public class Aplication {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();

        cuenta1.depositar_cuenta_ahorros(100.5);
        cuenta1.retirar_dinero_cuenta_ahorros(50);
        System.print cuenta1.getSaldo_de_cuenta_ahorros();
        //cuenta1.mostrar_saldos();
        
    }
}
