package org.factoriaf5.imc;

    public class Imc{

        public static double calcularIMC(double peso, double estatura) {
            return peso / Math.pow(estatura, 2);
        }
    
        public static String interpretarIMC(double imc) {
            if (imc < 18.5) {
                return "Peso inferior al normal";
            } else if (imc >= 18.5 && imc < 24.9) {
                return "Peso normal";
            } else if (imc >= 25 && imc < 29.9) {
                return "Peso superior al normal";
            } else {
                return "Obesidad";
            }
        }
    }
    