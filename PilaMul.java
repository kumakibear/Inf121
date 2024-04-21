package empresa;

public class PilaMul {
	
	int np, max;
	
//	PilaNormal pm[] = new PilaNormal[100];
	Envio pm[] = new Envio[100];
	

	public PilaMul(int n) {
		np = 0;
		max = n;
	}
	
	void crear(int i, int n) {
		pm[i]= new Envio(n);
		np = np+1;
	}
	//[null, null,null]
	
//	boolean esVacia(int i) {
//		return pm[i].esvacia();
//	}
//	// pila del obbjeto Envio
//	boolean esVacia(int i) {
//	return pm[i].getPp().esvacia();
//}
////	// pila del obbjeto Envio
//	boolean elLlena(int i) {
//		return pm[i].getPp().esllena();
//	}
	
	void adicionar(int i, Object ele) {
//		pm[i].setPlaca("");
//		pm[i].setZona("zona");
//		
//		pm[i].getPp().adicionar(ele); // pila objeto envio
		pm[i] = (Envio) ele;
		//pm[i] = ele;

	}
	
	
	
	Object eliminar(int i) {
		//return pm[i].eliminar();
		return pm[i];
		
	}
	
	void mostrar(int i) { // mostrar la pila de una posicion 
		pm[i].mostrar();
	}
	
	// mostrar toda la multipila
	
	void mostrar() {
		for (int i = 1; i <=np; i++) {
			mostrar(i);
		}
	}
	
	int nroElem() { // totalidad de datos que se sencuentra en la MultiplePila
		int s = 0;
		for (int i = 1; i <=np; i++) {
//			s = s + pm[i].nElem();
			s = s + 1;
		}
		return s;
	}
	
	int nroElem(int i) { // totalidad de datos que se sencuentra en la MultiplePila
		
		return pm[i].getPp().nElem();
	}


	public int getNp() {
		return np;
	}

	public void setNp(int np) {
		this.np = np;
	}



}
