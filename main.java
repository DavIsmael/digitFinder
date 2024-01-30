import java.lang.InterruptedException;
import java.util.Scanner;
import java.util.Arrays;
public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numbersList = {
                3948, 3943, 214949, 2394, 32243, 3949, 420949, 4924, 59398
        };
        System.out.println("List of numbers: " + Arrays.toString(numbersList));
        System.out.print("Input a number to be found from the list above: ");
        int toFind = scanner.nextInt();
        boolean numberFound = false;
        try{
            Thread.sleep(500);
            System.out.println();
            Thread.sleep(2000);
            System.out.println("Looking for requested number...");
            Thread.sleep(500);
            System.out.println();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        for(int i = 0; i < numbersList.length; ++i){
            try{
                Thread.sleep(2000);
                System.out.println("Checking..." + numbersList[i]);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            if(numbersList[i] == toFind){
                System.out.println();
                numberFound = true;
                System.out.println("The requested number: " + toFind + " was found!");
                break;
            }
        }
        if(numberFound != true){
            System.out.println();
            System.out.println("The requested number doesn't exist in the list");
        }
    }
}