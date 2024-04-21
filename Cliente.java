package empresa;

import java.util.Scanner;

public class Cliente {
	String  nombre, codP;
	int nroCajas;

	public Cliente() {
		// TODO Auto-generated constructor stub
		nombre=codP = "";
		nroCajas = 0;
	}
	
	public Cliente(String nom, String cod, int nroC) {
		this.nombre=nom;
		this.codP = cod;
		this.nroCajas = nroC;
	}
	
	public void leer() {
		Scanner lee= new Scanner(System.in);
		System.out.println("Ing nombre de Cliente:");
		nombre = lee.next();
		System.out.println("Ing codP de Cliente:");
		codP = lee.next();
		System.out.println("Ing nroCajas de Cliente:");
		nroCajas = lee.nextInt();
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", codP=" + codP + ", nroCajas=" + nroCajas + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public String getCodP() {
		return codP;
	}

	public int getNroCajas() {
		return nroCajas;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCodP(String codP) {
		this.codP = codP;
	}

	public void setNroCajas(int nroCajas) {
		this.nroCajas = nroCajas;
	}
	
	
	
	
	

}
