package emsamablajecomputadoras.Builder;

import emsamablajecomputadoras.creacional.Computador;

public abstract class ComputadorBuilder {
	
	
	protected Computador c;
	
	public abstract void contruirMarcoModelo();
	
	public abstract void definirRAM();
	
	public abstract void definirAlmacenamiento();
	
	public abstract void definirSO();
	
	public abstract void definirMainBoard();
	
	public abstract void DefinirComputadora();
	
	public abstract Computador getComputador();

}
