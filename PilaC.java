package empresa;

public class PilaC  {
	
	protected int tope, max;
	protected Object v[] = new Object[100];

	public PilaC(int va) {
		tope = 0;
		max=va;
	}
	
    boolean esvacia ()
    {
	if (tope == 0)
	    return (true);
	return (false);
    }


    boolean esllena ()
    {
	if (tope == max)
	    return (true);
	return (false);
    }
    
	
	int nElem ()
	{
		return (tope);
	}

	void adicionar (Object elem)
	{
		if (!esllena ())
		{
			tope++;
			v [tope] = elem;
		}
		else
			System.out.println ("Pila llena");
	}

	Object eliminar ()
	{
		Object elem = 0;
		if (!esvacia ())
		{
			elem = v [tope];
			tope--;
		}
		else
			System.out.println ("Pila vacia");
		return (elem);
	}

	void mostrar ()
	{
		Object elem;
		if (esvacia ())
			System.out.println ("Pila vacia");
		else
		{
			System.out.println ("\n Datos de la Pila ");
			PilaC aux = new PilaC(100);
			while (!esvacia ())
			{
				elem = eliminar ();
				aux.adicionar (elem);
				System.out.println (elem.toString());
			}
			while (!aux.esvacia ())
			{
				elem = aux.eliminar ();

				adicionar (elem);
			}
		}
	}

	void vaciar (PilaC a)
	{
		while (!a.esvacia ())
			adicionar (a.eliminar ());

	}
	
	

}










