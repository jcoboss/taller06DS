package emsamablajecomputadoras.Builder;

import emsamablajecomputadoras.creacional.Computador;

public class ComputadoraDirector {
	
	private ComputadorBuilder builder;
	
	
	
	public void contruirComputadora() {
		builder.DefinirComputadora();
	}
	
	
	public Computador getComputador() {
		return builder.getComputador();
		
	}
	
	public ComputadoraDirector(ComputadorBuilder cB) {
		
		builder = cB;
		
	}
}
