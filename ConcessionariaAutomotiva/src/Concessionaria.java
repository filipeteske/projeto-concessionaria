
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author User
 */
public class Concessionaria {

    public double faturamento = 0;
    ArrayList<Carros> estoque = new ArrayList<>();
    int proximoCodigo = 1;

    public void addCarro(Carros carro) {
        estoque.add(carro);
        carro.codigo = proximoCodigo++;
    }

    public static void listarCarros(ArrayList<Carros> carros) {

        if (carros.isEmpty()) {
            System.out.println("Nenhum carro cadastrado.");
            return;
        }

        for (Carros c : carros) {
            System.out.println("Codigo: " + c.codigo);
            System.out.println("Marca: " + c.marca);
            System.out.println("Modelo: " + c.modelo);
            System.out.println("Ano: " + c.ano);
            System.out.println("Preco: " + c.preco);
            System.out.println("----------------------");
        }
    }

    public void vender(int codigo) {
        for (int i = 0; i < estoque.size(); i++) {

            if (estoque.get(i).codigo == codigo) {
                faturamento += estoque.get(i).preco;
                estoque.remove(i);
                System.out.println("Carro vendido.");
                return;

            }
        }
        System.out.println("Não encontrado");
    }
}
