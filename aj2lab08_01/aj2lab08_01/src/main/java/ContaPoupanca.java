/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * Tarefas: 
 * 1) Faca com que a classe ContaPoupanca estenda a classe Conta 
 * 2) Adicione o atributo data de aniversario (dataAniversario) a classe ContaPoupanca,
 *  declarando-o como String e encapsule o atributo 
 * 3) Crie um construtor para a classe ContaPoupanca obrigando a passagem da data de 
 *  aniversario e todos os parametros necessarios para abertura de Conta 
 * 4) Faca override do metodo imprimeDados fazendo com que ele imprima
 *  tambem a data de aniversario e o tipo da conta (CONTA POUPANCA) em seu cabecalho
 */
public class ContaPoupanca extends Conta {
	private String dataAniversario;

	public String getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(String dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	public ContaPoupanca(double saldoInicial, String num, Cliente tit, Agencia ag, String dat) {
		super(saldoInicial, num, tit, ag);
		this.dataAniversario = dat;
	}
	public ContaPoupanca(String num, Cliente tit, Agencia ag, String dat) {
		this(0, num, tit, ag, dat);
		this.dataAniversario = dat;
	}
	@Override
	public void imprimeDados() {
		super.imprimeDados();
		System.out.println("Conta poupanca");
		System.out.println(getDataAniversario());
	}
}
