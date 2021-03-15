package vertebrados;

public class Cachorro {
	//Definindo atributos
	private String pelagem;
	private char porte;
	private String raça;
	private char genero;
	private float peso;
	private String cor;
	private int idade;
	private boolean vacina;
	private boolean pedrigree;
	
	//Metodos de acesso
	//Get, sempre tera um retorno (return)
	//Set, sempre sera void(vazio) portanto nao retornara nada, porem ele modifica o valor.
	public String getPelagem() {
		return pelagem;
	}

	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}

	public char getPorte() {
		return porte;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isVacina() {
		return vacina;
	}

	public void setVacina(boolean vacina) {
		this.vacina = vacina;
	}

	public boolean isPedrigree() {
		return pedrigree;
	}

	public void setPedrigree(boolean pedrigree) {
		this.pedrigree = pedrigree;
	}
	
	//Metodo construtor, so sera executado no ato da construcao do objeto
	//Metodo construtor precisa ter o mesmo nome da classe
	public Cachorro(String raça, String cor1, char gen) {
		//Atualizando os atributos do objeto com os dados que foram passados
		//Usa o this quando o nome e igual ao atributo e paramtro
		this.raça = raça;
		cor = cor1;
		this.genero =  gen;
	}
	
	//Metodos das classes, que iram interagir e fazer as acoes
	public void latir() {
		System.out.println("au, au, au");
	}
	
	public void abanarRabo() {
		System.out.println("Abanar...");
	}
	//Metodo com retorno
	
	public boolean sentar(boolean obd) {
		if (obd) {
			System.out.println("Sentar");
		}
		else
		{
			System.out.println("Tudo menos sentar");
		}
		
		return obd;
	}
	
	public static void main(String[] args) {
		//Criando os objetos para testar a classe
		//Criacao do objeto sempre deve ser feita no main
		
		//Passar os atributos obrigatorios (raca, cor e genero)
		Cachorro o1 = new Cachorro("pitbull", "branco", 'M');
		o1.setIdade(5);
		
		Cachorro o2 = new Cachorro("pastor alemao", "bege", 'M');
		o2.latir();
		
		Cachorro o3 = new Cachorro("vira lata", "caramelo", 'F');
		o3.sentar(false);
		
		Cachorro o4 = new Cachorro("vira lata", "preto", 'F');
		o4.sentar(true);
		
	}

}
