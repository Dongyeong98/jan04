package ex01;

public class What {

	public static void main(String[] args) {
		int sum =0;
		int sum1=0;
		for(int i =1; i <10;i++) {
			sum1 +=i;
			if (i % 2 ==0) {
				sum +=i;
				}
			
		}
		System.out.println(sum1);
		System.out.println(sum);
		
		for(int a= 'A'; a< 'D'; a++) { //알파벳으로 설정하면 숫자를 쓰지않고 반복문 돌리기 가능
			System.out.println("밥밥");
		}
	}

}
