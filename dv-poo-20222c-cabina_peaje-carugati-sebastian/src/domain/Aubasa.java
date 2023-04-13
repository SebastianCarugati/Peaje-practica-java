package domain;

import java.util.List;

public class Aubasa {
	private List <Estacion> estaciones;
	

	public Aubasa(List<Estacion> estaciones) {
		this.estaciones = estaciones;
	}

	public List <Estacion> getEstaciones() {
		return estaciones;
	}

	public void setEstaciones(List <Estacion> estaciones) {
		this.estaciones = estaciones;
	}
	
	public void addEstacion(Estacion estacion) {
		this.estaciones.add(estacion);
	}

	public void addEstacion(Integer id, String nombre) {
		Estacion estacion = new Estacion(id, nombre);
		this.addEstacion(estacion);
	}
	
	
	public void cobrar(Estacion estacion, Cabina cabina, Vehiculo vehiculo) {
		Double importe = estacion.cobrar(cabina, vehiculo);
		System.out.println("En la cabina numero : " + cabina.getId() + ", el vehiculo " + vehiculo.getCategoria()
				+ ", usando como " + cabina.getMediopago() + ", abona un importe de $" + importe);
	}
	
	public void promedioDemora() {
		Integer count = 0;
		Double suma =  0.0;
		Double prom = 0.0;
		
		for (Estacion estacion : estaciones) {
			prom = estacion.promedioDemora();
			System.out.println("El promedio de demora es: " + prom + ", en la estacion : " + estacion.getId());
			suma = suma + prom++;
			count++;
		}
		Double promEst= suma / prom;
		System.out.println("El promedio de demora de las estaciones en general es de: " + promEst);
		
	}
	
	public void mostrarCabinasEfectivo() {
		for (Estacion estacion : estaciones) {
			estacion.cabinasEfectivo();

		}
	}

	public void mostrarRegistros() {
		System.out.println("Lista de Registros: ");
		for (Estacion estacion : estaciones) {
			estacion.mostrarRegistros();

		}
	}
	
	

	@Override
	public String toString() {
		return "Aubasa [estaciones=" + estaciones + "]";
	}
	
	
	
	
	
	
}


