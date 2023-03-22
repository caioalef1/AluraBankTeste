public class CargoAnalista extends Funcionario{
    @Override
    public double getBonificacao() {
        System.out.println("Gerando bonificação do Analista");
        return super.getSalario() + 3000.85;
    }
}


