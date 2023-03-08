package ifex;

public class IfExample2 {

	public static void main(String[] args) {

		// 조건이 여러개인 경우
		// 같은 조건으로 여러개 값을 비교하여 내고 싶을 땐 elseif 사용
		// 같은 조건으로 각각 조건을 비교하여 모든 값을 내고 싶을 땐 모두 if문으로 사용.
		int age = 9;
		int charge = 0;
		
		if(age <= 8) {
			charge = 1000;
			System.out.println("미취학 아동입니다.");
		}
		else if(age <= 14) {
			charge = 2000;
			System.out.println("초등학생 입니다.");
		}
		
		else if(age <= 20) {
			charge = 2500;
			System.out.println("중,고등학생 입니다.");
		}
		
		else {
			charge = 3000;
			System.out.println("일반인 입니다.");
		}
		
		System.out.println("입장료는 " + charge + "원 입니다.");
		

		//조건문과 조건 연산자 (같은 값을 이렇게 나타낼 수도 있음)
		//= 조건문      if (a > b)  max = a; / else  max = b; 
		//= 조건 연산자  max = (a > b) ? a : b;
	}

}
