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
