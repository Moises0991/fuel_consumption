package Combustible;

import javax.swing.*;

public class Ejecucion extends Mensajes {

	public static void main(String[] args) {
		
		int opcion=0;
		int opcion2=0;
		
		String eleccion=" ";
		Coche[] coches= new Coche[50];
		Trailer[] trailers= new Trailer[50];
		Camion[] camiones= new Camion[50];
		double km_coche=0,km_trailer=0,km_camion=0,carga=0,carga2=0;
		int i=0,x=0,y=0,contador,contador2,contador3;
		double total=0 ,total2=0,total3=0;
		double consumo_total;
		boolean enviado=true;
		
		do {
			
			Mensajes mensaje1= new Mensajes();
			opcion=mensaje1.menu();
			
			switch(opcion) {
			
			case 1:
				
				do {
				
				if(enviado) {
					
					JOptionPane.showMessageDialog(null, "Por seguridad no se podran eliminar registros.\nSin embargo se podran agregar nuevos registros\nposteriormente; los cuales se iran adjuntando","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
					enviado=false;
				}
					
				opcion2=mensaje1.vehiculos1();
				
				switch(opcion2) {
				
				case 1:
					
					do {
						
						km_coche=Integer.parseInt(JOptionPane.showInputDialog("Coche "+(i+1),"km recorridos"));
									
						coches[i]=new Coche(km_coche);
						
						total+=coches[i].consumo();
						
						eleccion=JOptionPane.showInputDialog("Deseas registrar otro Coche?","SI");
						i++;
									
					}while(eleccion.equalsIgnoreCase("SI"));
					
					break;
				case 2:
					
					String[] tipo_carga= {"Agua","Liquidos poco densos","Liquidos muy densos"};
					
					do {
						
						km_camion=Integer.parseInt(JOptionPane.showInputDialog("Camion "+(x+1),"km recorridos"));
						carga2=Integer.parseInt(JOptionPane.showInputDialog("Camion "+(x+1),"carga en toneladas"));
						String eleccion_camion=(String) JOptionPane.showInputDialog(null, "Elige la carga", "Tipo de carga", JOptionPane.INFORMATION_MESSAGE, null, tipo_carga, tipo_carga[0]);
									
						camiones[y]=new Camion(km_camion,carga2,eleccion_camion);
						
						total2+=camiones[y].consumo();
						
						eleccion=JOptionPane.showInputDialog("Deseas registrar otro Camion?","SI");
						y++;
									
					}while(eleccion.equalsIgnoreCase("SI"));				
										
					break;
				case 3:	
					
					do {
						
						km_trailer=Integer.parseInt(JOptionPane.showInputDialog("Trailer "+(x+1),"km recorridos"));
						carga=Integer.parseInt(JOptionPane.showInputDialog("Trailer "+(x+1),"carga en toneladas"));
									
						trailers[x]=new Trailer(km_trailer,carga);
						total3+=trailers[x].consumo();
						
						eleccion=JOptionPane.showInputDialog("Deseas registrar otro Trailer?","SI");
						x++;
									
					}while(eleccion.equalsIgnoreCase("SI"));
					
					break;
					
				}
					
				}while(opcion2!=4);
				
				break;
			case 2:
				
				do {
					
					opcion2=mensaje1.vehiculos2();
					
					switch(opcion2) {
					
					case 1:
						
						
					if(i>0) {
						
						System.out.println("Lista de consumo coches.\n");
						
						for(contador=0;contador<i;contador++) {
														
							System.out.println("Coche "+(contador+1)+": "+coches[contador].consumo());
							
						}
						
						System.out.println("\nconsumo total: "+total+" litros.");
						
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
						
					}else {
						
						JOptionPane.showMessageDialog(null, "No se encuentran coches registrados");
					}
					
						break;
					case 2:
						
						if(y>0) {
							
							System.out.println("Lista de consumo Camiones.\n");
							
							for(contador3=0;contador3<y;contador3++) {
															
								System.out.println("Camion "+(contador3+1)+": "+camiones[contador3].consumo()+"          "+camiones[contador3].tipoCarga());
																
							}
							
							System.out.println("\nconsumo total: "+total2+" litros.");
							
							System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
							
						}else {
							
							JOptionPane.showMessageDialog(null, "No se encuentran camiones registrados");
						}
							
						break;
					case 3:	
												
						if(x>0) {
							
							System.out.println("Lista de consumo Trailers.\n");
							
							for(contador2=0;contador2<x;contador2++) {
															
								System.out.println("Trailer "+(contador2+1)+": "+trailers[contador2].consumo()+"\n");
								camiones[contador2].tipoCarga();
															
							}
							
							System.out.println("\nconsumo total: "+total3+" litros.");
							
							System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
							
						}else {
							
							JOptionPane.showMessageDialog(null, "No se encuentran trailers registrados");
						}
						
						break;
						
					}
						
					}while(opcion2!=4);
				
				break;
			case 3:
				
				consumo_total=total+total2+total3;
				
				if(consumo_total>0) {
					
					
					JOptionPane.showMessageDialog(null, "El consumo total de la flotilla es de "+consumo_total);
					
				}else {
					
					JOptionPane.showMessageDialog(null, "Aun no se han registrado consumos");
				}
				
				break;
				
			}
			
		}while(opcion!=4);
	}
}
