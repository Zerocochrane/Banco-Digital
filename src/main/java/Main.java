public class Main {
    public static void main(String[] args){
        Banco bb = new Banco("Banco do Brasil");

        Cliente cliente1 = new PessoaFisica("João", "PF");
        Cliente cliente2 = new PessoaFisica("Maria", "PF");
        Cliente cliente3 = new PessoaJuridica("MRS", "PJ");

        Conta cc = cliente1.abrirContaCorrente();
        Conta cp = cliente2.abrirContaPoupanca();
        Conta pj = cliente3.abrirContaCorrente();

        bb.adicionarConta(cc);
        bb.adicionarConta(cp);
        bb.adicionarConta(pj);

        cc.depositar(150);
        cc.transferir(cp, 100);

        cc.extrato();
        cp.extrato();

        bb.imprimirClientes();
    }
}
