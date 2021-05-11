/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Johnny Reveles
 */
public class OperacionesCalc {
    
    double primerNum, segNum;
    
    public void setNumbers(double a, double b){
        
        this.primerNum = a;
        this.segNum = b;
        
    }
    
    
    public double Suma(){
    
        return primerNum + segNum;
        
    }
    
    
     public double Resta(){
    
        if (primerNum > segNum){
            return primerNum - segNum;
        } else {
            return segNum - primerNum;
        }
         
    }
     
     
      public double Multiplicacion(){
    
        return primerNum * segNum;
    }
      
      
    public double Division(){

    if (primerNum > segNum){
        return primerNum / segNum;
    } else {
        return segNum / primerNum;
    }
         
    }
    
}
    

