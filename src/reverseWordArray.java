/**@author Guilherme Wenger
 * 
 * */
import java.util.Scanner;

public class reverseWordArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite uma palavra qualquer: ");
		String word = input.next();
		String[] array = word.split("");
		reverse(array);
		input.close();		
	}
	
	public static void reverse(String[] array){
		for(int i = array.length-1; i>=0;i--){
			System.out.println(array[i]);
		}
	}
}
