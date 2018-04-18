public class Feline extends Animal{
	Animal a = new Animal("sdsa","dwdfef");
	protected String types;

	public Feline(){}
	public Feline(String name , String livesInPlace , String types){
	super(name , livesInPlace);	
	this.types = types;
}

 
	//overriding;
	public void eat(){
	super.eat();
	System.out.println("Feline IS Eating!");
}	

	public void makeNoise(){
	super.makeNoise();
	System.out.println("Feline IS making noise");
}
	public void sleep(){
	super.sleep();
	System.out.println("Feline IS Sleeping");
}
	public void move(){
	super.move();
	System.out.println("Feline IS moving");
}

}