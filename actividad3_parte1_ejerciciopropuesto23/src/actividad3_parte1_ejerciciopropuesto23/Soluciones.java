/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad3_parte1_ejerciciopropuesto23;
/**
 *
 * @author EstudianteAuxiliar
 */
public class Soluciones {
    
    double a, b, c, solucion1, solucion2;
    
    public static double calcular_solucion1(double a, double b, double c){
                     
        double solucion1;
        
        return ((-1) * b * + Math.sqrt(Math.pow((-1) * b, 2) - (4 * a * c))) / (2 * a);
          
    }
    
    public static double calcular_solucion2(double a, double b, double c){
                     
        double solucion2;
        
        return ((-1) * b * - Math.sqrt(Math.pow((-1) *b, 2) - (4 * a * c))) / (2 * a);
          
    }
    
    public static String limpiar_campos(){
        return "";
    }

    
}
