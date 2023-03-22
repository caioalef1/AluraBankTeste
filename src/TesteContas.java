public class TesteContas {
    public static void main(String[] args) {
        CriarConta conta = new CriarConta("0001", "34532-6", 0);
        System.out.println(conta.getConta());
        System.out.println(conta.getAgencia());
        System.out.println(conta.getSaldo());

    }
}
