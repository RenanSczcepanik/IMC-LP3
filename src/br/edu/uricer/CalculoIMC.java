package br.edu.uricer;

public class CalculoIMC {
    private double altura;
    private double peso;
    private char sexo;

    public CalculoIMC() {
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double calculaIMC() {
        double calculo;
        return calculo = peso / (altura * altura);
    }

    public String identificaIMCMasculino() {
        double resultado = calculaIMC();
        ///variaveis de auxilio
        String a = "Peso Ideal";
        String b = "Acima do Peso";
        String c = "Abaixo do Peso";
        if (resultado < 20.7) {
            a = c;
        } else if (resultado > 26.4) {
            a = b;
        }
        return a;
    }

    public String identificaIMCFeminino() {
        double resultado = calculaIMC();
        ///variaveis de auxilio
        String a = "Peso Ideal";
        String b = "Acima do Peso";
        String c = "Abaixo do Peso";
        if (resultado < 19.1) {   ///19.0 - 18.9 ...
            a = c;
        } else if (resultado > 25.8) {  ///25.9 - 26.0 ...
            a = b;
        }
        return a;
    }

    public String identificarMouF() {
        String estado;
        if ('F' == sexo) {
            estado = identificaIMCFeminino();
        } else {
            estado = identificaIMCMasculino();
        }
        return estado;
    }
}
