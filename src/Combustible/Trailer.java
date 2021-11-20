package Combustible;

public class Trailer {
	
	private double km, carga;
	private double calculo;
	private double consumo;
	
	public Trailer(double km,double carga) {
		
		this.km=km;
		this.carga=carga;	
		
	}
	
	public double consumo() {
		
		calculo=km*carga;
		
		if(carga<5) {
			
			consumo=(calculo/218.24);
		}else {
			
			consumo=(calculo/197.18);
		}
		
		return consumo;
	}	
}
