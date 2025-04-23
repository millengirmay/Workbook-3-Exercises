import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter the name of the story:(e.g. " +
                "goldilocks.txt, " +
                "hansel_and_gretel.txt," +
                " or mary_had_a_little_lamb.txt");
        String story = inputScanner.nextLine();
        try{
            FileInputStream fis = new FileInputStream(story);
            Scanner scan = new Scanner(fis);

            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
            scan.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
