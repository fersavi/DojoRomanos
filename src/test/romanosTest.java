package test;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

import com.udea.edu.app.Convertidor;

public class romanosTest {

	@Test
	public void convertirCero() {
		String numero = "00";
		Convertidor convertidor = new Convertidor();
		String correcto = "No existe";
		String romano = convertidor.toRomano(numero);
		assertEquals(correcto,romano);
	}
	@Test
	public void convertirUnidades() {
		
		String numero = "9";
		Convertidor convertidor = new Convertidor();
		String correcto = "IX";
		String romano = convertidor.toRomano(numero);
		assertEquals(correcto,romano);
	}
	
	@Test
	public void convertirDecenas() {
		
		String numero = "90";
		Convertidor convertidor = new Convertidor();
		String correcto = "XC";
		String romano = convertidor.toRomano(numero);
		assertEquals(correcto,romano);
	}
	
	@Test
	public void convertirCentenas() {
		
		String numero = "140";
		Convertidor convertidor = new Convertidor();
		String correcto = "CXL";
		String romano = convertidor.toRomano(numero);
		assertEquals(correcto,romano);
	}
	
	@Test
	public void convertirUnidadesMil() {
		
		String numero = "1000";
		Convertidor convertidor = new Convertidor();
		String correcto = "M";
		String romano = convertidor.toRomano(numero);
		assertEquals(correcto,romano);
	}
	
	@Test
	public void convertirDecenasConUidades() {
		
		String numero = "59";
		Convertidor convertidor = new Convertidor();
		String correcto = "LIX";
		String romano = convertidor.toRomano(numero);
		assertEquals(correcto,romano);
	}

	@Test
	public void conDecenasYUnidades () {
			
			String numero = "199";
			Convertidor convertidor = new Convertidor();
			String correcto = "CXCIX";
			String romano = convertidor.toRomano(numero);
			assertEquals(correcto,romano);
		
	}

	}
	
