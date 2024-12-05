/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad3_parte1_ejercicioresuelto7;

/**
 *
 * @author EstudianteAuxiliar
 */
public class Identificar {
    
    public static String identificar(double a, double b){
        if (a > b){
            return "A es mayor que B";
        }
        else if (b == a){
            return "A es igual que B";
        }
        else {
            return "A es menor que B";
        }       
    }
    
    public static String limpiar_campos(){
        return "";
    }
}
