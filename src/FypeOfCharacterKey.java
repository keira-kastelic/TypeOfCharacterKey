import java.util.Scanner;
/**
 * Auto Coin Lab
 * Author: Keira
 * Collaborator(s): Megan
 * On My Honor, I confirm that I followed all collaboration policy guidelines and that the work I am submitting is my own: KAK
 **/

public class FypeOfCharacterKey {
    public static void main(String[] args) {
        System.out.println("Enter a character"); // prompting the user
        Scanner s = new Scanner(System.in); // creating a scanner
        String letter = s.nextLine(); // reading in the users input
        char character = letter.charAt(0); // finding the character at the index

        if (character==65||character==69||character==73||character == 79||character==85||character==97||character==101||character==105||character==111||character ==117) // seeing if it is a vowel
            System.out.println("Is a vowel a, e, i, o, u, A, E, I, O, U"); // printing out if it is a vowel or not
        if (character >= 65 && character <= 90 || character >= 97 && character <= 122) // finding out if it is a letter based on the numbers of the alphabet
            System.out.println("Is a letter"); //printing out the answer is correct
        if (character >= 48 && character<= 57) // finding out if it is a number
            System.out.println("Is a number"); // printing out the answer if correct
        if(character >= 32 && character <= 47 || character >= 58 && character <= 64 || character >= 91 && character <= 69 || character >= 123 && character <= 126) // figuring out if it is a symbol
            System.out.println("Is a symbol"); // printing out if it is a symbol
        if(character < 0 || character > 127) // printing out the bounds of the characters, and finding if the letter is unknown
            System.out.println("Unknown"); // printing out the answer if correct
        }

    }
