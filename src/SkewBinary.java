import java.util.Scanner;

public class SkewBinary {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		boolean was2 = false;
		int total = 0;
		
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) >= '0' && input.charAt(i) <= '2') {
				int val = Integer.parseInt(Character.toString(input.charAt(i)));
				if (was2 && (val != 0)) {
					System.out.print("Error");
					return;
				}
				total += val * (pow(2, input.length() - i) - 1);
				if (val == 2)
					was2 = true;
			} else {
				System.out.print("Error");
				return;
			}
		}
		System.out.print(total);
		
		scan.close();
	}
	
	private static int pow(int a, int b) {
		int r = 1;
		
		for (int i = 0; i < b; i++) {
			r *= a;
		}
		
		return r;
	}

}
