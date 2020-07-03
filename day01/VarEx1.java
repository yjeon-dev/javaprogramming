package day01;
//변수 는 자료 처리를 위한 이름이 부여된 메모리 영역

//자료처리할 목적으로 메모리에 이름을 붙여놓은것
//1bit --> 8bit (1byte)
//변수종류 primitive type -> 정수형 은 byte
//정수형은 4가지 값을 가지는 것이 있음 byte(8bit), short 16, int, long

//VarEx1 이라는 class 가 시작된다
public class VarEx1 {
	// main method
	public static void main(String[] args) {
		// "Test"라는 값을 출력해줘, 표준 출력 장치
		System.out.println("Test");

		// 10이라는 숫자를 저장
		// 자료형 변수명
		// 변수를 선언한다, 컴퓨터 어딘가에 8비트라는 영역의 공간을 , 이름을 b1 이라해서만들어줘
		// b1 이라는 변수에 10의 값을 대입해
		byte b1;
		b1 = -128; // b1이라는 변수에 10을 대입해, 할당해(담아)/ 같다라는 뜻이 아님
		// b1= b1+1 // b1+1 이라는 수를 대입해 // byte -128(2의7승)부터 127까지가능
		System.out.println(b1);

		// 예제1 short 크기의 변수 k를 선언
		short k;
		// k변수에 5000 값을 대입
		k = 5000;
		// k 변수의 값을 화면에 출력
		System.out.println(k);
		// short 16bit 16자리 -32768부터 32767 / -2의 n-1승~2의 n-1승 -1(n은 8,16....)
		// int 32자리

		// 예제2 32bit크기의 변수 i를 선언
		int i = 1000000; // 초기화
		// i 변수에 100000값을 대입
		i = 1000000;// 생략가능
		// i 변수를 출력
		System.out.println(i);

		// 한번에 쓸 수 있다 = 초기화 int i =1000000;

		// 예3 자료형 변수명 = 상수;
		// 상수는 항상 일정한 수를 갖는 수
		// 상수형은 변수의 형과 동일
		// int 이하의 자료의 경우엔 int 타입, long은 대문자 L 붙여준다
		// long 크기의 변수 t를 선언하고, 300값을 대입한다
		long t = 300L;
		// t라는 수를 출력해줘
		System.out.println(t);

		// 부동소수점 floating point /지수부랑 가수부만 저장하면 엄청큰수와 엄청 작은수도 표현쉽게 가능
		// *정수형 byte, short, int, long 4가지
		// *실수형 float, double 2가지
		// 아래는 절취선
		System.out.println("---------------------------");

		// 실수형 변수 선언, 플롯타입은 뒤에 f
		// float 크기의 변수 f1을 선언, 3.14 값을 대입
		float f1 = 3.14f;
		// f1 변수를 출력
		System.out.println(f1);

		// double 크기의 변수 d1을 선언, 3.25값을 d1에 대입
		double d1 = 3.25d;
		// 실수형의 기본은 double 이다 //double이 기본이여서 d를 안써도 된다.
		// double 크기의 변수 d2를 선언하고 d2에 3.25를 대입
		double d2 = 3.25;
		// +는 두개 연결해서 실행해,문자열 뒤에서는 연결해서 실행(문자열과 문자열 연결하는 연결 연산자)
		// 문자열 f1뒤에 f1값을 넣어서 출력해줘
		System.out.println("f1" + f1);

	}
}
