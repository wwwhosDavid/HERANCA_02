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