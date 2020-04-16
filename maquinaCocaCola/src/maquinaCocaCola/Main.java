package maquinaCocaCola;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Maquina exprendedora = new Maquina();
		Producto refresco01 = new Producto();
		Producto refresco02 = new Producto();
		Producto refresco03 = new Producto();
		Producto refresco04 = new Producto();
		Producto refresco05 = new Producto();
		Producto refresco06 = new Producto();

		
		refresco01.setProducto("Coca-Cola", 2, 1.50);
		refresco02.setProducto("Coca-Cola Zero", 10, 1.55);
		refresco03.setProducto("Fanta Naranja", 10, 1.50);
		refresco04.setProducto("Fanta Limón", 10, 1.50);
		refresco05.setProducto("Acuarius", 10, 1.60);
		refresco06.setProducto("Sprite", 10, 1.60);
		 
		int opcion = 0;
		//double recaudacion;
		
		Scanner scanner = new Scanner (System.in);
		
		while ( opcion != 7) {
			
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Saldo actual: "+exprendedora.getSaldo()+" €");
		System.out.println("Seleccione 8 para añadir saldo.");
		System.out.println("Seleccione 9 para devolver saldo.");
		System.out.println("Seleccione 0 para administrar maquina.");
		System.out.println("Seleccione 7 para apagar la maquina.");
		System.out.println();
		System.out.println("1. "+refresco01.getNombre()+" - "+refresco01.getPrecio()+" €");
		System.out.println("2. "+refresco02.getNombre()+" - "+refresco02.getPrecio()+" €");
		System.out.println("3. "+refresco03.getNombre()+" - "+refresco03.getPrecio()+" €");
		System.out.println("4. "+refresco04.getNombre()+" - "+refresco04.getPrecio()+" €");
		System.out.println("5. "+refresco05.getNombre()+" - "+refresco05.getPrecio()+" €");
		System.out.println("6. "+refresco06.getNombre()+" - "+refresco06.getPrecio()+" €");
		System.out.println("Seleccione bebida:");
		opcion = scanner.nextInt();
		
			switch(opcion) {
				//--------------------- ADMINISTRADOR ---------------------
				case 0:
					
					while ( opcion != 4) {
						System.out.println("Administrador");
						System.out.println("1. Consultar stock");
						System.out.println("2. Modificar stock");
						System.out.println("3. Consultar recaudación");
						System.out.println("4. salir");
						opcion = scanner.nextInt();
						
						switch(opcion) {
						//--------------------- ADMINISTRADOR - consultar stock ---------------------
						case 1:
							System.out.println("El estock actual és de:");
							refresco01.consultaStock();
							refresco02.consultaStock();
							refresco03.consultaStock();
							refresco04.consultaStock();
							refresco05.consultaStock();
							refresco06.consultaStock();
							System.out.println();
							break;
							//--------------------- ADMINISTRADOR - modificar stock ---------------------
							case 2:
							exprendedora.setReponer();
							
							switch(exprendedora.getSeleccionProducto()) {
							case 1:
								refresco01.setReponerProducto();
								break;
							case 2:
								refresco02.setReponerProducto();
								break;
							case 3:
								refresco03.setReponerProducto();
								break;
							case 4:
								refresco04.setReponerProducto();
								break;
							case 5:
								refresco05.setReponerProducto();
								break;
							case 6:
								refresco06.setReponerProducto();
								break;
							}
							break;
							//--------------------- ADMINISTRADOR - consultar recaudación ---------------------
							case 3:
							refresco01.recaudacionProducto();
							refresco02.recaudacionProducto();
							refresco03.recaudacionProducto();
							refresco04.recaudacionProducto();
							refresco05.recaudacionProducto();
							refresco06.recaudacionProducto();
							System.out.println();
							double recaudacion = refresco01.getRecaudacion()+refresco02.getRecaudacion()+refresco03.getRecaudacion()+refresco04.getRecaudacion()+refresco05.getRecaudacion()+refresco06.getRecaudacion();
							System.out.println("La recaudacion total és de: "+recaudacion+" €.");
							System.out.println();
							break;
						default:
							System.out.println("Seleccione una opción correcta");
							break;
						}
					}
					
					break;
				//--------------------- EXPRENEDOR PRODUCTOS ---------------------
				case 1:
					//exprendedora.exprederProducto(refresco01.getNombre(), refresco01.getPrecio(), refresco01.getStock(), refresco01.getUnidadesVendidas());
					break;
				case 2:
					//exprendedora.exprederProducto(refresco01.getNombre(), refresco01.getPrecio(), refresco01.getStock(), refresco01.getUnidadesVendidas());
					break;
				case 3:
					//exprendedora.exprederProducto(refresco01.getNombre(), refresco01.getPrecio(), refresco01.getStock(), refresco01.getUnidadesVendidas());
					break;
				case 4:
					//exprendedora.exprederProducto(refresco01.getNombre(), refresco01.getPrecio(), refresco01.getStock(), refresco01.getUnidadesVendidas());
					break;
				case 5:
					//exprendedora.exprederProducto(refresco01.getNombre(), refresco01.getPrecio(), refresco01.getStock(), refresco01.getUnidadesVendidas());
					break;
				case 6:
					//exprendedora.exprederProducto(refresco01.getNombre(), refresco01.getPrecio(), refresco01.getStock(), refresco01.getUnidadesVendidas());
					break;
				//--------------------- INSERTAR SALDO ---------------------
				case 8:
					exprendedora.setInsertarSaldo();
					break;
				//--------------------- APAGAR MAQUINA ---------------------
					case 7:
					System.out.println("Maquina apagada.");
						break;
				//--------------------- DEVOLVER SALDO ---------------------		
				case 9:
					exprendedora.setDevolverSaldo();
					break;
				//--------------------- ERROR OPCIÓN ---------------------	
				default:
					System.out.println("Seleccione una opción correcta");
					break;
			}
		}
	

	}

}
