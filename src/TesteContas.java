public class TesteContas {
    public static void main(String[] args) {

        CriarConta conta1 = new CriarConta("0001", "34532-6", 8000.60);
        conta1.setSaldo(8000);
        System.out.println(conta1.getConta());
        System.out.println(conta1.getAgencia());
        System.out.println(conta1.getSaldo());

        System.out.println("------ Finalizando dados da CONTA 1 --------");


        /**
         * Criando uma segunda conta para testar a transferencia de valor;
         */

        CriarConta conta2 = new CriarConta("0002", "2222-2", 0);
        System.out.println(conta2.getConta());
        System.out.println(conta2.getAgencia());
        System.out.println(conta2.getSaldo());

        System.out.println("------ Finalizando dados da CONTA 2 --------");



        conta1.transferirSaldo("0002","2222-2",40,conta1);
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());



    }
}
