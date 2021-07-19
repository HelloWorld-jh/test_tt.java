package test;

public class LoopArray {

	public static void main(String[] args) {
		String[] users = new String[3];
		users[0] = "kjh";
		users[1] = "hhl";
		users[2] = "mom";
		
		for(int i=0; i<users.length; i++) {
			System.out.println(users[i] + ",");
		}

	}

}
