import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scNextLine = new Scanner(System.in);
        boolean repetir = false;
        Produto p = new Produto();
        Venda v = new Venda();
        do {
            System.out.println("Digite o código da operação: ");
            System.out.println("1 - Cadastro de Produto ");
            System.out.println("2 - Realizar Venda ");
            int escolha = sc.nextInt();
            if (escolha == 1) {
                System.out.println("Digite código do produto:");
                int codigo = sc.nextInt();
                p.setCodigo(codigo);
                System.out.println("Digite o nome do produto:");
                String nome = scNextLine.nextLine();
                p.setNome(nome);
                System.out.println("Digite o peso do produto em quilogramas:");
                double peso = sc.nextDouble();
                p.setPeso(peso);
                System.out.println("Digite a cor do produto:");
                String cor = scNextLine.nextLine();
                p.setCor(cor);
                System.out.println("Informe o valor em Reais do produto:");
                double valor = sc.nextDouble();
                p.setValor(valor);
                System.out.println("Informe a quantidade em estoque:");
                int quantidade = sc.nextInt();
                p.setQuantidade(quantidade);
                System.out.println("Produto cadastrado com sucesso:");
                System.out.println("Código: " + p.getCodigo());
                System.out.println("Nome: " + p.getNome());
                System.out.println("Peso: " + p.getPeso() + "kg");
                System.out.println("Cor: " + p.getCor());
                System.out.println("Valor: " + p.getValor());
                System.out.println("Quantidade: " + p.getQuantidade());
            } else if (escolha == 2) {
                v.setValorProduto(p.getValor());
                System.out.println("Informe Quantidade de Produtos:");
                int quantidade = sc.nextInt();
                v.setQuantidade(quantidade);
                System.out.println("Informe meio de pagamento [pix|dinheiro|transferencia|debito|credito");
                String metodoPagamento = scNextLine.nextLine();
                v.setMetodoPagamento(metodoPagamento);
                v.setValorCompra();
                System.out.println("Valor da Compra: " + v.getValorCompra());
                if ( metodoPagamento.equalsIgnoreCase("dinheiro")) {
                    System.out.println("Informe Valor Pago: ");
                    double valorPagamento = sc.nextDouble();
                    v.setValorPagamento(valorPagamento);
                    v.setTroco();
                    System.out.println("Troco: " + v.getTroco());
                }
            }
            System.out.println("Deseja realizar outra operação? [s|n]");
            String vaiRepetir = scNextLine.nextLine();
            if (vaiRepetir.equalsIgnoreCase("s")) {
                repetir = true;
            } else if (vaiRepetir.equalsIgnoreCase("n")) {
                repetir = false;
            }
        } while (repetir);
    }
}