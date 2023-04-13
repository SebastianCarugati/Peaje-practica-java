package domain;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Estacion {
	private Integer id;
	private String descripcion;
	private List <Cabina> cabinas;
	
	
	public Estacion(Integer id, String descripcion, List<Cabina> cabinas) {
		this.id = id;
		this.descripcion = descripcion;
		this.cabinas = cabinas;
	}
	
	public Estacion(Integer id, String descripcion) {

		this.id = id;
		this.descripcion = descripcion;
	}

	public Estacion(Integer id, List<Cabina> cabinas) {

		this.id = id;
		this.cabinas = cabinas;
	}
	

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public List<Cabina> getCabinas() {
		return cabinas;
	}


	public void setCabinas(List<Cabina> cabinas) {
		this.cabinas = cabinas;
	}
	
	//mostrar los registros de las cabinas
	
	public void mostrarRegistros() {
		for (Cabina cabina : cabinas) {
			cabina.mostrarRegistros();

		}
		}
	
	
	// Logica de hora actual
	
	
	public static Integer dameHoraActual() {
		Random horaRandom = new Random();
		return horaRandom.nextInt(24);
	}
	
	// Logica de agregar cabinas
	
	public void addCabina(Cabina cabina) {
		this.cabinas.add(cabina);
	}
	
	public void addCabina (Integer id, Mediopago mediopago) {
		Cabina cabina = new Cabina (id, mediopago);
		this.addCabina (cabina);
	}
	
	// Logica de cabinas con efectivo
	
	public void cabinasEfectivo() {
		Mediopago medioPago = null;
		for (Cabina cabina : cabinas) {
			medioPago = cabina.getMediopago();
			if (medioPago instanceof Efectivo) {
				System.out.println("Las cabinas que cuentan con medio de pago en efectivo son : " + cabina.getId());
			}
			
		}
		}
	
	
	//Logica de promedio de demora
	
	
	public Double promedioDemora() {
		Integer count = 0;
		Integer dias = 0;
		Integer totalcabinas = 0;
		
		for (Cabina cabina : cabinas) {
			totalcabinas = cabina.diasDemora();
			dias = dias + totalcabinas++;
			count++;
		}
		
		double prom = (double) (dias / count);
		return prom;
		
	}
	
	 //Logica de cobrar
	
		public Double cobrar(Cabina cabina,Vehiculo vehiculo) {
			double total = 0.0;
			double cobrito = cabina.cobrar(vehiculo);
			Mediopago mediopago = cabina.getMediopago();
			double descuento = mediopago.getDescuento();
			if (descuento != 0) {
				total = cobrito - (cobrito * (descuento/100));
			}else {
				return cobrito;
			}
			return total;

		}

	@Override
	public String toString() {
		return "Estacion [id=" + id + ", descripcion=" + descripcion + ", cabinas=" + cabinas + "]";
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
		Estacion other = (Estacion) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
		
	


	
	
	
	
	

}
