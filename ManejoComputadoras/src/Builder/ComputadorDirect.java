package Builder;

import emsamablajecomputadoras.creacional.Computador;

public class ComputadorDirect {
	private ComputadorBuilder b;
	
	public ComputadorDirect(ComputadorBuilder b) {
		this.b=b;
	}

	
	
	public void Ensamblar() {
		b.setComputador();
		b.setMarca();
		b.setModelo();
		b.setRam();
		b.setAlmacenamiento();
		b.setPlaca();
		b.setOs();
		b.setComputador();
		b.setCoolerExterno();
		b.isCoolerExterno();
		
	}
	
	public Computador getComputador() {
		return b.getComputador();
	}

}
