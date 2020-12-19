/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
public class TestaConta {

    public static void main(String[] args) {
    	Conta conta = new Conta();
    	conta.inicializaConta(100, "20", "Felipe", 25, 1);
    	conta.deposito(10);
    	conta.imprimeDados();
    	conta.saque(20);
    	conta.imprimeDados();
    	conta.saque(200);
    	conta.imprimeDados();
    	
        // Criar um objeto do tipo Conta
        // Usar o metodo inicializaConta para fazer a inicializacao do objeto criado
        // executar um deposito
        // Imprimir o saldo apos o deposito
        // executar um saque cujo valor seja menor que o saldo
        // Imprimir o saldo apos o deposito
        // executar uma retirada cujo valor seja maior que o saldo
        // Imprimir o saldo apos o deposito
    }
}
