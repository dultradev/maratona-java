package introducao.java;

public class Operadores {
    static void main() {
        // + - / *
        int n1 = 10;
        int n2 = 20;
        double n3 = 20.0;
        int soma = n1 + n2;
        int multi = n1 * n2;
        double div = n1 / n2;
        double divD = n1 / n3;
        System.out.println("Divisão de inteiros = "+ divD+ ", " +
                "já divisão por um double é =" +div);
        System.out.println(soma + multi);

        // resto %
        int r1 = 20 % 2;
        int r2 = 21 % 2;
        System.out.println("Par = " +r1+" ímpar = "+r2);

        // < > <= >= == !=
        boolean isDezMaiorqueVinte = 10 > 20;
        boolean isDezMenorqueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDifereneDez = 10 != 10;

        System.out.println(isDezMaiorqueVinte);
        System.out.println(isDezMenorqueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDifereneDez);

        // && (And)  || (Or)
        int age = 29;
        float salary = 3500f;
        boolean isRightAndAbove30 = age >= 30 && salary >= 4612;
        boolean isRightandLower30 = age < 30 && salary >= 3381;

        System.out.println(isRightAndAbove30);
        System.out.println(isRightandLower30);

        double ContaCorrente = 200;
        double ContaPoupanca = 10000;
        double Ps5 = 4400f;

        boolean BuyPs5 = ContaCorrente > Ps5 || ContaPoupanca > Ps5;
        System.out.println(BuyPs5);

        // = += -= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus++;
        System.out.println(bonus);

    }
}
