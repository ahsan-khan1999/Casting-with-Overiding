public class Cat extends Feline{

	protected String grad;	
	public 	Cat(){}	
	public 	Cat(String name , String livesInPlace , String types , String grade){
	super(name,livesInPlace,types);
	this.grad = grad;
}
	//overriding;
	public void eat(){
	super.eat();
	System.out.println("Cat IS Eating!");
}	

	public void makeNoise(){
	super.makeNoise();
	System.out.println("Cat IS making noise");
}
	public void sleep(){
	super.sleep();
	System.out.println("Cat IS Sleeping");
}
	public void move(){
	super.move();
	System.out.println("Cat IS moving");
}


}