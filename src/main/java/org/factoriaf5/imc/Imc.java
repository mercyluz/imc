package org.factoriaf5.imc;

    public class Imc{

        public static double calcularIMC(double peso, double estatura) {
            return peso / Math.pow(estatura, 2);
        }
    
        public static String interpretarIMC(double imc) {
            if (imc < 16) {
                return "Delgadez severa";
            } else if (imc >= 16 && imc < 17) {
                return "Delgadez Moderada";
            } else if (imc >= 17 && imc < 18.5) {
                return "Delgadez Leve";    
            } else if (imc >= 18.5 && imc < 25) {
                return "Peso normal";
            }    else if (imc >= 25 && imc < 30) {
                    return "Sobrepeso";
            } else if (imc >= 30 && imc < 35) {
                        return "Obesidad Leve";
            } else if (imc >= 35 && imc < 40) {
                        return "Obesidad Moderada";  
            } else {
                return "Obesidad Morbida";
            }
        }
    }
    