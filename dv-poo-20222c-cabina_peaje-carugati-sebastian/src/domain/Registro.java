package domain;

public class Registro {

	private Integer horaActual;
	private Vehiculo vehiculo;

	public Registro(Integer horaActual, Vehiculo vehiculo) {

		this.horaActual = horaActual;
		this.vehiculo = vehiculo;
	}

	@Override
	public String toString() {
		return "Registro HoraActual= " + horaActual + ", " + vehiculo + "]";
	}

	public Integer getHoraActual() {
		return horaActual;
	}

	public void setHoraActual(Integer horaActual) {
		this.horaActual = horaActual;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

}
