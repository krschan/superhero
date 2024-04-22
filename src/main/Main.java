package main;

import model.Hulk;

public class Main {
	public static void main(String[] args) {
		Hulk verde = new Hulk();
		verde.transformar();
		
		System.out.println("¡Hulk ha entrado en furia!");
		System.out.println("Nombre: " + verde.getNombre());
		System.out.println("Edad: " + verde.getEdad());
		
		System.out.println("Poderes del superhéroe Hulk: ");
		verde.showPoderes();
		
		System.out.println("Furia: " + verde.getFuria());
		
		System.out.println("Potencial: " + verde.calcularPotencial());
		
		System.out.println("¡HULK HA VUELTO A LA NORMALIDAD!");
		verde.restaurar();
		
	}
}
