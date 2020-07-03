package day01;
//VarEx3 이라는 class 가 시작된다
public class VarEx3 {
		//main method 자바 응용프로그램의 시작과 끝
		public static void main(String[] args) {
			//byte 크기에 b1이라는 변수를 선언하고, 10의 값을 대입해
			byte b1=10;
			//byte 크기에 b2라는 변수를 선언하고 50값을 대입
			byte b2=50;
			//b1과 b2를 화면에 출력해줘
			System.out.println("b1:"+b1);
			System.out.println("b2:"+b2);
			//short크기에 sh1을 선언하고, 12801의 값을 대입하라
			short sh1=12801;
			//b1이라는 변수안에 들은 값을 sh1이라는 변수에 대입해,b1이 sh1보다 작아서 가능
			//sh1 = b1; 가능
			//b1=sh1; 가능할까? 변화시켜서 담아보기
			//강제 형변환(앞에 byte붙이기)을 하면 데이터의 일부가 손상될 수 있다
			//되긴되지만 데이터손상,-나 0나와버림, 바이트는 작은 변수이기 때문에
			b1=(byte)sh1;
			//화면에 b1:값을 출력해줘
			System.out.println("b1:"+b1);
			
			//문자형   CHAR
			//2byte 크기
			//아스키 코드값으로도 문자 저장할 수 있다.
			//싱글쿼테이션, 아스키로 써도 문자 들어갈 수 있다
			//char크기의 c1을 선언하고, 'a'를 대입하라
			char c1 ='a';//글자 한글자만 사용가능
			//char크기의 c2를 선언하고, 97을 대입하라/97은 아스키a
			char c2=97;//ASCII 값
			//A:65, a:97, 0:48
			//char크기의 c3를 선언하고, 유니코드a값을 대입하라
			char c3='\u0061';
			//유니코드 a를 숫자로 표현하면
			//화면에 c1,c2,c3의 값을 출력하라
			System.out.println("c1:"+c1);
			System.out.println("c2:"+c2);
			System.out.println("c3:"+c3);
			
			//여러글자 저장하기
			//string,"" 는 문자열 의미 / ''싱글은 문자 하나를 의미
			String str="java";//여러글자 사용할때 스트링
			//화면에 str의 값을 출력해줘
			System.out.println(str);
			
			//java
			//'a' 문자, "java" 문자열
			
			
		//10월 14일
			//특수문자 : 탭 엔터 키

			// \ 문자이용해서 : 특수문자 표현 가능하다 
			// \n 은 엔터를 의미
			// \t : tap
			// \b : 백스페이스
			// \\ : 문자표현시 \ 두개로 표현
			// \' :  싱글쿼테이션은 일반 문자
			// \" : " 역시 일반문자
			
			//엔터와 탭키를 문자안에 넣어보기
			//오늘은 엔터 즐거운 탭 월요일 입니다를 출력해줘
			System.out.println("오늘은\n 즐거운\t 월요일 입니다.");
			
			//논리형 : boolean 1bit만 있어도 가능하다, 1bit or 1bite 만 사용가능
			//c 언어는 boolean을 1과 0으로 표현가능 
			// 자바는 반드시 true, false 로 표현해야 한다
			// 참, 거짓 과 같은 논리값을 저장 할 수 있는 자료형 boolean/참거짓 저장
			//boolean크기의 bl1를 선언하고 true를 대입하라
			boolean bl1 = true;
			//boolean크기의 bl2를 선언하고 false를 대입하라
			boolean bl2 = false;
			//bl1rhk b12 의 값을 모니터에 출력해줘
			System.out.println("bl1 : "+bl1);
			System.out.println("bl2 : "+bl2);
			
			
			
			
			
			
			
			
			
			
			
			
			
					
					
			
		}
}