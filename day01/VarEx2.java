package day01;
//예제4번 홍길동은 20살이며 키가 182.3입니다

//VarEx2라는 class가 시작된다
public class VarEx2 {
	// main method
	public static void main(String[] args) {

		// 20살은 정수형 변수 i에 대입, 적당한 크기 byte or int 써도된다
		// int크기의 변수 i를 선언하고, 그곳에 20을 대입해라
		int i = 20;

		// 182.3은 실수형 변수 h에 대입, float double 중에 큰거쓸필요없다
		// float크기의 변수 h를 선언, 182.3을 대입하라
		float h = 182.3f;
		// 화면출력
		// 나이:i살 값을 프린터에 출력해줘
		System.out.println("나이:" + i + "살");
		// 키:h의 값을 프린터에 출력해줘
		System.out.println("키:" + h);

	}

}
