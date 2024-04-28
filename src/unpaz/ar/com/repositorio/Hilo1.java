package unpaz.ar.com.repositorio;

public class Hilo1 extends Thread  {

	public int [] parte1;
	public int [] parte2;
	public int acumulador=0;
	
	public Hilo1(int [] parte1 , int [] parte2) {
		
	this.parte1 = parte1;
	this.parte2 = parte2;
			
	}
	public void run() {
	 
		
		if (this.parte1.length==this.parte2.length) {
			
			for( int i= 0 ; i< this.parte1.length; i++ ){
			
				this.acumulador +=this.parte1[i]*this.parte2[i];
			
			}
		}
	
	
	}

	public int get_acumulador(){
		return this.acumulador;
	}
}

