import java.util.Scanner;
import java.util.Random;

public class Magic_8_Ball {
	public static void main (String[] args){
	   Scanner sc = new Scanner(System.in);
	   
		
		boolean input = true;
	
		while (true){
			String answer;
			String[] str_array;
			str_array = new String[20];
				str_array[0] = "It is certain";
				str_array[1] = "It is decidedly so";
				str_array[2] = "Without a doubt";
				str_array[3] = "Yes definitely";
				str_array[4] = "You may rely on it";
				str_array[5] = "As I see it, yes";
				str_array[6] = "Most likely";
				str_array[7] = "Outlook good";
				str_array[8] = "Yes";
				str_array[9] = "Signs point to yes";
				str_array[10] = "Reply hazy try again";
				str_array[11] = "Ask again later";
				str_array[12] = "Better not tell you now";
				str_array[13] = "Cannot predict now";
				str_array[14] = "Concentrate and ask again";
				str_array[15] = "Don't count on it";
				str_array[16] = "My reply is no";
				str_array[17] = "My sources say no";
				str_array[18] = "Outlook not so good";
				str_array[19] = "Very doubtful";
				
				Random r = new Random();
				int index = r.nextInt(str_array.length);
				answer = str_array[index];
				
				System.out.println("You asked?");
				String question = sc.nextLine();
				if(question.contains("?")){
					System.out.println("Magic 8-Ball says: "+ answer);
				}else{
					System.out.println("There was not any question. Please ask again.");
					question = sc.nextLine();
					System.out.println("Magic 8-Ball says: "+ answer);
				}
				
				System.out.println("\nDo you have another question for Magic 8 Ball? (Y/N)");
				String reply = sc.nextLine();
				
				if (reply.equals("Y")){
					continue;
				}else if(reply.equals("N")){
					break;
				}
			
			
		}
		System.out.println("Thank you for asking questions to Magic 8-Ball.");
	sc.close();
	}
}
