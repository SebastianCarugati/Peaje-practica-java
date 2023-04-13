package test;

import java.util.ArrayList;
import java.util.List;

import domain.Aubasa;
import domain.Cabina;
import domain.Efectivo;
import domain.Estacion;
import domain.Registro;
import domain.Sube;
import domain.Telepase;
import domain.TipoVehiculo;
import domain.Vehiculo;

public class AubasaTest {

	public static void main(String[] args) {
		
		Efectivo efectivo = new Efectivo (3);
		Telepase telepase = new Telepase (7);
		Sube sube = new Sube (2);
		Vehiculo volkswagen = new Vehiculo("AC873GCA", TipoVehiculo.AUTO);
		Vehiculo chevrolet = new Vehiculo("AD599VHG", TipoVehiculo.AUTO);
		Vehiculo scania = new Vehiculo("AA221HGA", TipoVehiculo.CAMION);
		Vehiculo volvo = new Vehiculo("AB531DEE", TipoVehiculo.CAMION);
		Vehiculo ducati = new Vehiculo("ABD412AA", TipoVehiculo.MOTO);
		Vehiculo yamaha = new Vehiculo("ADA599VH", TipoVehiculo.MOTO);
		
		Registro registro = new Registro(Estacion.dameHoraActual(), volkswagen);
		Registro registro1 = new Registro(Estacion.dameHoraActual(), chevrolet);
		Registro registro2 = new Registro(Estacion.dameHoraActual(), scania);
		Registro registro3 = new Registro(Estacion.dameHoraActual(), volvo);
		Registro registro4 = new Registro(Estacion.dameHoraActual(), ducati);
		Registro registro5 = new Registro(Estacion.dameHoraActual(), yamaha);
		
		List<Registro> listaRegistros = new ArrayList<Registro>();
		listaRegistros.add(registro);
		listaRegistros.add(registro1);
		listaRegistros.add(registro2);
		listaRegistros.add(registro3);
		listaRegistros.add(registro4);
		listaRegistros.add(registro5);
		
		Cabina carril1 = new Cabina(1, efectivo);
		Cabina carril2 = new Cabina(2, sube);
		Cabina carril3 = new Cabina(3, efectivo);
		Cabina carril4 = new Cabina(4, telepase);
		Cabina carril5 = new Cabina(5, telepase);
		Cabina carril6 = new Cabina(6, telepase);
		
		carril1.addRegistro(registro);
		carril2.addRegistro(registro1);
		carril3.addRegistro(registro2);
		carril4.addRegistro(registro3);
		carril5.addRegistro(registro4);
		carril6.addRegistro(registro5);
		
		
		
		List<Cabina> CabinasAccesoOeste = new ArrayList<Cabina>();
		List<Cabina> CabinasPanamericana = new ArrayList<Cabina>();
		List<Cabina> CabinasRiccheri = new ArrayList<Cabina>();
		
		
	    CabinasAccesoOeste.add(carril1);
	    CabinasAccesoOeste.add(carril2);
	    
	    CabinasPanamericana.add(carril3);
	    CabinasPanamericana.add(carril4);
	    
	    CabinasRiccheri.add(carril5);
	    CabinasRiccheri.add(carril6);
	    
	    
	    
	    
		Estacion aubasa = new Estacion(1, CabinasAccesoOeste);
		Estacion aubasa1 = new Estacion(2, CabinasPanamericana);
		Estacion aubasa2 = new Estacion(3, CabinasRiccheri);
	    
	    
	    List<Estacion> listaEstaciones = new ArrayList<Estacion>();
	    listaEstaciones.add(aubasa);
	    listaEstaciones.add(aubasa1);
	    listaEstaciones.add(aubasa2);
	    
	    
	    
	    Aubasa ausa = new Aubasa (listaEstaciones);
	    
	    System.out.println("Dias de demora por Telepase: ");
	    ausa.promedioDemora();
	    System.out.println(" ");
	    System.out.println("Cabinas solo para efectivo");
	    ausa.mostrarCabinasEfectivo();
	    System.out.println(" ");
	    ausa.mostrarRegistros();
	    System.out.println(" ");
	    System.out.println("Cobro de vehiculo por cabina");
	    ausa.cobrar(aubasa2, carril6, yamaha);
	    ausa.cobrar(aubasa1, carril5, scania);
	    ausa.cobrar(aubasa, carril3, chevrolet);
	    ausa.cobrar(aubasa, carril1, volkswagen);
	    ausa.cobrar(aubasa2, carril4, ducati);
	    ausa.cobrar(aubasa2, carril2, volvo);
	    
	    
	    
	  
	    
	    
	  	
		
		
		
		
		

	}

}
