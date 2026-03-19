import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Concessionaria c = new Concessionaria();

        Scanner e = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 5) {

            System.out.println("Escolha uma opcao");
            System.out.println("1 = Adicionar carro");
            System.out.println("2 = Listar carro");
            System.out.println("3 = Vender carro");
            System.out.println("4 = Ver faturamento");
            System.out.println("5 = Sair");

            System.out.println("Escolha uma opcao");
            opcao = e.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Marca");
                    String marca = e.next();

                    System.out.println("Modelo");
                    String modelo = e.next();

                    System.out.println("Ano");
                    int ano = e.nextInt();

                    System.out.println("Preco");
                    double preco = e.nextDouble();

                    Carros carro = new Carros();
                    carro.marca = marca;
                    carro.modelo = modelo;
                    carro.ano = ano;
                    carro.preco = preco;

                    c.addCarro(carro);

                    System.out.println("Carro adicionado ao estoque");
                    break;

                case 2:
                    Concessionaria.listarCarros(c.estoque);

                    break;

                case 3:
                    System.out.println("Digite o codigo do veiculo");
                    int codigo = e.nextInt();
                    c.vender(codigo);

                    break;

                case 4:
                    System.out.println("Seu faturamento atual é de:" + c.faturamento);
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao invalida");
            }
        }
    }
}



