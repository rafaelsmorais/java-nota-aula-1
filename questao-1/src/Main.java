import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite nome do aluno: ");
        String nome = sc.nextLine();
        System.out.println(("Digite primeira nota: "));
        double nota1 = sc.nextDouble();
        System.out.println(("Digite segunda nota: "));
        double nota2 = sc.nextDouble();
        System.out.println(("Digite terceira nota: "));
        double nota3 = sc.nextDouble();
        Aluno a = new Aluno(nome, nota1, nota2, nota3);
        a.exibirDetalhesAluno();
    }
}