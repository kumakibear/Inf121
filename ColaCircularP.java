package empresa;

public class ColaCircularP {
	
	protected int ini, fin, max;
	protected Object v[] = new Object[100];

	public ColaCircularP(int va) {
		ini=fin=0;
		max=va;
	}
	
	boolean esVacia() {
		if(nElem()==0)
			return true;
		return false;
	}
	
	boolean esLlena() {
		if(nElem()==(max-1))
			return true;
		return false;
	}
	
	void adicionar(Object elem) {
		if(!esLlena()) {
			fin = (fin+1)%max;
			v[fin]=elem;
		}
		else System.out.println(" Cola Circular Llena");
	}
	
	Object eliminar() {
		Object elem = null;
		if(!esVacia()) {
			ini = (ini+1)%max;
			elem = v[ini];
		}
		else System.out.println(" Cola Circular Vacia");
		return elem;
	}
	
	void mostrar() {
		Object elem;
		int n = nElem();
		if(!esVacia()) {
			while(n>0) {
				elem = eliminar();
				n--;
				System.out.print(elem+ "\t");
				adicionar(elem);
			}
			System.out.println();
		}
		else System.out.println(" Cola Circular Vacia");
	}
	
	void vaciar(ColaCircularP Z) {
		while(!Z.esVacia())
			adicionar(Z.eliminar());
	}
	
	int nElem() {
		return ((fin-ini+max)%max);
	}

}

