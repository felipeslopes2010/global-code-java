/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
class TestaConta {

    public static void main(String[] args) {
        // Criacao da conta
        // Inicializacao da conta
        // Impressao dos dados da conta
        // Saque da conta
        // Impressao dos dados da conta
        // Deposito em conta
        // Impressao dos dados da conta
    	Conta conta = new Conta();
    	conta.inicializaConta(100, "1", "10", 250, 32);
    	conta.imprimeDados();
    	conta.saque(10);
    	conta.imprimeDados();
    	conta.deposito(20);
    	conta.imprimeDados();
    }
}
