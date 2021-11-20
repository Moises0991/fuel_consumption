package Combustible;

public class Coche extends Vehiculos{
	
	private double km;
	private double consumo;

	public Coche(double km) {
		
		this.km=km;
		
	}
	
	public double consumo() {
		
		consumo=(km/30);
		
		return consumo;
	}
	
}
