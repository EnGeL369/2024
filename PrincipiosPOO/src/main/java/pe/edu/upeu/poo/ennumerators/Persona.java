/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.poo.ennumerators;

enum  GENEROD{Femenino,Masculino}
enum ESTADO_CIVIL{soltero,casado,Divorciado,viudo}

public class Persona {
    String nombre;
    String dni;
    String genero=GENEROD.Masculino.name();
    String estadoc;
    public static void main(String[] args) {
        Persona p=new Persona();
        System.out.println("Genero:"+p.genero);
        for(ESTADO_CIVIL ec:ESTADO_CIVIL.values()){
            System.out.println("EC: "+ec);
        }
    }
    
}
