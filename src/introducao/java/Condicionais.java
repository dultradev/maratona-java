package introducao.java;

public class Condicionais {
    public static void main() {
        int idade = 20;
        boolean isMaiorDeIdade = idade >= 18;

        if (!isMaiorDeIdade) {
            System.out.println("Você é menor de idade");
        } else {
            System.out.println("Você é maior de idade");
        }

        // nota < 5 reprovado
        // nota >= 5 e nota < 7 recuperação
        // nota >= 7 aprovado
        double nota = 6.5;
        String boletim;
        if (nota < 5) {
            boletim = "Reprovado";
        } else if (nota >= 5 && nota < 7) {
            boletim = "Recuperação";
        } else {
            boletim = "Aprovado";
        }
        System.out.println(boletim);
    }
}