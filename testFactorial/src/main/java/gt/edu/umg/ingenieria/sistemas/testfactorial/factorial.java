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

public class factorial {
    
    public Object factorial(int num) {

        BigInteger fact = new BigInteger("1");
        Object result = null;

        if (num < 0) {
            result = "Esta función solo acepta números positivos o cero!!!";
        }
        else if (num > 100) {
            result = "9999999999";
        } 
        else if ((num >= 0) && (num <= 100)) {
            for (int i = 2; i <= num; i++) {
                fact = fact.multiply(BigInteger.valueOf(i));
            }
            result = fact;
        } 
        return result;
    }

    public Object factorial(int[] num) {

        BigInteger fact = new BigInteger("1");
        String[] result = null;

        for (int i = 0; i < num.length; i++) {

            if ((num[i] >= 0) && (num[i] <= 100)) {
                for (int x = 2; x <= num[x]; x++) {
                    fact = fact.multiply(BigInteger.valueOf(x));
                }
                result[i]=fact.toString();
            } else if (num[i] < 0) {
                result[i] = "Esta función solo acepta números positivos o cero!!!";
            } else if (num[i] > 100) {
                result[i] = "9999999999";
            }
        }
        
        return result;
    }
}
