public class ControleBonificacaoFuncionarios {

    private double soma;

    public void registra(Funcionario f){
        double bonificacao = f.getBonificacao();
        this.soma = this.soma + bonificacao;
    }

    public double getSoma(){
        return soma;
    }
}
