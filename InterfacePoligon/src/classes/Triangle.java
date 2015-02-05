package classes;

public class Triangle extends Poligon {
	
	private double altura;
	private double base;
	
	

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (base*altura)/2;
	}
	
	@Override
	public String toString(){
		String info;
		info="La base es "+base+" l'alçada és "+altura+" i té una area de: "+area();
		return info;
	}

}
