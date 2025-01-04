/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author santi
 */
public class Trapecio {
    
    int B;
    int b;
    int h;
    int l;
    public Trapecio(int B, int b, int h, int l) {
        this.B=B;
        this.b=b;
        this.h=h;
        this.l=l;
    }
    double calcularArea() {
        return ((B+b)/2)*h;
    }

    double calcularPerimetro() {
        return B+b+l+l;
    } 
    static String limpiarCampo(){
        return "";
    }
    
}
