package domain;

public class Efectivo extends Mediopago {
	
	public Efectivo( Integer diaDeMora) {
		super("Efectivo", 0);
		
	}

	@Override
	public Double getDescuento() {
		
		return 0.0;
	}
	



	}

