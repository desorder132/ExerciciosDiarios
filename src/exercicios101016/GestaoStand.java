package exercicios101016;

import java.util.ArrayList;

public class GestaoStand {
	
	ArrayList _transaccoes;
	ArrayList _automoveis;
	ArrayList _clientes;
	
	public GestaoStand (){
		
		Automovel newAuto = criarCarro();
		_automoveis.add(newAuto);
		Cliente c = new Cliente("Bruno", "Seixal", "932351760", 123456789);
		Cliente c2 = new Cliente ("Fabio", "Pinhal", "923456132", 987654321);
		_clientes.add(c);
		_clientes.add(c2);
		
		Transaccao crenault = new Transaccao(Transaccao.COMPRA, newAuto, c, 1200);
		
		_transaccoes.add(crenault);
		
		Transaccao vreanult = new Transaccao(Transaccao.VENDA, newAuto, c2, 1700);
		
		_transaccoes.add(vreanult);
		
	}
	
	public Automovel criarCarro () {
		Automovel a = new Automovel (2500, 1600, "Renault", "Megane", 120000, 2002);
		Automovel b = new Automovel (3000, 1600, "Audi", "A3", 200000, 2004);
		return a;
		
	}
	
	public Cliente criarCliente () {
		Cliente c = new Cliente("Bruno", "Seixal", "932351760", 123456789);
		return c;
		
	}
	
	public Transaccao comprarCarro (Automovel carro, Cliente c) {
		return null;
		
		
	}
	
	public Transaccao venderCarro(Automovel carro, Cliente c){
		return null;
		
		
	}
	
	
	

}
