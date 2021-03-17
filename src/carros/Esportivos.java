package carros;

public class Esportivos {
	
	private String marca;
	private String modelo;
	private int cavalos;
	private boolean manual;
	private int ano;
	private double zeroCem;
	private double kmLitro;

	//Metodos de acesso:
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCavalos() {
		return cavalos;
	}

	public void setCavalos(int cavalos) {
		this.cavalos = cavalos;
	}

	public boolean isManual() {
		return manual;
	}

	public void setManual(boolean manual) {
		this.manual = manual;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	//Metodo construtor
	public Esportivos(String marca, String modelo, int cavalos, boolean manual, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.cavalos = cavalos;
		this.manual = manual;
		this.ano = ano;
	}
	
	public void andar() {
		System.out.println("" + marca + " " + modelo + " acelerando...");
	}
	
	public int potencia(int cavalo) {
		if(cavalo > 700) {
			System.out.println("" + marca + " " + modelo + " com mais de 700cv, carro Super Esportivo ");
		} else if (cavalo > 300 ){
			System.out.println("" + marca + " " + modelo + " com mais de 300cv e menos de 700cv, carro Esportivo ");
		}
		else {
			System.out.println("" + marca + " " + modelo + " com menos de 300cv, carro Comum");
		}
		return cavalo;
	}
	
	public static void main(String[] args) {
		Esportivos carro01 = new Esportivos("Lamborghini", "Aventador SVJ", 770, false, 2020);
		carro01.andar();
		carro01.potencia(770);
		
		System.out.println("__________________________________________________________");
	
		Esportivos carro02 = new Esportivos("Subaru", "WRX-STI", 310, true, 2018);
		carro02.andar();
		carro02.potencia(310);
		
		System.out.println("__________________________________________________________");
		
		Esportivos carro03 = new Esportivos("Honda", "Civic", 210, false, 1990);
		carro03.andar();
		carro03.potencia(210);
	}

}
