package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {



    @Test
    void multiplicar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(240, calculadora.multiplicar(80, 3));
    }
    @Test
    void sumarYDividir() {
        Calculadora calculadora = new Calculadora();
       assertEquals(110,calculadora.sumar(150, 180) / 3 );
    }
    @Test
    void restarYMultiplicar(){
        Calculadora calculadora = new Calculadora();
        assertNotEquals(605,calculadora.restar(90,50)*15);
    }
@Test
    void sumarYMultiplicar() {
        Calculadora calculadora = new Calculadora();
        assertNotEquals(2700,calculadora.sumar(70,40)*25);
    }
}