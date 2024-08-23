package main.java.desafio.IndiceDeMassa;
class Paciente {
    double altura;
    double peso;

    IMC calcularIndiceDeMassaCorporal() {
        IMC imc = new IMC();
        imc.indice = peso / (altura * altura);
        if (imc.indice < 18.5) {
            imc.abaixoDoPesoIdeal = true;
        } else if (imc.indice < 25) {
            imc.pesoIdeal = true;
        } else {
            imc.obeso = true;
        }

        if (imc.indice <= 18.5) {
            imc.grauDeObesidade = "Abaixo do peso";
        } else if (imc.indice > 18.5 && imc.indice <= 25) {
            imc.grauDeObesidade = "Peso ideal";
        } else if (imc.indice > 25 && imc.indice <= 30) {
            imc.grauDeObesidade = "Acima do peso";
        } else if (imc.indice > 30 && imc.indice <= 35) {
            imc.grauDeObesidade = "I";
        } else if (imc.indice > 35 && imc.indice <= 40) {
            imc.grauDeObesidade = "II";
        } else {
            imc.grauDeObesidade = "III";
        }
        return imc;

    }
}

class IMC {
    double indice;
    boolean abaixoDoPesoIdeal;
    boolean pesoIdeal;
    boolean obeso;
    String grauDeObesidade;
}

public class IndiceDeMassa {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        paciente.altura = 1.85;
        paciente.peso = 110.0;
        IMC imc = paciente.calcularIndiceDeMassaCorporal();
        System.out.printf("Seu IMC: %.2f", imc.indice);
        System.out.println(" - Grau de obesidade: " + imc.grauDeObesidade);

    }

}
