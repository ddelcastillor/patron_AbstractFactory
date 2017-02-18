package com.libro.patrones.AbstractFactory;

public class FabricaVehiculoElectricidad implements FabricaVehiculo{

	@Override
	public Automovil crearAutomovil(String modelo, String color, int potencia, double espacio) {

		return new AutomovilElectricidad(color, color, potencia, espacio);
	}

	@Override
	public Scooter crearScooter(String modelo, String color, int potencia) {

		return new ScooterElectricidad(color, color, potencia);
	}

}
