package parchis;

public class Ficha {

	final private ColorFicha color;
	final private int id;
	private EstadoFicha estado;
	private int posicion;
	private boolean errorMov; 
	private boolean seleccionada;
	private int posicionOrigen;
	private EstadoFicha estadoOrigen;
	
	public Ficha (ColorFicha col, int i) {
		color=col;
		id=i;
		errorMov=false;
		seleccionada= false;
	}
	
	public void set_estado (EstadoFicha esta) {
		estado=esta;
	}
	public void set_posicion (int pos) {
		posicion=pos;
	}
	public void consolidar_movimiento () {
		posicionOrigen=posicion;
		estadoOrigen=estado;
	}

	
	public void set_errorMov (boolean b) {
		errorMov=b;
	}
	public void set_seleccionada (boolean s) {
		seleccionada=s;
	}

	public ColorFicha get_color () {
		return color;
	}
	
	public int get_id () {
		return id;
	}
	
	public EstadoFicha get_estado () {
		return estado;
	}
	public EstadoFicha get_estadoOrigen () {
		return estadoOrigen;
	}
	public int get_posicion () {
		return posicion;
	}
	public int get_posicionOrigen () {
		return posicionOrigen;
	}

	public boolean get_errorMov () {
		return errorMov;
	}
	public boolean get_seleccionada () {
		return seleccionada;
	}
	
	
	@Override
	public boolean equals(Object f) {
		Ficha aux= (Ficha)f;
		return this.color.equals(aux.color) && this.id==aux.id;
	}
	
	@Override
	public int hashCode () {
		return this.color.ordinal()*13 + this.id*17;
	}

	
	
	
	
}
