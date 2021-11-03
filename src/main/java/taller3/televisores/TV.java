package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	private static int numTV;
	
	public TV(Marca marca, boolean estado) {	
		this.marca  = marca;
		this.estado = estado;
		canal   = 1;
		volumen = 1;
		precio  = 500;
		numTV++; 
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca mark) {
		marca = mark;
	}
	public Control getControl() {
		return control;
	}
	public void setControl(Control ctr) {
		control = ctr;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int price) {
		precio = price;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int vol) {
		volumen = vol;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int channel) {
		if (channel >= 1 && channel <= 120 && estado == true) {
			canal = channel;
		}
	}
	public static int getNumTV() {				
		return numTV;
	}
	public static void setNumTV(int number) {
		numTV = number;
	}
	public void turnOn() {				
		estado = true;
	}
	public void turnOff() {
		estado = false;
	}
	public boolean getEstado() {		
		return estado;
	}
	public void canalUp() {					
		if (canal < 120 && estado == true) {		
			canal++;
		}
	}
	public void canalDown() {
		if (canal > 1 && estado == true) {			
			canal--;
		}
	}
	public void volumenUp() {					
		if (volumen < 7 && estado == true) {		
			volumen++;
		}
	}
	public void volumenDown() {
		if (volumen > 0 && estado == true) {		
			volumen--;
		}
	}
}