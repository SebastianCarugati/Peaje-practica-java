package domain;

public enum TipoVehiculo {
	
	
	AUTO(120.0), MOTO(80.0), CAMION(300.0);
	
	private Double precio;


	private TipoVehiculo(Double precio) {
		this.precio = precio;
	}

	public Double getPrecio() {
		return precio;
	}
	

}
