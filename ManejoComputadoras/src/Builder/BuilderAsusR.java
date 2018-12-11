package Builder;
import emsamablajecomputadoras.creacional.Computador;
import emsamablajecomputadoras.creacional.Mainboard;
import emsamablajecomputadoras.creacional.SistemaOperativo;

public class BuilderAsusR extends ComputadorBuilder{
		@Override
	public void setRam() {
		c.setRam(32);
		
	}

	@Override
	public void setOs() {
		c.setOs(new SistemaOperativo("Windows 10", 64, "PRO"));
		

		
	}

	@Override
	public void setAlmacenamiento() {
		c.setAlmacenamiento(1000);
		
	}

	@Override
	public void setPlaca() {
		c.setPlaca(new Mainboard("Strix", "x99"));
		
	}

	@Override
	public void setMarca() {
		c.setMarca("Asus");

		
	}

	@Override
	public void setModelo() {
		c.setModelo("ROG");
		
	}

	@Override
	public boolean isCoolerExterno() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setCoolerExterno() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setComputador() {
		c = new Computador();
		
	}

	
}
