package com.libro.patrones.AbstractFactory;

public class FabricaVehiculoGasolina implements FabricaVehiculo {

	@Override
	public Automovil crearAutomovil(String modelo, String color, int potencia, double espacio) {

		return new AutomovilGasolina(color, color, potencia, espacio);
	}

	@Override
	public Scooter crearScooter(String modelo, String color, int potencia) {

		return new ScooterGasolina(color, color, potencia);
	}

}
