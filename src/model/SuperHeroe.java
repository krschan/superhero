package model;

public abstract class SuperHeroe {
	
	protected String nombre;
	protected int edad;
	protected String[] poderes = new String[4];
	
	public SuperHeroe(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public double calcularPotencial() {
		double potencial = 0.0;
		
		potencial = edad * 10;
		return potencial;
	};
	
	public void showPoderes() {
		for (int i = 0; i < poderes.length; i++) {
			System.out.println(poderes[i]);
		}
		
	};
	
	public void setPoder(String poder, int position) {
		if (position >= 0 && position < poderes.length) {
			poderes[position] = poder;
		}
	};

}
