/*
 * Desarrolle un algoritmo que permita calcular el volumen y el área de un cubo.
 */
package ejercicios;

/**
 *
 * @author Mauricio Oliveros C
 * themaoc@gmail.com
 */
public class Cubo {
    private 
            double lado;
    
    public
            // Constructor
            Cubo(double l) { lado = l; }
            
            // Set Methods
            void SetLado(double l){ lado = l; };
            
            // Get Methods
            double GetArea(){ return lado*lado*6; }
            double GetVolumen(){ return lado*lado*lado; }
}

// end class