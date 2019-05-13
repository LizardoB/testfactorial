/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.testfactorial;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lizardo
 */
public class factorialTest {
    
    
    @Test
    public void testFactorial1() {
        System.out.println("Numero negativo");
        int num = -1;
        factorial instance = new factorial();
        Object resultadoObtenido = instance.factorial(num);
        Object resultadoEsperado = "Esta función solo acepta números positivos o cero!!!";
        
        assertTrue(resultadoObtenido instanceof Object);
        assertEquals("\n\n\nFallo en el test\n\n\n",resultadoEsperado, resultadoObtenido);
        
    }
    
    @Test
    public void testFactorial2() {
        System.out.println("Numeros mayores a 100");
        int num = 101;
        factorial instance = new factorial();
        Object resultadoObtenido = instance.factorial(num);
        Object resultadoEsperado = "9999999999";
        
        assertTrue(resultadoObtenido instanceof Object);
        assertEquals("\n\n\nFallo en el test\n\n\n",resultadoEsperado, resultadoObtenido);
        
    }
    
    @Test
    public void testFactorial3() {
        System.out.println("Numeros menores a 10");
        int num = 9;
        factorial instance = new factorial();
        Object resultadoObtenido = instance.factorial(num);
        Object resultadoEsperado = "1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880";
        
        assertTrue(resultadoObtenido instanceof Object);
        assertEquals("\n\n\nFallo en el test\n\n\n",resultadoEsperado, resultadoObtenido);
        
    }
    
    @Test
    public void testFactorial4() {
        System.out.println("Array numero negativo");
        int[] num = {102,-1};
        factorial instance = new factorial();
        Object resultadoObtenido = instance.factorial(num);
        Object[] resultadoEsperado = {"9999999999","Esta función solo acepta números positivos o cero!!!"};
        
        assertTrue(resultadoObtenido instanceof Object);
        assertEquals("\n\n\nFallo en el test\n\n\n",resultadoEsperado, resultadoObtenido);
        
    }
    
}
