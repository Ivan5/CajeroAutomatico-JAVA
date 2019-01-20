/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import cajero.Cajero;
import java.util.Scanner;
/**
 *
 * @author Ivan Jaramillo
 */
public class Main {
    
    public static void main(String[] args) {
        int opcion = 0;
        Cajero cajero = new Cajero();
        Scanner teclado = new Scanner(System.in);
        do{
           menu();
            opcion = teclado.nextInt();
            switch(opcion){
                case 1:
                    cajero.consultaSaldo();
                    break;
                case 2:
                    System.out.println("Ingresa la cantidad a retirar :");
                    int retiro = teclado.nextInt();
                    cajero.retirarSaldo(retiro);
                    break;
                case 3:
                    System.out.println("Ingresa la cantidad a depositar: ");
                    int depositar = teclado.nextInt();
                    cajero.depositarSaldo(depositar);
                    break;
                case 4:
                    System.out.println("Gracias, vuelve pronto");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(opcion != 4);
    }
    
    
    public static void menu(){
        System.out.println("\n");
        System.out.println("Bienvenido ");
        System.out.println("1. Consulta de saldo.");
        System.out.println("2. Retiro de efectivo.");
        System.out.println("3. Deposito de efectivo.");
        System.out.println("4. Salir");
        System.out.println("Porfavor seleccione una ópción: ");
    }
}
