package com.udea.edu.app;

public class Convertidor {
	
	/*
	 *Se declaran arreglos que contiene las posibles unidades, decimas, centecimas y unidades de mil de un número dado
	 * **/
	String unidades[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
	String decenas[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
	String centenas[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
	String unidadesMil[] = {"","M"};
    
	public String toRomano(String numero) {
		 int aux= 0;
		 int numMil = Integer.parseInt(numero)/1000;
		 aux = Integer.parseInt(numero)%1000;
		 int numCentenas=  aux/100;
		 aux = Integer.parseInt(numero)%100;
		 int numDecenas=aux/10;
		 int numUnidades = aux%10;
		 String resultado= "";
		if(Integer.parseInt(numero)==0){
			 return "No existe"; 
		 }
	
	     resultado = unidadesMil[numMil]+centenas[numCentenas]+decenas[numDecenas]+unidades[numUnidades];
	     
	
		 return resultado;
		
	}
	
}
