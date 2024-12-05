/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad3_parte1_ejercicioresuelto10;

/**
 *
 * @author EstudianteAuxiliar
 */
public class Pago {
    double pat;
    double es;
    double pagmat=50000;
    String nombre;
    double inscripcion;
    
    Pago(double pat, double es, double pagmat){
        this.pat=pat;
        this.es=es;
        this.pagmat=pagmat;
    }
    
    public double valor_a_pagar(double pat, double es){
        double pagmat=50000;
        if ((pat>2000000)&&(es>3)){
            return pagmat+0.03*pat;
        }
        else{
            return pagmat;
        }
    }

    public double obtenerInscripcion(double inscripcion){
        return inscripcion;
    }
    
    public String obtenerNombres(String nombre){
        return nombre;
    }
    
    public static String limpiar_campos(){
        return "";
    }
    
}
