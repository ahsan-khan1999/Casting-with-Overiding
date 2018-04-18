public class Animal{
	protected String name;
	protected String livesInPlace;
	
	public Animal(){}
	public Animal(String name , String livesInPlace ){
	this.name = name;
	this.livesInPlace = livesInPlace;
}

	public String getName(){
	return name;
}
	public void setName(String name){
	this.name = name;
}
	public String getlivesInPlace(){
	return livesInPlace;
}
	public void setLivesInPlace(String livesInPlace){
	this.livesInPlace = livesInPlace;
}		
	public void eat(){
	System.out.println("Animal IS Eating");
}	

	public void makeNoise(){
	System.out.println("Animal IS making noise");
}
	public void sleep(){
	System.out.println("Animal IS Sleeping");
}
	public void move(){
	System.out.println("Animal IS moving");
}

}