/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.testfactorial;

import java.math.BigInteger;

/**
 *
 * @author lizardo
 */
/*
//parámetro de entrada sea un número negativo retornar el mensaje de error "Esta función solo acepta números positivos o cero!!!"
cuando el parámetro de entrada sea un número mayor que 100 deberá retornar el número 9999999999
cuando el parámetro de entrada sea un número menor que 10 los valores retornados deberán ser: 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880 respectivamente

 */
public class factorial {
    
    
    /*
    
        Object resp;
        double res=1;
        long res2=999999999;
        if(num<0){
            resp="Esta función solo acepta números positivos o cero!!!";
        }
        else{
            if(num<11 && num>0){
                for(int i=1;i<num;i++){
                res = res * i;
            }
             resp=res;
            }
            else{
                resp=res2;   
                
            }
        }   */

    public Object factorial(int num) {

        BigInteger fact = new BigInteger("1");
        Object result = null;

        if (num < 0) {
            result = "Esta función solo acepta números positivos o cero!!!";
        }
        else if (num > 100) {
            result = "9999999999";
        } 
        else if (num < 10) {
            result = "1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880";
        }
        else if ((num >= 10) && (num <= 100)) {
            for (int i = 2; i <= num; i++) {
                fact = fact.multiply(BigInteger.valueOf(i));
            }
            result = fact;
        } 
        return result;
    }

    /*public Object factorial(int[] num) {

        BigInteger fact = new BigInteger("1");
        //tring result = "";
        String[] result;

        for (int i = 0; i < num.length; i++) {

            if ((num[i] >= 10) && (num[i] <= 100)) {
                for (int x = 2; x <= num[x]; x++) {
                    fact = fact.multiply(BigInteger.valueOf(x));
                }
                System.out.println(fact.toString());
            } else if (num[i] < 0) {
                System.out.println("Esta función solo acepta números positivos o cero!!!");
            } else if (num[i] > 100) {
                System.out.println("9999999999");
            } else if (num[i] < 10) {
                System.out.println("1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880");
            }
        }
    }*/
}
