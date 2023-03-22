
public class CargoGerente extends Funcionario {


    @Override
    public double getBonificacao() {
        System.out.println("Gerando bonificação do gerente");
        return super.getBonificacao() + super.getSalario();
    }
}
