package inter;
//인터페이스
/*
 * 인터페이스 : 다른 언어에서 찾아보기 힘든 고급 기능
 * 왜? 어떻게 쓰지?
 * 
 * 인터페이스란?
 * 추상 클래스입니다. = 추상화
 * 추상 클래스는 추상 메소드를 가지고 있습니다.
 * 				 일반 메소드를 가지고 있습니다.
 * 인터페이스는 오직 추상 메소드만 가지고 있습니다.
 * 
 * 인터페이스 내에 존재하는 메소드는 무조건 추상 메소드 입니다.
 * 인터페이스 내에 존재하는 변수는 무조건 상수 입니다.
 * 
 * 인터페이스 속 메소드는 public abstract 메소드명으로 선언
 * 				 변수는 static final 선언
 *  
 *  인터페이스 다중상속이 가능합니다.
 *  
 *  interface AAA{	 class 자리에 interface를 선언한다.
 *   		static final int NUMBER = 100;  상수 선언
 *   		public abstract void print();
 *  }
 *  
 *  class Cat implements AAA{ (상속과 비슷하다)
 *  		AAA에 미구현된 내용을 구현합니다.
 *  		@override
 *  		public void print(){
 *  			//구현해줍니다.
 *  	}
 *  }
 *  
 *  특징 : 인터페이스는 객체로 만들 수 있나요?
 *  주의할 점
 *  	클래스에 인터페이스 상속시 인터페이스 내
 *  	모든 추상 메소드를 구현해야 합니다.(오버라이드 해야합니다.)
 *  
 *  그럼, 상속하고 인터페이스하고 차이점은?
 *  
 *  	상속 :  class A extends B {}
 * 				B라는 클래스를 상속받아 A에 더한다.
 * 				순수상속 : 부모로부터 모든 권한/능력을 가져온다.
 * 
 * 
 * 인터페이스 :class A implements B { }
 * 				B라는 인터페이스의 기능을 A에 구현한다.
 * 				권한 상속 : 인터페이스만 가져온다.
 * 							비어있는 것을 가져와서 그속을 만들기.
 *  
 *  
 * 
 */

interface SayHi{
	public void sayHi(); // 추상메소드로 만든다. 본디 abstract를 써줘야하지만 interface는 저걸 가지고있는 거라 안써줘도 된다.
	public void sayBye();	
}

class Start implements SayHi{//이제 인터페이스와 연결합니다.

	@Override
	public void sayHi() {
	}

	@Override
	public void sayBye() {
	}
}


public class Inter01 {

}
