package empresa;

public class Producto {
	
	private String codP, desc;
	
	private int precio;

	public Producto() {
		codP=desc="";
		precio=0;
	}

	@Override
	public String toString() {
		return "Producto [codP=" + codP + ", desc=" + desc + ", precio=" + precio + "]";
	}

	public String getCodP() {
		return codP;
	}

	public String getDesc() {
		return desc;
	}

	public int getPrecio() {
		return precio;
	}

	public void setCodP(String codP) {
		this.codP = codP;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	

}
