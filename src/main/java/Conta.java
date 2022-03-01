public abstract class Conta implements iConta{

    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 0;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public void Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0.0;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }
    @
    Override
    public void depositar(double valor) {
        this.saldo += valor;
    }
    @
    Override
    public void transferir(Conta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfoComum(){
        System.out.println(String.format("Agencia %d", this.agencia));
        System.out.println(String.format("Numero %d", this.numero));
        System.out.println(String.format("Saldo %.2f", this.saldo));
    }


    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
