package domain;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cabina {
	private Integer id;
	private Mediopago mediopago;
	private List<Registro> registros;
	
	
	
	public Cabina(Integer id, Mediopago mediopago) {
		this.id = id;
		this.mediopago = mediopago;
		this.registros =new ArrayList<>();
	}


	public Cabina(Integer id, Mediopago mediopago, List<Registro> registros) {
		this.id = id;
		this.mediopago = mediopago;
		this.registros = registros;
	}
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public Mediopago getMediopago() {
		return mediopago;
	}
	public void setMediopago(Mediopago mediopago) {
		this.mediopago = mediopago;
	}
	
	public List<Registro> getRegistros() {
		return registros;
	}

	public void setRegistros(List<Registro> registros) {
		this.registros = registros;
	}


	public void addRegistro(Vehiculo vehiculo) {
		Registro registro = new Registro(Estacion.dameHoraActual(), vehiculo);
		addRegistro(registro);
	}
	
	public void addRegistro(Registro registro) {
		this.registros.add(registro);
	}
	
	public Integer diasDemora() {
		Integer diaDemora = mediopago.getDiaDeMora();
		return diaDemora;
	}
	
	public Double cobrar(Vehiculo vehiculo) {
		Double precioHorario = 0.0;
		Double precioVehiculo = vehiculo.getCategoria().getPrecio();
		Integer horaActual = 0;
		if (horaActual >= 6 && horaActual <= 10 || horaActual >= 17 && horaActual <= 20) {

			precioHorario = ((precioVehiculo * 0.08) + precioVehiculo);
		} else {
			precioHorario = precioVehiculo;
		}

		return precioHorario;

	}


	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cabina other = (Cabina) obj;
		return Objects.equals(id, other.id);
	}
	
	public void mostrarRegistros() {
		for (Registro registro : registros) {
			System.out.println("Ingreso: " + registro);
		}
	}

	
	
	
	
	
	

}


