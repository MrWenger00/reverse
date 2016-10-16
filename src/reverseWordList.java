/**@author Guilherme Wenger
 * 
 * */

import java.util.Scanner;

public class reverseWordList {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite uma palavra qualquer: ");
		String word = input.next();
		String[] array = word.split("");
		reverse(array);
		
		input.close();
	}
	
	public static void reverse(String[] array){
		index newIndex = new index();
		word newWord = new word();
		newWord.head = null;
		newWord.tail = null;
		
		letter newLetter = new letter();
		newLetter.value = array[0];
		newWord.head = newLetter;
		newWord.tail = newLetter;
		newLetter.next = null;
		newLetter.back = null;
		newIndex.position = newLetter;
		
		for (int i = 1; i < array.length; i++) {
			letter myLetter = new letter();
			myLetter.value = array[i];
			newIndex.position.next = myLetter;
			myLetter.back = newIndex.position;
			newIndex.position = myLetter;
			newWord.tail = myLetter;
		}
		
		newIndex.position = newWord.tail;
		while(newIndex.position != null){
			System.out.println(newIndex.position.value);
			newIndex.position = newIndex.position.back;
		}
		
	}
}
