package day01;

public class Ex02 {
	public static void main(String[] args) {
		// main 함수는 기왕이면 직접 쳐서 연습하기
		/* 
		 escape 문자
		 - 문자열 안에서 특수한 기능을 하는 것
		 - 문자열은 " "(큰따옴표)로 묶여있는 값들
		 - \n : 엔터와 비슷하다(줄바꿈)
		 - \t : tab(스페이스바 8칸정도)만큼 오른쪽 이동
		 - \\ : \ 하나 표현
		 - \" : " 하나 표현
		 */
		System.out.println("안\n녕\n하\n세\n요");
		System.out.println("1\t1234567\t12345678\t1");
		// \t 는 일단 8칸을 확보해 놓고 적혀있는 수 만큼 채우고 띄움
		// 빈칸이 없어지는경우 8칸만큼 더 띄움
		
		System.out.println("이름\t나이");
		System.out.println("홍길동\t20살");
		// 이와같이 끝단을 맞출 수 있음
		
		System.out.println(" \\ ");
		// \ 하나만 작성할 경우 오류 발생
		System.out.println("E:\\230406 오전 취업반 최선우\\java\\workspace\\day01\\src");
		// 경로 작성 시 이렇게 작성
		System.out.println("E:\\230406 오전 취업반 최선우\\새 폴더");
		// 이렇게 띄어쓰기가 있는경우 'E:\230406 오전 취업반 최선우\새' 까지만 인식할 수도 있음
		System.out.println("\"E:\\230406 오전 취업반 최선우\\새 폴더\"");
		// 이렇게 큰 따옴표로 묶어서 경로임을 알림
		
		System.out.println(" \" ");
		
	}
}
