package test;

public class AuthApp implements Login {

	public static void main(String[] args) {
		// String[] users = {"kjh", "hhl", "mom"};
		String[][] users = {
				{"kjh", "1111"}
				,{"hhl", "2222"}
				,{"mom", "3333"}
		};
		
		String inputId = args[0];
		String inputPass = args[1];
		
		boolean isLogined = false;
		
		for(int i=0; i<users.length; i++) {
			String[] current = users[i];
			if(
				current[0].equals(inputId) &&
				current[1].equals(inputPass)
			){
				isLogined = true;
				break;
			}
			
		}
		System.out.println("hello world");
		if(isLogined) {
			System.out.println("Login Success");
		}else {
			System.out.println("Login Failed");
		}
	}
		

}
