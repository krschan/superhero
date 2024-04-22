package model;

import main.Mutable;

public class Hulk extends SuperHeroe implements Mutable{
	
	private boolean furia;
	
	public Hulk() {
		super("Hulk", 25);
		this.furia = false;
		this.poderes = new String[]{"fuerte", "alto", "resistente", "irascible"};
	}
	
	@Override
	public double calcularPotencial() {
		double potencial = super.calcularPotencial();
		
		if (furia) {
			return potencial * 2;
		}
		
		return potencial;
	}
	
	public void transformar() {
		furia = true; 
	}
	
	public void restaurar() {
		furia = false;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public boolean getFuria() {
		return furia;
	}

}
