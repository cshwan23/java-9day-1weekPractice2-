package com.naver.erp;

public class Workspace04 {

	public static void main(String[] args) {

		//국어 95점 영어 88점 수학77
		
		int kor = 95;
		int eng = 88;
		int mat = 39;
		
		int tot = kor + eng + mat;
		double avg = (double)tot/3;
		
		String hakjum = "";
		String result = "";
		
		if (avg >= 90 && avg <= 100) {
			
			hakjum = "a";
			
		}else if (avg >= 80) {
			
			hakjum = "b";
			
		}else if (avg >= 70) {
			
			hakjum = "c";
			
		}else if (avg >= 60) {
			
			hakjum = "d";
		}else {
			
			hakjum = "f";
		}
		System.out.println("문1 = " + hakjum);
		
//문제 2)
//평균 80점이 넘으면 "합격"
// 80 미만이면 "불합격" 출력
		
		if (avg >= 80) {
			
			result = "합격";
			
		}else{
			
			result = "불합격";
			
		}
		System.out.println("문2 = " + result);
		
//문제3)
//삼항연산자를 이용하여 합격 불합격을 출력하자
		
		String result1 = avg >= 80 ? "합격" : "불합격";
		
		System.out.println("문3 = " + result1);
	
//문제4)
// 아래의 조건을 만족하면 합격 만족하지 못하면 불합격
// 조건 - 평균 60 이상, 각과목 40 이상
		
		if (avg < 60 || kor < 40 || eng < 40 || mat < 40) {
			
			
			result = "불합격";
			
			
		}else {
			
			result = "합격";
			
		}
		
		System.out.println("문4 = " + result);

		
//문제5)
//1부터 5까지 더한 결과를 출력
		
		tot = 0;
		
		for ( int i = 1; i <= 5 ; i++  ) {
			
			
			tot += i;
			
		}
		System.out.println("문5 = " + tot);
		
//문제6)
//1부터 5까지 더하되 홀수만 골라 더한 결과를 출력하기
		
		tot = 0;
		
		for ( int i = 1 ;  i <= 5 ; i+=2 ) {
			
			tot = tot + i;
			
		}
		System.out.println("문6 = " + tot);
		
//문제7)
//증감식 i++를 건들지말고 홀수의 합을 구해보기
// -> 알게 된 사실
// 반복문에서 i가 1씩 증감할 때
// i%2로 나눈 나머지 값은 2개가 나온다. 1 아니면 0
// i%3로 나눈 나머지 값은 3개가 나온다. 1 아니면 2 아니면 0 
// i%4로 나눈 나머지 값은 4개가 나온다. 1 아니면 2 아니면 3 아니면 0
		
		tot = 0;
		
		for (int i = 1 ; i <= 5 ; i++) {
			
			if (i%2 == 1) {
			// 2로 나눈 나머지가 0아니면1인데
			// 짝수나 홀수는 2개로 반복되기 때문
				
				tot = tot + 1;
				
			}
			
			
		}
		System.out.println("문7 = " + tot);

//문제8)
// for 문을 사용하여 1~ 60까지 더하되 40번대 숫자를 제외하고 더한 결과값을 출력
		
		tot = 0;
		
		for (int i = 1 ; i <= 60 ; i++ ) {
			
			
			if (!(i >= 40 && i < 50 )) {
		
			
				tot = tot + i;
			}

		}
		
		System.out.println("문제8 = " + tot);
		
//문제 9)
//5단 구구단을 아래처럼 출력
// 5 X 1 = 5
// 5 X 2 = 10
// 5 X 3 = 15
		System.out.println("문제9");
		
		int a = 5;
		
		for ( int i = 1 ; i < 10 ; i++) {
		
			
			System.out.println(a + " X " + i + " = " + a*i );
			
		}
		
//문제 10)
//ocjp 문제
//i의 값을 구하시오
		
		int i = 1;   
		int j = i++; 
		if ( ( i == ++j ) | ( i++ == j ) ) {
			   
			i = i + j;
			    
		}
		
		System.out.println("문10 = " + i );
//i = 5 출력
		
//문제 11) 
//i 값 구하시오
		i = 1;   
		j = i++; 
		
		if ( ( i == ++j ) || ( i++ == j ) ) {
			        
			i = i + j;
			   
		}
		
		System.out.println("문11 = " + i );
		//4출력
		
//문제 12)
//평균 60이상 두과목 70점이상 합
//cnt변수 써서 증감식으로 만드시오
		
		int cnt = 0;

		if (kor >= 70) {
			cnt++;
		}
		if (mat >= 70) {
			cnt++;
		}
		if (eng >= 70) {
			cnt++;
		}
		if (avg >= 60 && cnt >1 ) {
			result = "합격";
		}else {
			result = "불합격";
		}
		System.out.println("문12 = " + result);
		
//문제 13)
//switch 구문
//break 쓰는 이유
//같다면 원하는 데이터 갖고 빠져나오게 하려고
//break를 안 써 놨다면,
//만약 true 여도 그대로 지나서 다음브레이크 앞의 데이터 실행구문을 실행한다.
//(case가 맞지 않아도)
		
		result = "";
		int xxx = (int)avg;
		
		switch (xxx) {
		
		case 100 : result = "A"; break;
		case 99 : result = "A"; break;
		default : result = "점수없음"; break;
		// 위에 나온 케이스에 맞는 값이 없을 경우 디폴트 오른쪽 실행구문 실행. 
		
		// switch 구문의 장점 : 화면에 벗어날 정도로 길어져도 switch 구문인지 알 수 있다.
		// case 때문에
		}
//문제 14)( 틀렷다 )
//&& 와 & 의 차이점
//&&는 좌우가 같아야 한다. true
//&&는 한쪽만 false이면 다음 연산은 하지 않는다.
//&는 좌우가 같아야 true
//&는 한쪽이 false여도 다음 연산 진행한다.
		
		i = 0; 
		j = 1; 
		
		if ( (i++ == 0) & (j++ == 2)) {
			               
			i = 42;
			
		}
		System.out.println("문14 = " + (i+j));
		//정답 1+2는 3이 된다.
		
//<for문> 응용
		
//문제 15)
//for 문을 사용하여 1~11까지 곱한 더한 값을 출력.
		
//	1*1= 1	1*2 =2  2* 3 = 6  6*4 = 24  24 * 5 =
		
		
		tot = 1;
		
		for ( i = 1 ; i <= 11  ; i++  ) {
			
			
			tot = tot * i;
			       
		}
		System.out.println( "문15 = " + tot );
		//정답 39916800
		
//문제 16)
//for문을 사용하여 5~1까지 거꾸로 더해보자
		
//		5 + 4 + 3 + 2 + 1
		
		tot = 0; //5 -> 9 -> 12 -> 14 ->15
		
		for (i = 5 ; i > 0 ; i-- ) {
			
			
			tot = tot + i;
//			       14    1
		}
		System.out.println("문16 = " + tot);
		//정답 15
		
//문제 17)
//더블 반복문 예제 - 아래처럼 구구단 만들기
//1 X 1 = 1    2 X 1 = 2  3 X 1 = 3  4 X 1 = 4 ... 9 x 1 = 9
//1 x 2 = 2    2 x 2 = 4  3 x 2 = 6  4 x 2 = 8 ... 9 x 2 = 18

//첫줄은 
//		1번 숫자가 1 2 3 4 5 바뀐다. => j
//		2번 숫자는 1로 고정되지만 (다음줄에서 2345늘어난다) => i
//		3번 숫자는  1번 숫자에 * 2번숫자를 곱한 값이다. i*j
	
		System.out.println("문17");
	
		for (i = 1; i <= 9 ; i++) {
			
			for ( j = 1 ; j <= 9 ; j++) {			
				
				System.out.print(j +" x "+ i +" = "+ (j*i) + "    " );                
				              
			}
			
			System.out.println();
		}
//문제 18)
// 5단 제외하고 구구단 출력하기
		
		System.out.println("문18");
		
		for (i = 1; i <= 9 ; i++) {
			
			
			for ( j = 1 ; j <= 9 ; j++) {			
				
				if(!(j == 5)) {
			
				System.out.print(j +" x "+ i +" = "+ (j*i) + "    " );                
				              
				}
			}
			
			System.out.println();
		}
		
// 문제 19
// continue;용법
// continue가 나오면 같은 블럭의 그 아래의 실행구문은 실행하지 않고 
// 바깥으로 빠져나가 증감식으로 간다.
		

		System.out.println("문18");
		
		for ( i = 1; i < 10	; i++ ) {
			
			
			for ( j = 1; j < 10; j++ ) {
				
				if (j == 5) {
					
					continue;
					
				}
				System.out.print(j+" x "+i+" = "+(i*j)+ "   ");
				
			}
			
			System.out.println();
			
		}
		
// 문제 19
// continue;용법 사용하여 5단만 출력하기
		
				

		System.out.println("문19");
				
		for ( i = 1; i < 10	; i++ ) {
					
					
			for ( j = 1; j < 10; j++ ) {
						
				if (j == 5) {
							
					System.out.print(j+" x "+i+" = "+(i*j)+ "   ");	
							
				}
				
				continue;	
			}
					
			System.out.println();
			
		}
		
//문제 20)
//1단부터 5단까지 출력하기
//단, int i<=9; i<=9; i++와 int j<=0; j<=9;는 고정
		System.out.println("문20");
		
		for ( i = 1; i < 10	; i++ ) {
					
					
			for ( j = 1; j < 10; j++ ) {
						
				if (j <= 5) {
							
					System.out.print(j+" x "+i+" = "+(i*j)+ "   ");	
							
				}else {
				
				continue;	
			}
			
			}
			System.out.println();
			
		}
//문제 21)
//1단부터 5단까지 출력하기
//단, int i<=9; i<=9; i++와 int j<=0; j<=9;는 고정
//continue 없이
		
		System.out.println("문21");
				
		for ( i = 1; i < 10	; i++ ) {
							
							
			for ( j = 1; j < 10; j++ ) {
								
				if (j <= 5) {
									
					System.out.print(j+" x "+i+" = "+(i*j)+ "   ");	
									
				}
					
			}
			System.out.println();
					
		}	
//문제22
//break사용
		System.out.println("문22");
		
		for ( i = 1; i < 10	; i++ ) {
							
							
			for ( j = 1; j < 10; j++ ) {
								
				if (j > 5) {
									
					break;	
									
				}
				System.out.print(j+" x "+i+" = "+(i*j)+ "   ");
			
			}
			System.out.println();
					
		}	
		
//문제 23)
//구구단의 곱셈 결과가 48일때 까지만 출력하기
//블럭 안의 변수는 바깥 쪽의 변수를 인지한다
		System.out.println("문23");
		
		for ( i=1  ; i<10    ; i++   ) {
			
			
			
			for( j=1   ; j<10   ;  j++  ) {
				
				if((i*j)>48) {
					continue;
				}
			
				System.out.print(j + " x " + i + " = " + (j*i) + "  ");
				
			}	
			
			System.out.println();

		}
//문제 24)
//break를 걸면 한블럭이 아니라 그 이상 바깥으로 빠져나가게 하는 방법
//밖으로 나갈때 바깥에서도 break를 걸어야 하는데 그냥 break를 쓰게되면
//원하는 순간에 빠져나갈 수 가 없다.
// 원하는 순간에 빠져나가게 하기위해서
// 참 거짓으로 변수를 만들면 
// 내가 참이라고 명령만 주면 빠져 나갈 수 있다.
// 같은 콘센트로 연결 시켜 놓고 같은 변수명이 참일 경우 
// 그 변수명을 여러군데 설치해놓고 동시에 스위치가 켜지듯.
//하는 방법이 true false 스위치처럼 사용한다.
System.out.println("문24");
		
        boolean isStop = false;

		for ( i=1  ; i<10    ; i++   ) {
			
			
			
			for( j=1   ; j<10   ;  j++  ) {
				
				
				if((i*j)>48) {
					
					isStop = true; break;
				}
			
				System.out.print(j + " x " + i + " = " + (j*i) + "  ");
				
			}	
			if (isStop == true) {
				break;
			}
			System.out.println();

		}
System.out.println("");	


//문제 25
//최초 반복문 for 앞으로 빠져 나가도록하는 방법
//		zzz : 앞에 붙이고  
//		브레이크 거는 구간에서 break zzz; 이렇게 써줘야 완성이 된다.
//		이러 zzz:있는곳 밖으로 빠져나간
		
System.out.println("문25");

		zzz : for ( i=1  ; i<10    ; i++   ) {
			
			for( j=1   ; j<10   ;  j++  ) {
				
				if((i*j)>48) {
					
					break zzz;  
					//zzz 로 빠져나가라. break 빠져 나가는데 ;안붙이면 zzz뒤에 ; 붙이면
					//zzz로 빠져나가라는 뜻.암기.
					
					
				}
			
				System.out.print(j + " x " + i + " = " + (j*i) + "  ");
				
			}	
			
			System.out.println("");

		}					System.out.println("");


//문제 26)//바보다//어렵다.
//1~100까지 더한 누적 합이 50미만일때까지 더하고 출력하기
		System.out.println("문26");


	tot = 0;
	
	for ( i=1 ; i<=100 ; i++ ) {
	
		if (tot+i >= 50) {
		
			break;
			
		}
		tot = tot + i;

	}
	System.out.println(tot);
		

	//문제 27)
	//else사용

	//1~100까지 더한 누적 합이 50미만일때까지 더하고 출력하기
			System.out.println("문27");


		tot = 0;
		
		for ( i=1 ; i<=100 ; i++ ) {
		
			if (tot+i >= 50) {
			
				break;
				
			}else {
			tot = tot + i;
			}
		}
		System.out.println(tot);	
		
//문제 28
//아래 형태로 출력하기
// 1
// 12
// 123
// 1234
// 12345
		System.out.println("문28");
		//1%i
		tot = 0;
		for ( i = 1 ; i<6 ; i++ ) {
			 
			for ( j=1 ; i>=j ; j++) {
		
				
				System.out.print(j);
	
				
			}
			
			System.out.println();
			
		}
		System.out.println("문제 29");
//<문제 29> **어려움
//아래 형태로 출력하기
//		1
//		23
//		345
//		4567
//		56789	
		
		for ( i=1 ; i<6  ;i++  ) {
			
			
			
			for( j=i ; j < i*2 ; j++ ) {
				  
				
				System.out.print(j);
			}
			System.out.println();
		}
		
//문제 30 
//소정이 지각
		
		System.out.println("문제 30");

		boolean isLate = false;
		
		String aa = "";
		
		if (isLate == true) {
			
			aa = "택시";
			
			
		}else {
			
			aa = "버스..";
		}
		
		System.out.print(aa);

		
//문제 31
//      *
//		**
//		***
//		****
//		*****
		System.out.println("문31");
		for (i=1 ;i<6 ;i++)  {
			
			for (  j=1 ; j<=i  ;  j++  ) {
				
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
//문제 32
		System.out.println("문32");
		
		a = 1; 
		int b = 5;

		jump : for ( ; ; ) {
	
			a++; 
			for( ; ; ) {
		
				if (a>b--) { break jump;}
			

			}
		}
	System.out.println(a+b);
//		2+0 =2
	
	
//문제 33
	System.out.println("문33");
	a = 0;
	b = 5;
	
	outer : for( a=0 ; a<5 ; a++ ) {
		
		inner : for( b=0 ; b<5 ; b++ ) {
			
			if(a==1&&b==0) { break outer; }
			   
			if(a==2&&b==1) { continue inner; }
			   
		}
	}
	System.out.println(a+b);
	
//문 34
	System.out.println("문 34");
	
	a=1;
	b=5;
	boolean c = false;
	for( i = 0 ; i > -1 ; i++) {
		
		a++;
		for( j = 0 ; j > -1 ; j++ ) {
			
			if( a> --b ) { c = true; break;}
			    
		}
		if( c ) { break; }
		
	}
	System.out.println(a+b);
	
	//문 35
//	Which two are valid declarations of boolean? (Choose two.)
//		타당하게 선언된 불린 데이터를 두가지를 고르시오.
	
////	A. boolean b = 0;
////	B. boolean b = true;
////	C. boolean b = "true";
////	D. boolean b = 'true';
////	E. boolean b = (3 >= 0);
	
//	b E
// 
	
//	문제 36
	
//	Q. for문과 while문을 언제 다르게 쓰는지 차이점을 말하시오.
//  A. [for문] 일정하게 증가 하거나 감소하면서 반복할 때는 for문
//	for문은 언제 끝나고 언제 시작하는지 파악하기 쉽다.
//	언제까지 도는지 대강 예측이 가능하다.
//	for문은 while문을 포함하고있다
//	for문은 증감식 초기설정값이 있다. 뭔가 일정하게 반복하거나 증거할때.
//	[while문]은 일정하게 증가하거나 감소하는 것과 상관 없이 
//	특정한 조건만 만족하면 들어갈 수 있다. for문의 증감식과 조건문을 빼면 while문이 된다.
//	while문은 조건식만 맞으면 자연스럽게 반복해서 돕니다.
	
//문제 37
	System.out.println("문 37");

//	while문을 사용하여 1~5까지 더하기
	
	tot = 0;
	
	while (i < 6 ) {
		
		
		tot = tot + i++;
		
	}
	System.out.println(tot);
	
	
//문제 38
	
//do - while문을 사용하여 1~5까지 더하기
	
	
	tot = 0;
	i = 1;
	
	
	do {
		
		tot = tot + i++;
		        
	}while (i<6);

System.out.println("문 38 = "+tot);
		
//웹 프로그램에서 디비에서 데이터를 갖고와서 출력할 때 반복문을 많이 사용한다

		

//문제 39 
System.out.println("문제 39");
//2~10 사이의 소수를 찍어보자.

// 소수란? 1과 자기자신으로만 나누어 떨어지는 숫자를 말한다.
// 나머지가 없다는 뜻 1357
// 3은 소수인가? 
// 3을 1로 나누면 나머지는 0 
// 3을 3으로 나누면 나누어 떨어진다. // 
// 소수는 암호에 관련된 보안에 관한 프로그램을 만들때 많이 쓰인다. 
// 소수를 찍는 프로그램. (신입이 갖추어야 할 실력.) 
// ex) 신입면접 때 한 회사에서 열다섯명 빼고 한명씩 손으로 소수를 쓰는 프로그램 쓰게 한다. 
// 반복문을 찍는 결정체. (소수 프로그램 짜기)

//ex ) 5가 소수인지 아닌지 
// 5%1 => 0 cnt++ 
// 5%2 => 1
// 5%3 => 1 
// 5%4 => 1
// 5%5 => 0 cnt++ 

//ex)4가 소수인지아닌지 
// 4%1 => 0 cnt++ 
// 4%2 => 0 cnt++ 
// 4%3 => 1 
// 4%4 => 0 cnt++

// 2~10까지 소수를 찍어보자
//cnt쓰는 이유.. 2개의 값이나오는지 확인할 때 두개값만 나오는걸 골라내야할 때 카운트

for(  i = 2 ; i <= 10  ; i++ ) {
	
	cnt = 0; 	
	for (j=1  ; j <= i  ; j++ ) {
		       
		if (i%j==0) {  cnt++; }

	}
	if (cnt==2) {
		System.out.println(i);}
}

//문제 40
System.out.println("문제40");
//국어 50 영어 70 수학 80이다
//높은 점수의 과목 순으로 출력하면?
 kor = 50;
 eng = 70;
 mat = 80;
 
 int tmp = 0;
 String tmp1 = "";
 
 String sub1 = "국어";
 String sub2 = "영어";
 String sub3 = "수학";
 
int num1 = kor; 
int num2 = eng; 
int num3 = mat; 

if (num1<num2) {
	
	tmp = num1;
	num1 = num2;
	num2 = tmp; 
	
	tmp1 = sub1;
	sub1 = sub2;
	sub2 = tmp1;
	
}
if (num1<num3) {
	
	tmp = num1;
	num1 = num3;
	num3 = tmp;
	
	tmp1 = sub1;
	sub1 = sub3;
	sub3 = tmp1;
}
if (num2<num3) {
	
	tmp = num2;
	num2 = num3;
	num3 = tmp;
	
	tmp1 = sub2;
	sub2 = sub3;
	sub3 = tmp1;
	
}
System.out.println(num1+ "," + num2+"," + num3);
System.out.println(sub1+ "," + sub2+"," + sub3);

//1번 문제(x)

//int a = 10, c = 0;
//long b = 30;
//c = a + b;
//System.out.println(c);


//정답 : 자료형의 우선순위의 불일치 long이 더 큰데 int로 들어가려고 하니까. 형변환이 안된다.

//2번 문제(x)

//int a=1, b=5, c=3;
//c = ++a + b++;
////c +=;
//System.out.println(c);

//정답 : 주석처리 계산하면 안됨.
	
//3번문제 (o)

 a = 3;
         
if( a-- > 4 )
	
	a++;

if( ++a > 7 )

	++a;
    
else
	
	a = ++a + a++;
       
System.out.println(a);


//정답 : 8 출력



//4번 문제(o-x)

 a = 2; 
        
switch (a) {
        
case 1 : a++; 
case 2 : a++;  break;
case 3 : a++;

}
System.out.println(a);






//정답 : 
//1.switch 구문의 데이터자료형은 double float은 안된다.
//2.switch 의 (변수)가 실행구문의 case 데이터가 같을 때 case 실행.

//case1은 switch의 변수값과 데이터가 같지 않으므로 : 이후의 실행구문 실행x
//case2는 2와 같으므로 : 이후의 실행구문 실행. 
//breakrk 나오면서 switch구문 밖으로 빠져 나오면서 a의 값은 3이된다.

//4-1번 응용 문제
a = 2;
    
switch (a) {
       
case 1 : a++;
case 2 : a++;
case 3 : a++; break;
         
}
System.out.println(a);









//정답 : 4가 된다
//case2가 맞아도 break가 없다면 그다음으로 밀고 들어가는데
//case3은 데이터와 변수가 맞지않지만 3은 건너뛰고 밀고 들어간다.
//: 이후의 실행구문 실행하고 break  



//5번 문제(x)

// b = 1; 
// int c1 = 0;
//for( int aaaa=2; aaaa<5; aaaa++) {
//
//	if(c1++>b) {b=aaaa+c1;}
//
//}
//
//System.out.println("s"+aaaa+b+c1);


	
//정답 : Systemprintln의 값중 a는for 문 안에 있기 때문에
//	a를 for문 밖에서 실행할 수 없다.

	
//6번 문제(x)
	
	int a22 = 0, b22 = 5;
				  
	jump : for( ; ; a22++) {
			
			for ( ; ; --b22 ) {
				        
				if (a22>b22) break jump;
					
			}

	}
   System.out.println("문6 = " +(a22+b22));






   
//정답 -1
//1.
//for문 안에 조건식이 없기때문에 무조건 들어간다.
//for문안의 if 문이 트루가 아니여도 for문의 증강식 조건식이 없기때문에 무한루프이다.
//if 문이 트루가 되면 무한루프 종료. 
   
//2.
//for문에서 break를 걸면 for문 밖으로 나가는
//break 뒤에 jump;가 나오면 jump:가 걸려있는 for문 밖으로 빠나가게된다.
   
	
	
	
	
//문제 7. (x)
   
   int a9 = 1, b9 = 5;
            
   jump : for( ; ; ) {
	   
	   a9++;
	 
	   for( ; ; ) {if (a9 > --b9) break jump;}                   
	                 
   }
   System.out.println("문7 = " +(a9 + b9));
   
//   3

   
//정답 : 3
//틀린 이유 : for문의 실행구문 안의 구문이 false 일지라도 for문 밖으로 나가지 않는다.
//for 문 밖으로 나가려면 for문의 조건식에 맞지 않아야 빠져나가거나.
//break가 나와야 for 문을 빠져나간다.
	
//8번 문제 (o)
	
	int a8 = 0 , b8 = 5;
	         
	       
	outer : for(a8=0; a8<5; a8++) {
		        
		inner : for(b8=0; b8<5; b8++) {
			          
			if(a8==1&&b8==0) { break outer; }
			   
			if(a8==2&&b8==1) { continue inner; }
						
		}
		
	}
	System.out.println(a8+b8);

   
   
	
//정답 : 1
	
	
	
//9번 문제 (o)
	
	
//int a7 = 0;
//
//while( a7=1 ) {
//	
//	if(a7==3)
//		break;
//	a7++;
//	
//}
//System.out.println(a7);
	
	
	
	
//정답 : 컴파일 에러
//while문 조건식이 true 나 false 여야 한다.
//정답 : a==1이여야 한다.
//주의 할 점 if 문 실행구문이 한줄이면 {}생략 가능하여 a++은if문 실행구문이 아니라 while 실행문에 소속이다.
  
	
	
	
	
	
//10번 문제(o)

	int a6 = 1, b6 = 0;
	         
	do {
		
		if  (a6++ > --b6) continue;
		      
	}while (a6<5);
	System.out.println(a6+b6);
	
	
	
	
	
	
	
//정답 1출력
//continue는 그다음 실행구문을 실행하지않고 반복문안으로 조건식으로 넘어간다.

	
int max_starCnt = 5;

for( i = 1 ; i <= max_starCnt ; i = i+2) {
	     
	for(j=1 ; j <= (max_starCnt-i)/2 ; j++) {
		    
		System.out.print(" ");
		
	}
	
	for(j=1 ; j <=i ; j++) {
		    
		System.out.print("*");
	}
	
	System.out.print("\n");
	
}
	
//과정 찾아가면 정답은 아래와 같이 나온다.
//	공백 한번 찍음./공백 한번 찍음/별찍음/줄바꿈.
//	공백 한번 찍음./별찍음/별찍음/별찍음/줄바꿈.
//	한번찍음/찍 / 찍 / 찍 / 찍/ 줄바꿈,



		
	}

}
