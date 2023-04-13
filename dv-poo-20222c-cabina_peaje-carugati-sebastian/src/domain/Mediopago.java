package domain;

import java.util.Objects;

public abstract class Mediopago {
	
	private String descripcion;
	private Integer diaDeMora;

	public Mediopago(String descripcion, Integer diaDeMora) {

		this.descripcion = descripcion;
		this.diaDeMora = diaDeMora;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getDiaDeMora() {
		return diaDeMora;
	}

	public void setDiaDeMora(Integer diaDemora) {
		this.diaDeMora = diaDemora;
	}

	public abstract Double getDescuento();
	

	@Override
	public String toString() {
		return "MedioPago: " + descripcion + ", Dia de demora: " + diaDeMora + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(descripcion, diaDeMora);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mediopago other = (Mediopago) obj;
		return Objects.equals(descripcion, other.descripcion) && Objects.equals(diaDeMora, other.diaDeMora);
	}
	
	
	
	
	



}
