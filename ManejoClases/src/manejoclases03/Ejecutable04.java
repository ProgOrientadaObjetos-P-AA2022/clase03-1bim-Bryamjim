/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases03;

/**
 *
 * @author reroes
 */
public class Ejecutable04 {
    
    public static void main(String[] args) {
    
        Hospital h1 = new Hospital();
        Hospital h2 = new Hospital();
        Hospital h3 = new Hospital();
               
        double valor1 = 10000;
        double valor2 = 20000;
        double valor3 = 30000;
        
        h1.establecerPresupuesto(valor1);
        h2.establecerPresupuesto(valor2);
        h3.establecerPresupuesto(valor3);
        
        h1.establecerNumeroCamas(58);
        h2.establecerNumeroCamas(97);
        h1.establecerNumeroCamas(56);
                
        double suma1 = h1.obtenerPresupuesto() + h2.obtenerPresupuesto() +
                h3.obtenerPresupuesto();
        
        System.out.println("-------------------------------------");
        
        double suma2 = h1.obtenerNumeroCamas() + h2.obtenerNumeroCamas() + h1.obtenerNumeroCamas();
        System.out.printf("La suma2 de numero de camas es %.2f\n,", suma1);
        System.out.println("-------------------------------------------");
        System.out.printf("La suma2 de numero de camas es %.2f\n,", suma2);
        
        
    }
}
