package check;
import constants.Constants;

public class Main {
	
	private static String firstName = "知始";
	private static String lastName = "橋本";

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String Name1 = Constants.CHECK_CLASS_JAVA;
		String masterName1 = Constants.CHECK_CLASS_HOGE;
		String Name2 = Constants.CHECK_CLASS_R2D2;
		String masterName2 = Constants.CHECK_CLASS_LUKE;

		System.out.println("printNameメソッド→" + printName(firstName, lastName));
		Pet pet = new Pet(Name1,masterName1);
		Pet robot = new Pet(Name2,masterName2);
		pet.introduce();
		robot.introduce();
		
		}
	
	private static String printName(String first,String last) {
		return last + first ;
		
	}

}
