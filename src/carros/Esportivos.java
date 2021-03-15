package carros;

public class Esportivos {
	
	private String marca;
	private String modelo;
	private int cavalos;
	private boolean manual;
	private int ano;
	private double zeroCem;
	private double kmLitro;

	
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
	
	
	public Esportivos(String marca, String modelo, int cavalos, boolean manual, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.cavalos = cavalos;
		this.manual = manual;
		this.ano = ano;
	}
	
	public void andar() {
		System.out.println("Vrum vrum vrum");
	}
	
	public int potencia(int cavalo) {
		if(cavalo > 500) {
			System.out.println("Carro com mais de 500cv, Super Esportivo");
		}
		else
		{
			System.out.println("Carro com menos de 300cv, Esportivo de entrada");
		}
		return cavalo;
	}
	
	
	public static void main(String[] args) {
		Esportivos carro01 = new Esportivos("McLaren", "Senna", 1000, false, 2019);
		carro01.setAno(2019);
		carro01.setCavalos(1000);
		carro01.setManual(false);
		carro01.potencia(1000);
		carro01.andar();
		
		Esportivos carro02 = new Esportivos("Ferrari", "F-50", 490, true, 1990);
		carro02.setAno(1990);
		carro02.setCavalos(490);
		carro02.setManual(true);
		carro02.potencia(490);
		carro02.andar();
	}

}
