/*
 * Dado el valor del lado de un triángulo equilátero, haga un algoritmo 
   que calcule su perímetro, su altura y su área.
 */
package ejercicios;

/**
 *
 * @author Mauricio Oliveros C
 */
public class TrianguloEquilatero {
    private final
            double lado;
    
    public
            // Constructor.
            TrianguloEquilatero(double l) { lado = l; }
          
            // Set Methods.
            
            // Get Methods.
            double GetPerimetro() { return 3*lado; }
            double GetAltura() { return ((Math.sqrt(3))/2)*lado; }
            double GetArea() { return ((Math.sqrt(3))/4)*(lado*lado); }
}

// end class