import java.time.LocalDate; // Importando para conseguir colocar datas


public class Main {
    public static void main(String[] args) {

    // Criando um objeto vendedor
    Vendedor vendedor = new Vendedor("Carlos Silva", "123.456.789-10", LocalDate.of(1985, 3, 22), LocalDate.of(2010, 5, 15), 2500.00, 10.5);
    System.out.println(vendedor);

    // Criando um objeto gerente
    Gerente gerente = new Gerente("Ana Souza", "999.888.777-66", LocalDate.of(1978, 7, 19), LocalDate.of(2008, 1, 10), 4500.00, "Vendas");
    System.out.println(gerente);

    // Criando um objeto cliente
    Cliente cliente = new Cliente("João Frango", "111.222.333-44", LocalDate.of(1990, 8, 15), "joao@gmail.com", "12345-678", "(11) 4002-8922");
    System.out.println(cliente);
    }
}
