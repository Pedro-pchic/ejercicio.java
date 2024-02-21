/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Coches;
public class Carro {
   String color;
   String marca;
   int km;

   public static void main (String [] args){
       Carro carro1 = new Carro();
       
       carro1.color = " blanco ";
       carro1.marca = " Toyota ";
       carro1.km = 0;
       
       System.out.println(" El color del carro1 es : " +carro1.color);
       System.out.println("La marca del carro1 es : "+carro1.marca);
       System.out.println("El kilomentraje del carro1 es :"+carro1.km);
       
   }

}
