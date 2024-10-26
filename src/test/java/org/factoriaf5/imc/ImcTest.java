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
        public void testInterpretarIMC_Delgadezsevera() {
            String resultado = Imc.interpretarIMC(15);
            assertEquals("Delgadez severa", resultado);
        }
        @Test
        public void testInterpretarIMC_Delgadezmoderada() {
            String resultado = Imc.interpretarIMC(16);
            assertEquals("Delgadez Moderada", resultado);
        }
    
        @Test
        public void testInterpretarIMC_Delgadezleve() {
            String resultado = Imc.interpretarIMC(18);
            assertEquals("Delgadez Leve", resultado);
        }
    
        @Test
        public void testInterpretarIMC_Normal() {
            String resultado = Imc.interpretarIMC(20);
            assertEquals("Peso normal", resultado);
        }    
        @Test
        public void testInterpretarIMC_BordeSobrepesoSuperior() {
            String resultado = Imc.interpretarIMC(31);
            assertEquals("Obesidad Leve", resultado);
        }
        @Test
        public void testInterpretarIMC_BordeObesidadModerada() {
            String resultado = Imc.interpretarIMC(38);
            assertEquals("Obesidad Moderada", resultado);
        }
        @Test
        public void testInterpretarIMC_BordeObesidadMorbida() {
            String resultado = Imc.interpretarIMC(41);
            assertEquals("Obesidad Morbida", resultado);
        }
    }