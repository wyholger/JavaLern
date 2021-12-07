import java.util.Scanner;

public class BeerSong{
	static String word(int x){
		if (x > 4 | x == 0){
			return (" бутылок");
		}
		if (x != 1){
			return (" бутылоки");
		}
		if (x == 1){
			return (" бутылка");
		}
		return ("");
	}
	static boolean song(){
		int 	x = 99;
		String 	answer = "n";

		Scanner in = new Scanner(System.in);
		while (x > 0){
			System.out.println((x) + (word(x)) + " пива на стене");
			System.out.println((x) + (word(x)) + " пива");
			System.out.println("Возьми одну, пусти по кругу");	
			System.out.println((x - 1) + word(x - 1) + " пива на стене!\n");
			x--;
		}
		System.out.println("Наша песня хороша, начинай сначала 'y'/'n'(yes/no):");
		answer = in.nextLine();
		if (answer.equals("y")){
			return (true);
		}
		else {
			return (false);
		}
		
	}
	public static void main(String[] args){
		int	i = 0;
		while (song()){
			i++;
		}
	}
}
