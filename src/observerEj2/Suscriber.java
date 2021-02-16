package observerEj2;

public class Suscriber implements Observer {

	// son los observadores
	
	// tiene al observable 
	
	private YoutubeChannel canalDondeEstaSuscripto;
	
	public Suscriber(YoutubeChannel youtubeChannel) {
		super();
		this.canalDondeEstaSuscripto = youtubeChannel;
	}


	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("new video posted!");
		System.out.println(this.canalDondeEstaSuscripto.getLastVideoPosted());
	}

}
