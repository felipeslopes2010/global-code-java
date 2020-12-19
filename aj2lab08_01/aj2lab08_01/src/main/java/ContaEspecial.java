/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * Tarefas: 
 * 1) Faca com que a classe ContaEspecial estenda a classe Conta 
 * 2) Adicione o atributo limite do tipo double e o encapsule 
 * 3) Crie construtores da classe obrigando a passagem do valor do limite na criacao de objetos 
 *  e todos os parametros necessarios anteriormente. 
 * 4) Faca override do metodo imprimeDados fazendo com que ele imprima tambem o
 *  valor do limite alem do tipo da conta (CONTA ESPECIAL) 
 * 5) Faca override do metodo saque para que ele considere o limite na hora de 
 *    verificar se existe ou nao saldo disponivel.
 *    Faca tambem com que este metodo acumule o CPMF devido.
 */
public class ContaEspecial extends Conta {
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public ContaEspecial(double saldoInicial, String num, Cliente tit, Agencia ag, double limite) {
		super(saldoInicial, num, tit, ag);
		setLimite(limite); //mesma coisa que this.limite = limite;
	}
	public ContaEspecial(String num, Cliente tit, Agencia ag, double limite) {
		super(num, tit, ag);
		this.limite = limite;
	}
	@Override
	public void imprimeDados() {
		super.imprimeDados();
		System.out.println("Esta conta é especial");
		System.out.println(limite);
	}

	public void saque(double valor) {
		super.saque(valor);
		if (valor < saldo) {
			getIFNAcumulado();
			System.out.println("Voce pode sacar");
		} else {
			System.out.println("Voce nao pode sacar");
		}
		
	}
}
