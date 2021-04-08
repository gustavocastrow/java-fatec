package conjunto;

import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;


public class TesteConjunto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set: nâo garante a ordem e não aceita elementos duplicados
		HashSet conjunto = new HashSet();
		
		conjunto.add("Honda");
		conjunto.add("Toyota");
		conjunto.add("Chevrolet");
		conjunto.add("Fiat");
		conjunto.add("Cherry");
		conjunto.add("Renault");

		System.out.println(conjunto.toString());
		
		conjunto.remove("Fiat");
		System.out.println(conjunto.toString());
		
		//map: Relação chave valor, primeiro elemento é chave o segundo valor
		HashMap mp = new HashMap();
		mp.put("Honda", "Civic");
		mp.put("Honda", "Fit");
		mp.put("Toyota", "Corolla");
		mp.put("Cherry", "Arizzo");
		mp.put("Renault", "Sandero RS");
		
		
		System.out.println(mp.get("Honda"));
		System.out.println(mp.get("Toyota"));
		System.out.println(mp.get("Cherry"));
		System.out.println(mp.get("Renault"));
		
		//list: Coleção ordenada, elemento permanece na ordem que foi inserido


	}
}