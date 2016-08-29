/*
 * Desarrollar un programa que calcule la nota definitiva de un estudiante en 
   una asignatura, se sabe que durante el semestre académico se manejan tres 
   notas con sus respectivos porcentajes así: seguimiento (50%), parcial I (25%) y parcial 2 (25%).
 */
package ejercicios;

/**
 *
 * @author Mauricio Oliveros C
 */
public class NotaFinal {
    
    public  
            // Constructor
                    
            // Set Methods
                    
            // Get Methods
            static double GetNotaFinal(double a, double b, double c){
                return a*0.5+b*0.25+c*0.25;
            }
            static double GetNotaFinal(double a, double b, double c, double d, double e){
                return a*0.2+b*0.3+c*0.1+d*0.15+e*0.25;
            }
}

// end class