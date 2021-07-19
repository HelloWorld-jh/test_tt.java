package test;

public class ArrayApp {

	public static void main(String[] args) {
		// kjh, hhl, mom
		String[] users = new String[3];
		users[0] = "kjh"; //arrayName[index] = element
		users[1] = "hhl";
		users[2] = "mom";
		
		System.out.println(users[1]);
		System.out.println(users.length);
		
		int[] scores = {10,100,100};
		System.out.println(scores[1]);
		System.out.println(scores.length);

	}

}
