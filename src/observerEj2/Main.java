package observerEj2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		YoutubeChannel channel= new YoutubeChannel();
		
		Suscriber s1= new Suscriber(channel);
		Suscriber s2= new Suscriber(channel);
		Suscriber s3= new Suscriber(channel);

		channel.attach(s1);
		channel.attach(s2);
		channel.attach(s3);
		
		channel.addNewVideo("Video observer patter");
		
		// agrego otro video nuevo 
		channel.addNewVideo("Video factory patter");


	}

}
