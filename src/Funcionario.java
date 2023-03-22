public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public double getBonificacao(){
        return this.salario * 0.03;
    }

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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public String FuncinariotoString() {
        return "Funcionario tem o " +
                "nome de: " + nome +
                ",e cpf: " + cpf +
                ",com um salario de: " + salario ;
    }
}
