public class Canine extends Animal{
	protected String name1;
//	Animal a = new Animal("sdsa","dwdfef");
	public Canine(){}
	public Canine(String name , String livesInPlace ,String name1){
	super(name , livesInPlace);
	this.name1 = name1;
}
	
	//overriding;
	public void eat(){
	super.eat();
	System.out.println("Canine IS Eating!");
}	

	public void makeNoise(){
	super.makeNoise();
	System.out.println("Canine IS making noise");
}
	public void sleep(){
	super.sleep();
	System.out.println("Canine IS Sleeping");
}
	public void move(){
	super.move();
	System.out.println("Canine IS moving");
}

}