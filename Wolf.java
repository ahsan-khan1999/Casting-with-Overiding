public class Wolf extends Canine{
	//Canine c = new Canine("aaassd","hhd","102fd");
	protected String cast;

	public Wolf(){} 
	public Wolf(String name , String livesInPlace ,String name1 , String cast){
	super(name ,livesInPlace,name1);
	this.cast = cast;
	}
			
	public void eat(){
	super.eat();
	System.out.println("Wolf IS Eating!");
}	

	public void makeNoise(){
	super.makeNoise();
	System.out.println("Wolf IS making noise");
}
	public void sleep(){
	super.sleep();
	System.out.println("Wolf IS Sleeping");
}
	public void move(){
	super.move();
	System.out.println("Wolfss IS moving");
}



}