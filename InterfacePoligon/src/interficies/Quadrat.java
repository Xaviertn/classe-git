package interficies;

public class Quadrat implements Poligon {
	
	private int longitud;
	
	
	public int getLongitud() {
		return longitud;
	}


	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
		
		
		return longitud*longitud;
	}
	
	public String toString(){
		String info;
		info="El costat �s "+longitud+" i t� una area de: "+area();
		return info;
	}

}
