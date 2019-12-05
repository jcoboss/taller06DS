package emsamablajecomputadoras.Builder;

import emsamablajecomputadoras.creacional.Computador;
import emsamablajecomputadoras.creacional.Mainboard;
import emsamablajecomputadoras.creacional.SistemaOperativo;

public class AsusZenbookBuilder extends ComputadorBuilder{
	

	@Override
	public void contruirMarcoModelo() {
		
		this.c.setMarca("ASUS");
		this.c.setModelo("Zenbook");
		
	}

	@Override
	public void definirRAM() {
		this.c.setRam(16);
		this.c.setTipoRam("DDR3");
		
	}

	@Override
	public void definirAlmacenamiento() {
		this.c.setAlmacenamiento(500);
		
	}

	@Override
	public void definirSO() {
		this.c.setOs(new SistemaOperativo("Windows 10", 64, "HOME"));
		
	}

	@Override
	public void definirMainBoard() {
		this.c.setPlaca(new Mainboard("PROME", "Z370"));
		
	}

	@Override
	public Computador getComputador() {
		return c;
		
	}
	
	public void DefinirComputadora() {
		
		this.c = new Computador();
		contruirMarcoModelo();
		definirRAM();
		definirAlmacenamiento();
		definirSO();
		definirMainBoard();
	}

}
