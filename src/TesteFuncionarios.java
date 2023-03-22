public class TesteFuncionarios {
    public static void main(String[] args) {
        CargoGerente a = new CargoGerente();
        a.setNome("Caio");
        a.setCpf("222222222");
        a.setSalario(5000);

        CargoAnalista analista = new CargoAnalista();
        analista.setNome("Alef");
        analista.setCpf("333333333");
        analista.setSalario(2480.0);

        ControleBonificacaoFuncionarios controleBonificacaoFuncionarios = new ControleBonificacaoFuncionarios();
        controleBonificacaoFuncionarios.registra(a);
        System.out.println(controleBonificacaoFuncionarios.getSoma());

        ControleBonificacaoFuncionarios analista1 = new ControleBonificacaoFuncionarios();
        analista1.registra(analista);
        System.out.println(analista1.getSoma());


    }
}
