/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.poo.encapsinterface;

/**
 *
 * @author Datos
 */
public class Loro implements Animal{

    @Override
    public void emitirSonido() {
        System.out.println("Esto es la implementacion ...no te olvodes!!");
    }

    @Override//modifica el comportamiento//
    public void dormir() {
        System.out.println("Zzz...zzz.");
      
    }
    public void habla(){
        System.out.println("Hola manito no seas flojo ps.");
    }
}
