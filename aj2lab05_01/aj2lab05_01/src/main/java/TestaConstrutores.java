/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java 
 * 1) Construa um objeto da classe Conta com cada construtor e chame o metodo imprimeDados 
 * 2) Construa um objeto da classe Cliente e chame o metodo imprimeDados
 * 
 */
public class TestaConstrutores {

    public static void main(String[] args) {
    	Conta conta = new Conta();
    	Conta conta1 = new Conta("15", "Felipe", "10", 1);
    	Conta conta2 = new Conta(200, "10", "Joao", "30", 2);
    	conta.imprimeDados();
    	conta1.imprimeDados();
    	conta2.imprimeDados();
    	
    	Cliente cliente = new Cliente();
    	Cliente cliente1 = new Cliente("Maria", "123456");
    	cliente.imprimeDados();
    	cliente1.imprimeDados();
    }
}
