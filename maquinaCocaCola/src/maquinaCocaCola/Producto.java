package maquinaCocaCola;

import java.util.Scanner;

public class Producto {
	
	private String nombre;
	private int stock;
	private int unidadesVendidas;	
	private double precio;
	private double recaudacion;
		
	//--------------------- GETTERS & SETTERS ---------------------
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getUnidadesVendidas() {
		return unidadesVendidas;
	}
	public void setUnidadesVendidas(int unidadesVendidas) {
		this.unidadesVendidas = unidadesVendidas;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getRecaudacion() {
		return recaudacion;
	}
	public void setRecaudacion(double recaudacion) {
		this.recaudacion = recaudacion;
	}
	//--------------------- GETTERS & SETTERS ---------------------	END ---------------------
	
	public void setProducto (String nombreProducto, int stockProducto, double precioProducto) {
		this.nombre = nombreProducto;
		this.stock = stockProducto;
		this.precio = precioProducto;
	}
	
	public void consultaStock () {
		System.out.println(this.nombre+" tiene un stock de "+this.stock+" unidades.");
	}
	
	public void recaudacionProducto() {
		System.out.println(this.nombre+" se han vendido "+this.unidadesVendidas+" unidades y se ha recaudado " +(this.unidadesVendidas*this.precio)+" €.");
	}
	
	public void recaudacionDouble() {
		this.recaudacion = (this.unidadesVendidas*this.precio);
	}
	
	public void setReponerProducto() {
		System.out.println("Indique cantidad a reponer:");
		Scanner scanner = new Scanner (System.in);
		this.stock = scanner.nextInt();
	}
}
