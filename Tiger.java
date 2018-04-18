public class Tiger extends Feline{

	protected String tig;	
	public Tiger(){}	
	public Tiger(String name , String livesInPlace , String types , String tig){
	super(name , livesInPlace , types);
	this.tig = tig;
}
	//overriding;
	public void eat(){
	super.eat();
	System.out.println("Tiger IS Eating!");
}	

	public void makeNoise(){
	super.makeNoise();
	System.out.println("Tiger IS making noise");
}
	public void sleep(){
	super.sleep();
	System.out.println("Tiger IS Sleeping");
}
	public void move(){
	super.move();
	System.out.println("Tiger IS moving");
}

}