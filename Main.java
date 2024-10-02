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

// Criando a classe pessoa
class Pessoa {

    private String nome;
    private String cpf;
    private LocalDate dataNascimento;

    public Pessoa(String nome, String cpf, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    // Usando métodos get e set pois as variáveis estão encapsuladas
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String toString() {
        return "Nome: " + nome + ", Cpf: " + cpf + ", Data de Nascimento: " + dataNascimento;
    }
}

// Criando a classe vendedor
class Vendedor extends Pessoa {

    private LocalDate dataContratacao;
    private double salarioBase;
    private double percentualComissao;

    public Vendedor(String nome, String cpf, LocalDate dataNascimento, LocalDate dataContratacao, double salarioBase, double percentualComissao) {
        super(nome, cpf, dataNascimento);
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
        this.percentualComissao = percentualComissao;
    }

    // Usando métodos get e set pois as variáveis estão encapsuladas
    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public String toString() {
        return super.toString() + ", Data de contratação: " + dataContratacao + ", Salário Base: R$" + salarioBase + ", Percentual de Comissão: " + percentualComissao + "%";
    }
}

// Criando a classe gerente
class Gerente extends Pessoa {

    private LocalDate dataContratacao;
    private double salarioBase;
    private String departamento;

    public Gerente(String nome, String cpf, LocalDate dataNascimento, LocalDate dataContratacao, double salarioBase, String departamento) {
        super(nome, cpf, dataNascimento);
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    // Usando métodos get e set pois as variáveis estão encapsuladas
    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String toString() {
        return super.toString() + ", Data de Contratação: " + dataContratacao + ", Salário base: R$ " + salarioBase + ", Departamento: " + departamento;
    }
}

// Criando a classe cliente
class Cliente extends Pessoa {

    private String email;
    private String numeroCartaoFidelidade;
    private String telefone;

    public Cliente(String nome, String cpf, LocalDate dataNascimento, String email, String numeroCartaoFidelidade, String telefone) {
        super(nome, cpf, dataNascimento);
        this.email = email;
        this.numeroCartaoFidelidade = numeroCartaoFidelidade;
        this.telefone = telefone;
    }

    // Usando métodos get e set pois as variáveis estão encapsuladas
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroCartaoFidelidade() {
        return numeroCartaoFidelidade;
    }

    public void setNumeroCartaoFidelidade(String numeroCartaoFidelidade) {
        this.numeroCartaoFidelidade = numeroCartaoFidelidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String toString() {
        return super.toString() + ", Email: " + email + ", Cartão de Fidelidade: " + numeroCartaoFidelidade + ", Telefone: " + telefone;
    }
}
