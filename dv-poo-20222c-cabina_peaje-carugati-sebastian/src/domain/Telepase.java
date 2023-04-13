package domain;

public class Telepase extends Mediopago {

	public Telepase(Integer diaDeMora) {
		super("Telepase", diaDeMora);

	}

	@Override
	public Double getDescuento() {
		if (super.getDiaDeMora() <= 5) {
			return 0.85;
		} else {
			return 0.88;
		}
	}

}