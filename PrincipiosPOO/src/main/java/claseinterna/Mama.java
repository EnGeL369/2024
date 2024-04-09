/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseinterna;

/**
 *
 * @author Datos
 */
public class Mama {
    String alimento="nutrientes";
    
   public void alimentar (){
       System.out.println("Alimenta dando: "+alimento);
   }
    class Bebe{
     double peso=1; 
     public void peso(){
         System.out.println("Su peso es: "+peso);
     }
     public void moverse(){
         System.out.println("Da pataditas..");
     }
    }
    
}
