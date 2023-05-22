package check;

import constants.Constants;

public class Main {
		private static String firstName = "Takeuchi";
		private static String lastName = "Mizuki";
		
		private static void printName(String firstName, String lastName) {
		System.out.println("printNameメソッド"+"→"+ firstName + lastName);
		}

		public static void main(String[] args) {
			printName(firstName,lastName);
			Pet p1 = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
			p1.introduce();
			RobotPet p2 = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
			p2.introduce();// TODO 自動生成されたメソッド・スタブ
		}
}