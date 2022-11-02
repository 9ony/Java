package day08;
//try블럭하나에 catch여러개 사용가능
public class ExceptionTest4 {

	public static void main(String[] args) {
		try {
			String num=args[0];//명령줄 인수
			String num2=args[1];
			//java day08.ExceptionTest4 안녕 하이
			System.out.println("num: "+num);
			System.out.println("num2: "+num2);

			int n1=Integer.parseInt(num);
			int n2=Integer.parseInt(num2);
			System.out.println(n1/n2);
//			String str=null;//예상치못한 예외
			String str="null";

			System.out.println(str.toUpperCase());
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("명령줄 인수 맞추세요");
			System.out.println("명령줄 인수 넣는법1 : cmd창 들어가서 workspace>begin까지들어간후");
			System.out.println("java day08.ExceptionTest4 안녕 잘가 <<입력");
			System.out.println("명령줄 인수 넣는법2 : 클래스파일 오른쪽클릭후 ");
			System.out.println("Run as > Run Configur.. > Arguments에 첫번째박스에입력");	
		}catch(NumberFormatException e) {
			System.out.println("숫자를 입력하세요.");
			System.exit(0);//종료시에는 finally블럭은 수행되지 않는다.
		}catch(ArithmeticException e) {
			System.out.println("0을 입력해선 안돼요!!");
			return; //return을 꼭써야될경우 finally를 추가해서 반드시 실행되어야할 코드를 안에넣는다 [1]
		}catch(Exception e) {
			System.out.println("예상치 못한 예외 발생 :"+e);
		}finally {//[1]!!
		System.out.println("반드시 실행되어야 할 코드#######");
		}
		System.out.println("The End~~");
	}

}
