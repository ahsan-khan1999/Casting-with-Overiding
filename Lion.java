public class Lion extends Feline{
	protected String grade;	

	public Lion(){}	

	public Lion(String name , String livesInPlace , String types , String grade){
	super(name,livesInPlace,types);
	this.grade = grade;
}
	//overriding;
	public void eat(){
	super.eat();
	System.out.println("Lion IS Eating!");
}	

	public void makeNoise(){
	super.makeNoise();
	System.out.println("Lion IS making noise");
}
	public void sleep(){
	super.sleep();
	System.out.println("Lion IS Sleeping");
}
	public void move(){
	super.move();
	System.out.println("Lion IS moving");
}


}