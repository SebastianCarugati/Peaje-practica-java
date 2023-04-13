package domain;

import java.util.Objects;

public class Vehiculo {
	
	private String patente;
	private TipoVehiculo categoria;
	
	
	public Vehiculo(String patente, TipoVehiculo categoria) {
		this.patente = patente;
		this.categoria = categoria;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public TipoVehiculo getCategoria() {
		return categoria;
	}
	public void setCategoria(TipoVehiculo categoria) {
		this.categoria = categoria;
	}
	
	
	@Override
	public String toString() {
		return "Vehiculo [patente=" + patente + ", categoria=" + categoria + "]";
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(categoria, patente);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(categoria, other.categoria) && Objects.equals(patente, other.patente);
	}
	
	
	
	


	

}
