package emsamablajecomputadoras.Builder;

import emsamablajecomputadoras.creacional.Computador;
import emsamablajecomputadoras.creacional.Mainboard;
import emsamablajecomputadoras.creacional.SistemaOperativo;

public class AsusRogueBuilder extends ComputadorBuilder{
	

	@Override
	public void contruirMarcoModelo() {
		
		this.c.setMarca("ASUS");
		this.c.setModelo("ROGUE");
		
	}

	@Override
	public void definirRAM() {
		this.c.setRam(32);
		this.c.setTipoRam("DDR4");
		
	}

	@Override
	public void definirAlmacenamiento() {
		this.c.setAlmacenamiento(1000);
		
	}

	@Override
	public void definirSO() {
		this.c.setOs(new SistemaOperativo("Windows 10", 64, "PRO"));
		
	}

	@Override
	public void definirMainBoard() {
		this.c.setPlaca(new Mainboard("STRIX", "x99"));
		this.c.setCoolerExterno(true);
		
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
