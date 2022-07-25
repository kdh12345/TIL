

public class TwoDimArray {

	public static void main(String[] args) {
		// 3명학생 2,3,4과목 점수 - 
		int array2 [][] = new int[3][]; 
		String names[] = new String[args.length];
		//명령행 매개변수 학생이름 3명 입력 저장 배열
		//구현
		
		// 각 학생의 총점 / 평균
		// 이름 같이 출력   
		// xxx 학생 : { 점수들 } : 해당학생의 총점 = xxx : 해당학생의 평균 : xxx
		for(int i = 0; i < array2.length; i++) { // 3
			array2[i] = new int[i+2];
			System.out.println(array2[i].length); 
			System.out.print("{");
			for(int j = 0; j < array2[i].length; j++) {
				array2[i][j] = (int)(Math.random() * 100)+1;
				System.out.print(array2[i][j] + " ");
			}
			System.out.println("}");
		}
		
	}//main end

}//class end



