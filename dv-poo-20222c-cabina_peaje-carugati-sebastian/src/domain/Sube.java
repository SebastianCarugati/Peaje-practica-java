package domain;

public class Sube extends Mediopago {

	public Sube(Integer diaDemora) {
		super("Sube", diaDemora);

	}

	@Override
	public Double getDescuento() {
		return 0.90;
	}
	
}
