public class CriarConta {
    private String agencia;
    private String conta;
    private double saldo;
    private String titular;

    public CriarConta(String agencia, String conta, double saldo) {
        this.agencia = agencia;
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public CriarConta(String agencia, String conta, double saldo, String titular) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String transferirSaldo(String agencia, String conta, double valorATransferir, CriarConta destino ){
        if (agencia == this.agencia && conta == this.conta){
            if (valorATransferir <= this.saldo){
                saldo = saldo-valorATransferir;
                destino.setSaldo(valorATransferir);

            }
            else{
                System.out.println("Saldo indisponível");
            }
        }
        else{
            System.out.println("Agencia ou conta incorretos");
        }
        return "Valor transferido";
    }
}
