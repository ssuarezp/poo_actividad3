/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author santi
 */
public class Rombo {
    
    int D; 
    int d;
    int l;
    public Rombo(int D, int d, int l) {
        this.D=D;
        this.d=d;
        this.l=l;
    }
    double calcularArea() {
        return (D*d)/2;
    }

    double calcularPerimetro() {
        return l*4;
    }
    static String limpiarCampo(){
        return "";
    }
    
}
