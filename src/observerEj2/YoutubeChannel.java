package observerEj2;

import java.util.ArrayList;

public class YoutubeChannel implements Observable {
  
	
	private ArrayList<Observer> channelSuscriber= new ArrayList<Observer>();
	private String lastVideoPosted = "";
	
	
	@Override
	public void attach(Observer o) {
		// TODO Auto-generated method stub
		this.channelSuscriber.add(o);
	}

	@Override
	public void detach(Observer o) {
		// TODO Auto-generated method stub
		 int posicion= this.channelSuscriber.indexOf(o);
		 this.channelSuscriber.remove(posicion);
	}

	@Override
	public void notificar() {
		// TODO Auto-generated method stub
		
		for (Observer suscriptor : channelSuscriber) {
			suscriptor.update();
		}
		
	}
	
	// queremos notificar de este cambio a nuestros suscriptores
	public void addNewVideo(String titulo) {
		this.lastVideoPosted=titulo;
		this.notificar();
		System.out.println("New youtube video added to channel");
	}

	public String getLastVideoPosted() {
		return lastVideoPosted;
	}

	
	
}
