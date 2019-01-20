/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

/**
 *
 * @author Ivan Jaramillo
 */
public class Cajero {
    private int saldo = 500;
    
    public int getSaldo(){
        return this.saldo;
    }
    
    public int setSaldo(int saldoNuevo){
        return this.saldo = saldoNuevo;
    }
    
    public void consultaSaldo(){
        System.out.println("Tu saldo actual es: "+this.getSaldo());
    }
    
    public void retirarSaldo(int SaldoRetiro){
        if(this.saldo <= 0){
            System.out.println("No puedes retirar, no cuentas con efectivo");
        }else{
            System.out.println("Retiraste : "+SaldoRetiro);
            this.setSaldo(this.saldo - SaldoRetiro);
            System.out.println("Tu saldo actual es: "+this.getSaldo());
        }
    }
    
    public void depositarSaldo(int saldoDeposito){
        System.out.println("Despositaste : "+saldoDeposito);
        this.setSaldo(this.saldo + saldoDeposito);
        System.out.println("Tu saldo actual es : "+this.getSaldo());
    }
}
