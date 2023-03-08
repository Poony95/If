package ifex;

public class SwitchCase {

	public static void main(String[] args) {

				
	// switch-case문 (조건식의 결과가 정수 혹은 문자열의 값이고 그 값에 따라 수행문이 결정될 때)
	// if-else 을 대신하여 swich-case 문을 사용할 수 있습니다.
			
		
		int rank =2;
		char medalcolor;
		
		switch(rank) {
		case 1: medalcolor = 'G';
				break;
		case 2: medalcolor = 'S';
				break;
		case 3: medalcolor = 'B';
				break;
		default: medalcolor = 'A';
		}
		System.out.println(rank + "등 메달의 색깔은 " + medalcolor + "입니다.");
		
		// break을 안쓰면 수행을 하고 나가지 않고 다음 값으로 나와버림.
	}
}
