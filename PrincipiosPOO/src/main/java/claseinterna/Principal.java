/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseinterna;

/**
 *
 * @author Datos
 */
public class Principal {
    public static void main(String[] args) {
       Mama objMa=new Mama();
       objMa.alimentar();
       Mama.Bebe bb=objMa.new Bebe();
       bb.moverse();
       bb.peso();
    }
    
}
