public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        double somaNotas = this.nota1 + this.nota2 + this.nota3;
        return somaNotas / 3;
    }

    public String verificarAprovacao() {
        if (this.calcularMedia() >= 7.0) {
            return "Aprovado";
        } else if (this.calcularMedia() >= 4.0 && this.calcularMedia() <= 6.9) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public void exibirDetalhesAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("Notas: " + nota1 + " " + nota2 + " " + nota3);
        System.out.printf("Média: %.2f\n", this.calcularMedia());
        System.out.println("Situação: " + this.verificarAprovacao());
    }
}
