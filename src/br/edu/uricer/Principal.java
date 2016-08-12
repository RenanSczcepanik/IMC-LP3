package br.edu.uricer;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o Sexo:");
        String sexo = sc.next();
        char sexo1 = sexo.charAt(0);
        
        System.out.println("Digite o Peso:");
        double peso = sc.nextDouble();
        
        System.out.println("Digite a Altura:");
        double altura = sc.nextDouble();
        
        CalculoIMC calculo = new CalculoIMC();
        
        calculo.setSexo(sexo1);
        calculo.setPeso(peso);
        calculo.setAltura(altura);
        
        String resultado = calculo.identificarMouF();
        
        System.out.println("Resultado = " + resultado);
    }
    
}
