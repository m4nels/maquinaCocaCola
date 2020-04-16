package maquinaCocaCola;

import java.util.Scanner;

import javax.swing.Spring;

public class Maquina {
	
	private int seleccionProducto;
	private double saldo;
	
	//--------------------- GETTERS & SETTERS ---------------------	
	public int getSeleccionProducto() {
		return seleccionProducto;
	}
	public void setSeleccionProducto(int seleccionProducto) {
		this.seleccionProducto = seleccionProducto;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	//--------------------- GETTERS & SETTERS ---------------------	END ---------------------
	

	public void setInsertarSaldo() {
		System.out.println("Insertar saldo:");
		Scanner scanner = new Scanner (System.in);
		saldo = scanner.nextDouble();
	}
	public void setDevolverSaldo() {
		this.saldo = 0;
	}
	
	//exprender producto -------------------------------
	public void exprederProducto(Spring nombre, double precio, int stock, int unidadesVendidas) {
		if(this.saldo > precio && stock > 0) {
			stock = stock-1;
			unidadesVendidas = unidadesVendidas+1;
			this.saldo -= precio;
			System.out.println("Ha elegido usted: "+nombre);
			System.out.println("Retire su producto. Gracias por su compra.");
		}
		else if(this.saldo > precio && stock < 0) {
			//producto agotado -------------------------------
			System.out.println("Producto agotado. Retire su dinero.");
			System.out.println();
			setDevolverSaldo();
		}
		else {
			//pedir saldo -------------------------------
			setInsertarSaldo();
		}
	}
	public void setReponer() {
		System.out.println("Seleccione la bebida a reponer:");
		Scanner scanner = new Scanner (System.in);
		this.seleccionProducto = scanner.nextInt();
	}
	
}
