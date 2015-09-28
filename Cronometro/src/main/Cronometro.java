package main;

public class Cronometro {
	
	private int segundos, minutos;
	
	public Cronometro(){
		segundos = 0;
		minutos = 0;
	}
	
	public void reiniciar(){
		segundos = 0;
		minutos = 0;
	}
	
	public void incrementarTiempo(){
		
		segundos++;		
		if(segundos == 60){
			minutos++;
			segundos = 0;
		}		
	}
	
	public int mostrarMinutos(){
		return minutos;
	}
	
	public int mostrarSegundos(){
		return segundos;
	}

}
