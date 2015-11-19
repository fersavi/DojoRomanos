package com.udea.edu.app;



import java.util.Scanner;

public class MainConvertidorRomano {

	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in); 
		System.out.println("Ingrese el número que dese convertir a romano");
		String numero = in.next();
		Convertidor convertidor = new Convertidor();
		String romano = convertidor.toRomano(numero);
		System.out.println("El número "+ numero +" en romano es: "+romano);
		System.out.println("desea convetir otro numero? y/n");
		String respuesta = in.next();
		
		while (!respuesta.equals("")){
			
			if (respuesta.toLowerCase().equals("y")) {
				System.out.println("Ingrese el número que dese convertir a romano");
				numero = in.next();
				romano = convertidor.toRomano(numero);
				System.out.println("El número "+ numero +" en romano es: "+romano);
				System.out.println("desea convetir otro numero? y/n");
				respuesta = in.next();
			} 
			if (respuesta.toLowerCase().equals("n")){
				System.out.println("Saliendo...");
				return;
			} else System.out.println("debe ingresar  y/n");
				   respuesta = in.next();
		}
		
	}
}	


