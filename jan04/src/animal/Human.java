package animal;

import java.util.Set;

public class Human extends Animal {
	private String ssn;
	final static int NUM = 101;
	static int check = 500;
	
	
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		// -기호 빼기
		ssn.replace ("-","");
		//부족한 자리는 *로 채우기
			while(ssn.length() < 13) {
				ssn+= "*";
		}
		this.ssn = ssn;
	}
	

	//add()
	int add(int num1, int num2) {
		return num1+num2;
	}
	
	@Override
	public void sound() {
		//super.sound();
		System.out.println("아.....개추워");
	}
	public static void main(String[] args) {
		Human human = new Human();
		Human.check = 5000; //static 붙은 애들은 클래스명(첫자리 대문자). 변수명
		
		int result = human.add(15, 30);
		human.setSsn("54444"); //저장
		System.out.println(human.getSsn()); //출력
		
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}
}
