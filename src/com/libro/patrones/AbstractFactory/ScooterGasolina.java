package com.libro.patrones.AbstractFactory;

public class ScooterGasolina extends Scooter {

	public ScooterGasolina(String modelo, String color, int potencia) {
		super(modelo, color, potencia);
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println(
				"Scooter Gasolina de modelo: " + modelo + 
				" de color: "+ color +
				" de potencia "+ potencia 
		);
		
	}

}
