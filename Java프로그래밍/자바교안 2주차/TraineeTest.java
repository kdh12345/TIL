class Trainee{
    String name;
	static String sosok = "멀티캠퍼스";
	String title;
	int fee;
	//final int addFee = 5000;
	int addFee ; 
	int returnFee;
}

public class TraineeTest {

	public static void main(String[] args) {
		//교육생 클래스의 객체를 생성하여 student 라는 이름의 변수로 참조하도록 합니다.
		Trainee student = new Trainee();
		//이 때 2-1 입력 4개 변수를 이름, 과정명, 교육비, 부가금 변수값으로 초기화합니다.
		student.name = args[0];
		student.title= args[1].toUpperCase();// jdbc...
		student.fee = Integer.parseInt(args[2]);
		student.addFee = Integer.parseInt(args[3]);
		
		/*실행 : 
			run-run configurations - -arguments-program arguments 차례대로 선택
			이자바 JSP프로그래밍 50000 5000
		*/	
			if(student.title.equals("자바프로그래밍")) {
			student.returnFee = (int)(student.fee * 0.25 + student.addFee);
			}
			else if(student.title.equals("JDBC프로그래밍")) {
				student.returnFee = (int)(student.fee * 0.2 + student.addFee);
			}
			else if(student.title.equals("JSP프로그래밍")) {
				student.returnFee = (int)(student.fee * 0.15 + student.addFee);
			}
			else {
				System.out.println("잘못 입력되었습니다");
				return;
			}	
			
			System.out.println("교육생이름=" + student.name);
			System.out.println("소속=" + Trainee.sosok);
			System.out.println("과정명=" + student.title);
			System.out.println("교육비=" + student.fee);
			System.out.println("부가금=" + student.addFee);
			System.out.println("환급금=" + student.returnFee);
	}//main


}
