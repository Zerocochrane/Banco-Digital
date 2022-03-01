public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    @Override
    public void extrato() {
        System.out.println("=== Estrato da Conta Corrente ===");
        super.imprimirInfoComum();
    }

}
