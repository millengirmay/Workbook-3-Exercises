import java.util.Random;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        //without add exception handling or try or catch
       Scanner input = new Scanner(System.in);
        String[] quotes = new String[10];
        quotes[0] = "Love yourself!";
        quotes[1] = "It always seems impossible until it’s done";
        quotes[2] = "In the middle of every difficulty lies opportunity.";
        quotes[3] = "Believe you can and you’re halfway there.";
        quotes[4] = "You are enough!";
        quotes[5] = "Dream big. Start small.";
        quotes[6] = "Strive not to be a success, but rather to be of value.";
        quotes[7] = "Stay hungry. Stay foolish.";
        quotes[8] = "Less talk, more action.";
        quotes[9] = "The best way to predict the future is to create it.";
//
//        System.out.println("Choose your favorite quotes");
//        int choose = input.nextInt();
//        System.out.println("Your favorite quote is: " + quotes[choose]);

        // Add exception handling
        Random random = new Random();
        boolean options = true;

        while(options){
            try{
                System.out.println("\nchoose a number between 1 and 10 to get your favorite quote:");
                int choice = Integer.parseInt(input.nextLine());
                if(choice >= 1 && choice <= 10) {
                    System.out.println("\nYour favorite quote is:\n" + quotes[choice - 1]);
                } else if(choice == 11) {
                    int randIndex = random.nextInt(10);
                    System.out.println("\nRandom Quote: " + quotes[randIndex]);

                } else{
                    System.out.println("It is out of range");
                }
            }catch(Exception e){
                System.out.println("Invalid input! please enter a number");
            }
            System.out.println("\nDo you want to choose another quote? enter Yes or No");
            String response = input.next();
            if(!response.equalsIgnoreCase("Yes")){
                options = false;
                System.out.println("Done");
            }
        }
    }
}
