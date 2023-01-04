package dog;

import java.util.HashSet;
import java.util.Set;
import animal.Animal;


public class Dog extends Animal {
	//1~45숫자 6개를 뽑아주는 개
	
	public Set<Integer> lotto(){
		Set<Integer> lotto = new HashSet<Integer>(); //중복번호 제거
		while(lotto.size()<6) {
			lotto.add( (int) (Math.random() * 45) + 1);
		}
		return lotto;
	}
	@Override
	public void sound() {
		//super.sound();
		System.out.println("멍멍.....");
		
	}
	public static void main(String[] args) {
		
//		Animal ani = new Animal();
//		ani.sound();
		
		Dog dog = new Dog();
		dog.age =10;
		
		Set<Integer> lotto = dog.lotto();
		System.out.println(lotto);
		System.out.println(dog.lotto());
	}
	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

}
