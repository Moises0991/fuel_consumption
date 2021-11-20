package Combustible;

public class Camion extends Vehiculos {
	
	private double km;
	private double carga;
	private String tipo;
	private double consumo;
	
	public Camion(double km,double carga,String tipo) {
		
		this.km=km;
		this.carga=carga;
		this.tipo=tipo;
	}
	
	public double consumo() {
		
		if(tipo.equalsIgnoreCase("agua")) {
			
			consumo=km+(carga/128.15)*1;
			
		}else if(tipo.equalsIgnoreCase("liquidos poco densos")) {
			
			
			consumo=km+(carga/128.15)*117;
			
		}else if(tipo.equalsIgnoreCase("liquidos muy densos")) {
			
			consumo=(km+(carga/128.15)*1.26)/18;
			
		}
		
		return consumo;
	}
	
	public String tipoCarga() {
	
		return "(Transporto "+tipo+")";
		
	}

}
