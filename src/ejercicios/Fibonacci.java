/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author Mauricio Oliveros C
 */
public class Fibonacci {
    public
        static long fibonacci(int n){
            if (n<=1) 
                return n;
            else 
                return fibonacci(n-1) + fibonacci(n-2);
        }
}
