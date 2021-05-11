/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.Scanner;
/**
 *
 * @author Johnny Reveles
 */
public class Calculadora {
    
    public static void Encabezado(){
    
        System.out.println("-----------------------------------------------------");  
        System.out.println("         UNIVERSIDAD AUTÓNOMA DE CAMPECHE            ");
        System.out.println("              Facultad de Ingeniería           ");
        System.out.println("      Ingeniería en Sistemas Computacionales   ");
        System.out.println("-----------------------------------------------------"); 
        
        }
    
    
    // CUERPO
    
    public static void Cuerpo(){
    
 
        System.out.println("              Lenguaje de programación I             "); 
        System.out.println("-----------------------------------------------------");
        System.out.println("        Alumno: Johnny Abjomar Heredia Reveles       ");
        System.out.println("-----------------------------------------------------");
        
    }
    
    // PIE
    
    public static void Pie(){
    
        System.out.println("-----------------------------------------------------");
        System.out.println("                                           ABRIL 2021"); 
    
    }

    
    
    public static void main(String[] args) {
        
        Encabezado();
        Cuerpo();
        int seleccionOp;
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce dos números y posteriormente elige la operación que deseas realizar");
            
            System.out.println("Primer número:");
            double primerNum = sc.nextDouble();
            
            System.out.println("Segundo número:");
            double segNum = sc.nextDouble();
            
            OperacionesCalc op = new OperacionesCalc();
            op.setNumbers(primerNum, segNum);
            
            System.out.println("Suma                        (1) \nResta                       (2) \nMultiplicación              (3) \nDivisión                    (4)");
            seleccionOp = sc.nextInt();
            
               switch (seleccionOp) {
            case 1:
                System.out.println("Resultado: " + op.Suma());
                break;
            case 2:
                System.out.println("Resultado: " + op.Resta());
                break;
            case 3:
                System.out.println("Resultado: " + op.Multiplicacion());
                break;
            case 4:
                System.out.println("Resultado: " + op.Division());
                break;
            default:    
            System.out.println("Elige un número de operación correcto:");   
                break;    
            }    
         Pie();    
    }
    
    
}
        
    
    

