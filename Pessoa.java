package monitoria_12;

public class Pessoa {
	
	protected String nome;
	protected int idade;
	protected String genero;
	protected boolean ePrioridade;
	
	
	public Pessoa(String nome, int idade, String genero, boolean ePrioridade) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.ePrioridade = ePrioridade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public boolean isePrioridade() {
		return ePrioridade;
	}


	public void setePrioridade(boolean ePrioridade) {
		this.ePrioridade = ePrioridade;
	}
	
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", genero=" + genero + ", ePrioridade=" + ePrioridade
				+ "]";
	}
	

}
