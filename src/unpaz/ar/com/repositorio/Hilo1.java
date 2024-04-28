package unpaz.ar.com.repositorio;

public class Hilo1 extends Thread  {

	public int [] parte1;
	public int [] parte2;
	public long acumulador=0l;
	
	public Hilo1(int [] parte1 , int [] parte2) {
		
	this.parte1 = parte1;
	this.parte2 = parte2;
			
	}
	public synchronized void run() {
	 
		
		if (this.parte1.length==this.parte2.length) {
			
			for( int i= 0 ; i< this.parte1.length; i++ ){
			
				this.acumulador +=this.parte1[i]*this.parte2[i];
			
			}
		}
		
		this.notify();
	
	}

	public synchronized long get_acumulador(){
		try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.acumulador;
		
	}
}

