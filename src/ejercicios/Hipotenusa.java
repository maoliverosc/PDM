/*
 * Escriba un algoritmo que permita calcular la hipotenusa de un triángulo 
   rectángulo utilizando el teorema de Pitágoras.
 */
package ejercicios;

/**
 *
 * @author Mauricio Oliveros C
 */
public class Hipotenusa {
    private 
            double catetoA;
            double catetoO;
            
    public
            // Constructor.
            Hipotenusa(double a, double o){
                catetoA = a;
                catetoO = o;
            }
            
            // Set Methods
            void SetCatetoAd(double a) { catetoA = a; }
            void SetCatetoOp(double o) { catetoO = o; }
            
            // Get Methods
            double GetCatetoAd() {return catetoA; }
            double GetCatetoOp() {return catetoO; }
            double GetHipotenusa() { return Math.sqrt((catetoA*catetoA + catetoO*catetoO)); }
}

// end class