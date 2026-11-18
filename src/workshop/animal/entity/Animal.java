package workshop.animal.entity;

public abstract class Animal {
	protected int legs;
	
	protected Animal(int legs) {
		this.legs = legs;
	}
	
	//abstract method: body 설정할 수 없다. 오류 발생!
	public abstract void eat();
	
	//concrete method
	public void walk() {
		System.out.println("동물은 "+legs+"발로 걷습니다.");
	}
}
