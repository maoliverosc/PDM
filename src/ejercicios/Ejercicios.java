/*
 * Ejercicios para practicas en Java
 */
package ejercicios;
import java.util.Scanner;

/**
 *
 * @author Mauricio Oliveros C
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Globals
        int opt;
        Scanner input = new Scanner(System.in);
        
        //
        System.out.print("Ejercicio a probar: ");
        opt = input.nextInt();
        
        //
        switch (opt) {
            case 1:
                // Ejericio 1
                double lado;
                System.out.println("Calcular area y volumen del cubo.");
                System.out.println("Ingrese lado: ");
                lado = input.nextDouble();
                Cubo myCub = new Cubo(lado);
                System.out.printf("Area del cubo: %.2f\n", myCub.GetArea());
                System.out.printf("Volumen del cubo: %.2f\n", myCub.GetVolumen());
                break;
            
            case 2:
                // Ejericio 2
                double catA, catO;
                System.out.println("Calcular Hipotenusa de un triangulo.");
                System.out.println("Ingrese Cateto Adyacente: ");
                catA = input.nextDouble();
                System.out.println("Ingrese Cateto Opuesto: ");
                catO = input.nextDouble();
                Hipotenusa myHip = new Hipotenusa(catA, catO);
                System.out.printf("Hipotenusa del triangulo: %.2f\n", myHip.GetHipotenusa());
                break;
              
            case 3:
                // Ejericio 1
                double l;
                System.out.println("Calcular Perimetro, altura y area del triangulo equilatero.");
                System.out.println("Ingrese lado: ");
                l = input.nextDouble();
                TrianguloEquilatero myTri = new TrianguloEquilatero(l);
                System.out.printf("Perimetro del triangulo equilatero: %.2f\n", myTri.GetPerimetro());
                System.out.printf("Altura del triangulo equilatero: %.2f\n", myTri.GetAltura());
                System.out.printf("Area del triangulo equilatero: %.2f\n", myTri.GetArea());
                break;
            
            case 4:
                // Ejericio 1
                double n1, n2, n3;
                System.out.println("Calcular nota final de semestre");
                System.out.println("Ingrese nota seguimiento: ");
                n1 = input.nextDouble();
                System.out.println("Ingrese nota parcial I: ");
                n2 = input.nextDouble();
                System.out.println("Ingrese nota parcial II: ");
                n3 = input.nextDouble();
                System.out.printf("Nota final de semestre: %.2f\n", NotaFinal.GetNotaFinal(n1, n2, n3));
                break;
                
            
            case 5:
                // Ejericio 1
                double N1, N2, N3, N4, N5, nf;
                System.out.println("Calcular nota final de semestre");
                System.out.println("Ingrese nota quices y seguimiento: ");
                N1 = input.nextDouble();
                System.out.println("Ingrese nota practica laboratorio: ");
                N2 = input.nextDouble();
                System.out.println("Ingrese nota exposiciones: ");
                N3 = input.nextDouble();
                System.out.println("Ingrese nota proyecto I: ");
                N4 = input.nextDouble();
                System.out.println("Ingrese nota proyecto final: ");
                N5 = input.nextDouble();
                nf = NotaFinal.GetNotaFinal(N1, N2, N3, N4, N5);
                if ( nf >= 0 && nf <= 1)
                  System.out.println("Estas en el lugar equivocado");  
                else if ( nf >= 1.1 && nf <= 2)
                  System.out.println("Remal");
                else if ( nf >= 2.1 && nf <= 3)
                  System.out.println("Es posible recuperarse");
                else if ( nf >= 3.1 && nf <= 4)
                  System.out.println("Normalito");
                else if ( nf >= 4.1 && nf <= 4.5)
                  System.out.println("Muy bien");
                else if ( nf >= 4.6 && nf <= 5)
                  System.out.println("Excelente estudiante");
                break;    
            
            case 6:
                int producto;
                System.out.print("Ingrese producto: ");
                Scanner newInput = new Scanner(System.in);
                producto = newInput.nextInt();
                switch (producto) {
                    case 1:
                       System.out.println("Producto vale $500"); 
                       break;
                    case 2:
                       System.out.println("Producto vale $800"); 
                       break;
                    case 3:
                       System.out.println("Producto vale $300"); 
                       break;
                    case 4:
                       System.out.println("Producto vale $900"); 
                       break;
                    default:
                        System.out.println("Producto no encontrado...");
                }
                break;
             case 7:
                double year = 0, sexo = 0, city = 0;
                double min25 = 0, sFem = 0, cOtr = 0;
                int vig = 1, total = 0;
                
                while (vig != 0){
                    System.out.println("OFICINA DE SEGUROS");
                    System.out.println("Ingrese datos de conductor");
                    //
                    System.out.print("Fecha de nacimiento: ");
                    year = input.nextInt();
                    if ((2016-year) < 25)
                        min25++;
                    //
                    System.out.print("Sexo [1 - Fem], [2 - Mas]: ");
                    sexo = input.nextInt();
                    if (sexo == 1)
                        sFem++;
                    //
                    System.out.print("Ciudad [1 - Med], [2 - Otra]: ");
                    city = input.nextInt();
                    if (city == 2)
                        cOtr++;
                    //
                    total++;
                    // 
                    System.out.print("Continuar [1 - Si], [0 - Terminar]: ");
                    vig = input.nextInt();
                }
                System.out.printf("Porcentaje conductores menores de 25 años: %.1f\n", ((min25*100)/total));
                System.out.printf("Porcentaje conductores sexo femenino: %.1f\n", ((sFem*100)/total));
                System.out.printf("Porcentaje conductores de otra ciudad: %.1f\n", ((cOtr*100)/total));
                break;   
            
            case 8:
                 int num1, num2, lastDigit;
                 System.out.print("Introduzca numero 1: ");
                 num1 = input.nextInt();
                 System.out.print("Introduzca numero 2: ");
                 num2 = input.nextInt();
                 lastDigit = num1%10;
                 switch (lastDigit) {
                     case 0:
                         if (num1 < num2)
                            System.out.printf("%d es mayor que %d\n",num2,num1);
                         else
                            System.out.printf("%d es mayor que %d\n",num1,num2);
                         break;
                     case 1:
                         if (num1 < num2)
                            System.out.printf("%d es menor que %d\n",num1,num2);
                         else
                            System.out.printf("%d es menor que %d\n",num2,num1);
                         break;
                     case 2:
                         System.out.printf("La suma de los dos es: %d\n",num2+num1);
                         break;
                     case 3:
                         System.out.printf("La resta de los dos es: %d\n",num2-num1);
                         break;
                     case 4:
                         System.out.printf("La multiplicacion de los dos es: %d\n",num2*num1);
                         break;
                     case 5:
                         System.out.printf("La division de los dos es: %d\n",num2/num1);
                         break;
                     case 6:
                         if (num1%num2 == 0)
                            System.out.printf("%d es divisible por %d\n",num1,num2);
                         else
                            System.out.printf("%d no es divisible por %d\n",num1,num2);
                         break;
                     case 7:
                         if (num2%num1 == 0)
                            System.out.printf("%d es divisible por %d\n",num2,num1);
                         else
                            System.out.printf("%d no es divisible por %d\n",num2,num1);
                         break;
                     case 8:
                         System.out.printf("La raiz de %d es: %d\n",num1,Math.sqrt(num1));
                         break; 
                     case 9:
                         System.out.print("Que punto tan facil parce...\n");
                         break;
                         
                     default:
                         System.out.print("Que numero mas extraño...! Try Again...!\n");
                 }
                 break;
                
            case 9:
                for (int i = 10; i > 0; i--)
                    System.out.printf("%d\n",i);
                break;
            
            case 10:
                int numero, valido = 0;
                System.out.print("Ingrese un numero: ");
                numero = input.nextInt();
                for (int j = 1; j <= numero; j++){
                    //System.out.println(Fibonacci.fibonacci(j));
                    if (Fibonacci.fibonacci(j) == numero)
                          valido = 1; 
                          //break;
                }
                if (valido == 1)
                    System.out.print("El numero pertenece a la serie Fibonacci\n");
                else
                    System.out.print("El numero no pertenece a la serie Fibonacci\n");
                break;
            
            case 11:
                int num, factorial = 1;
                System.out.print("Ingrese un numero: ");
                num = input.nextInt();
                while (num != 0)
                    factorial = factorial*num;
                    num--;
                System.out.printf("Resultado es: %d\n", factorial);
                break;
                
            default:
                System.out.print("Invalid option... Try Again...! ");
        }
        
    }
    
}

// End Main Program