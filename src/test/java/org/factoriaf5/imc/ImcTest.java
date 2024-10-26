package org.factoriaf5.imc;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ImcTest {
    

        @Test
        public void testCalcularIMC() {
            double imc = Imc.calcularIMC(70, 1.75);
            assertEquals(22.86, imc, 0.01); // Verificar el valor del IMC con una tolerancia de 0.01
        }
    
        @Test
        public void testInterpretarIMC_PesoInferior() {
            String resultado = Imc.interpretarIMC(17);
            assertEquals("Peso inferior al normal", resultado);
        }
    
        @Test
        public void testInterpretarIMC_PesoNormal() {
            String resultado = Imc.interpretarIMC(22);
            assertEquals("Peso normal", resultado);
        }
    
        @Test
        public void testInterpretarIMC_PesoSuperior() {
            String resultado = Imc.interpretarIMC(27);
            assertEquals("Peso superior al normal", resultado);
        }
    
        @Test
        public void testInterpretarIMC_Obesidad() {
            String resultado = Imc.interpretarIMC(31);
            assertEquals("Obesidad", resultado);
        }
    
        // Prueba adicional para borde inferior de peso normal
        @Test
        public void testInterpretarIMC_BordePesoNormal() {
            String resultado = Imc.interpretarIMC(18.5);
            assertEquals("Peso normal", resultado);
        }
    
        // Prueba adicional para borde superior de peso normal
        @Test
        public void testInterpretarIMC_BordePesoNormalSuperior() {
            String resultado = Imc.interpretarIMC(24.9);
            assertEquals("Peso normal", resultado);
        }
    
        // Prueba adicional para borde inferior de sobrepeso
        @Test
        public void testInterpretarIMC_BordeSobrepeso() {
            String resultado = Imc.interpretarIMC(25);
            assertEquals("Peso superior al normal", resultado);
        }
    
        // Prueba adicional para borde superior de sobrepeso
        @Test
        public void testInterpretarIMC_BordeSobrepesoSuperior() {
            String resultado = Imc.interpretarIMC(29.9);
            assertEquals("Peso superior al normal", resultado);
        }
    
        // Prueba adicional para borde inferior de obesidad
        @Test
        public void testInterpretarIMC_BordeObesidad() {
            String resultado = Imc.interpretarIMC(30);
            assertEquals("Obesidad", resultado);
        }
    }