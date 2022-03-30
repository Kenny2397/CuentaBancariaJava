package com.codingdojo.kenny;

public class CuentaBancaria {
    private double saldo_de_cuenta_corriente;
    private double saldo_de_cuenta_ahorros;
    private static int numero_de_cuentas_creadas;
    private static int cantidades_dinero_almacenado_por_cuenta;


    public CuentaBancaria() {

        numero_de_cuentas_creadas++;
    }


    /*--------------------
    GETTERS
    ----------------------*/
    public double getSaldo_de_cuenta_corriente() {
        return saldo_de_cuenta_corriente;
    }

    public double getSaldo_de_cuenta_ahorros() {
        return saldo_de_cuenta_ahorros;
    }
    /*--------------------
    METODOS
    ----------------------*/

    public void depositar_cuenta_corriente(double monto){
        saldo_de_cuenta_corriente += monto;
    }

    public void depositar_cuenta_ahorros(double monto) {
        saldo_de_cuenta_ahorros += monto;
    }

    public void retirar_dinero_cuenta_corriente(double monto){
        if (monto > saldo_de_cuenta_corriente){
            System.out.println("fondos insuficientes!!");
        }else{
            saldo_de_cuenta_corriente-=monto;
            System.out.println("operacion con éxito \n saldo de cuenta corriente: "+saldo_de_cuenta_corriente);
        }
    }
    public void retirar_dinero_cuenta_ahorros(double monto){
        if (monto > saldo_de_cuenta_ahorros){
            System.out.println("fondos insuficientes!!");
        }else{
            saldo_de_cuenta_ahorros-=monto;
            System.out.println("operacion con éxito \n saldo de cuenta ahorros: "+saldo_de_cuenta_ahorros);
        }
    }
    public void mostrar_saldos(){
        System.out.println("saldo de cuenta corriente: "+saldo_de_cuenta_corriente+", saldo de cuenta ahorros: "+saldo_de_cuenta_ahorros);

    }

}