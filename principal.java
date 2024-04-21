package empresa;

public class principal {

	public static void main(String[] args) {
		
//		PilaC a = new PilaC(100);
//		Cliente c1 = new Cliente("juana", "p4", 3);
//		Cliente c2 = new Cliente("juana2", "p5", 3);
//		Cliente c3 = new Cliente("juana3", "p6", 3);
//		
//		a.adicionar(c3);
//		a.adicionar(c2);
//		a.adicionar(c1);
//		
//		a.mostrar();

//		Envio env = new Envio(100);
//		env.leer();
//		
//		env.mostrar();
		//int n = lee.nextInt();
		
		PilaMul pm = new PilaMul(100);
		
		for (int i = 1; i <=2; i++) {
			Envio env = new Envio(100);
			env.leer();
			pm.crear(i, 100);
			pm.adicionar(i, env);
		}
		pm.mostrar();
		
		
	}

}
