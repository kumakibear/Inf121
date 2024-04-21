package empresa;

import java.util.Scanner;

public class Envio {
	
	private String placa, zona;
	PilaC pp;

	public Envio(int num) {
		placa = zona= "";
		pp = new PilaC(num);
	}
	
	public void leer() {
		
		Scanner lee= new Scanner(System.in);
		System.out.println("Ing placa del Envio:");
		placa = lee.next();
		System.out.println("Ing zona del Envio:");
		zona = lee.next();
		System.out.println("Ing nro de CLientes");
		int n = lee.nextInt();
		Cliente clie = new Cliente();
		for (int i = 1; i <= n; i++) { // 01 	
			clie.leer();
			pp.adicionar(clie);
		}
		
	}
//
//	@Override
//	public String toString() {
//		return "Envio [placa=" + placa + ", zona=" + zona + ", pp=" + pp.toString() + "]";
//	}
	
	public void mostrar() {
		System.out.println("Envio [placa=" + placa + ", zona=" + zona );
		pp.mostrar();
	}

	public String getPlaca() {
		return placa;
	}

	public String getZona() {
		return zona;
	}

	public PilaC getPp() {
		return pp;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public void setPp(PilaC pp) {
		this.pp = pp;
	}
	
	
	
	
	


}
