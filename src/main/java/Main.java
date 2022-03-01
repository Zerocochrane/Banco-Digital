public class Main {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente("João");
        Cliente cliente2 = new Cliente("Maria");

        Conta cc = new ContaCorrente(cliente1);
        Conta cp = new ContaPoupanca(cliente2);

        cc.depositar(100);
        cc.transferir(cp, 100);

        cc.extrato();
        cp.extrato();
    }
}
