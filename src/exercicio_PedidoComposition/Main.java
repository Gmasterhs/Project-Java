package exercicio_PedidoComposition;

import exercicio_PedidoComposition.entities.Cliente;
import exercicio_PedidoComposition.entities.Pedido;
import exercicio_PedidoComposition.entities.Produto;
import exercicio_PedidoComposition.entities.enums.statusPedido;
import exercicio_PedidoComposition.entities.itemPedido;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/AA");

        System.out.println("Digite os Dados Abaixo: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Data de Nascimento: ");
        String dataNascimento = sc.next();

        LocalDate dataNascimentoConvertida = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Cliente cliente = new Cliente (nome, email, dataNascimentoConvertida);

        System.out.println("Quantos Pedidos? ");
        int n = sc.nextInt();
        System.out.println("Status do Pedido? ");
        String status = sc.next();

        statusPedido statuPedido = statusPedido.valueOf(status);

        Pedido pedido = new Pedido(LocalDateTime.now(), statuPedido, cliente);

        for (int i = 0; i < n; i++)
        {
            System.out.println("Entre Com os Dados de Numero " + i + ":");
            System.out.print("Nome do Produto: ");
            String nomeProduto = sc.next();
            System.out.print("Preco: ");
            double preco = sc.nextDouble();
            System.out.println("Quantidade: ");
            int quantidade = sc.nextInt();

            Produto produto = new Produto(nomeProduto, preco);
            itemPedido item = new itemPedido(quantidade, preco, produto);
            pedido.addItem(item);

        }



    }
}
