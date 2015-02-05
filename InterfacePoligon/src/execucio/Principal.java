package execucio;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("EXECUCIÓ DE LES INTERFICIES");
		
		interficies.Quadrat q= new interficies.Quadrat();
		interficies.Circumferencia c = new interficies.Circumferencia();
		interficies.Triangle t= new interficies.Triangle();
		
		q.setLongitud(3);
		System.out.println(q.toString());
		
		c.setRadi(11.3);
		System.out.println(c.toString());
		
		t.setBase(1.2);
		t.setAltura(2.3);
		System.out.println(t.toString());
		
		System.out.println("EXECUCIÓ DE LES CLASSES");
		
		classes.Quadrat qc= new classes.Quadrat();
		classes.Circumferencia cc = new classes.Circumferencia();
		classes.Triangle tc= new classes.Triangle();
		
		qc.setLongitud(3);
		System.out.println(q.toString());
		
		cc.setRadi(11.3);
		System.out.println(c.toString());
		
		tc.setBase(1.2);
		tc.setAltura(2.3);
		System.out.println(t.toString());
		
		System.out.println("canviiiiiiiiiiiiiiii");
		
		
		
		
		
		
		
		
		
		
	}

}
