package br.edu.uricer;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteCalculoIMC {
    
    CalculoIMC testador;    
    @Before
    public void setUp() {
        testador = new CalculoIMC();
    }   
    @Test
    public void deveCalcularIMCAcimaDoPesoM(){
        testador.setSexo('M');
        testador.setAltura(1.50);
        testador.setPeso(80);
        
        String resultadoTest = "Acima do Peso";
        String resultado = testador.identificarMouF();
        assertEquals(resultadoTest, resultado);
    }
    @Test
    public void deveCalcularIMCIdealM(){
        testador.setSexo('M');
        testador.setAltura(1.70);
        testador.setPeso(75);
        
        String resultadoTest = "Peso Ideal";
        String resultado = testador.identificarMouF();
        assertEquals(resultadoTest, resultado);
    }
    @Test
    public void deveCalcularIMCAbaixoDoPesoM(){
        testador.setSexo('M');
        testador.setAltura(1.80);
        testador.setPeso(50);
        
        String resultadoTest = "Abaixo do Peso";
        String resultado = testador.identificarMouF();
        assertEquals(resultadoTest, resultado);
    }
    @Test
    public void deveCalcularIMCAcimaDoPesoF(){
        testador.setSexo('F');
        testador.setAltura(1.65);
        testador.setPeso(85);
        
        String resultadoTest = "Acima do Peso";
        String resultado = testador.identificarMouF();
        assertEquals(resultadoTest, resultado);
    }
    @Test
    public void deveCalcularIMCIdealF(){
        testador.setSexo('F');
        testador.setAltura(1.70);
        testador.setPeso(70);
        
        String resultadoTest = "Peso Ideal";
        String resultado = testador.identificarMouF();
        assertEquals(resultadoTest, resultado);
    }
    @Test
    public void deveCalcularIMCAbaixoDoPesoF(){
        testador.setSexo('F');
        testador.setAltura(1.80);
        testador.setPeso(55);
        
        String resultadoTest = "Abaixo do Peso";
        String resultado = testador.identificarMouF();
        assertEquals(resultadoTest, resultado);
    }  

}
