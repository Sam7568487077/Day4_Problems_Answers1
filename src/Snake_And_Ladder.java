import java.util.Random;
public class Snake_And_Ladder {
    public static void main(String[] args) {

            int final_position=100; int initial_position=0;int count=0;
            System.out.println(" === Welcome to snake and ladder =====");
        System.out.println(" Your current position is " + initial_position );

        Random rm = new Random();
        int dice_roll_value = rm.nextInt(1, 6);
        System.out.print(" The dice value is : " +dice_roll_value);
        System.out.println("\n");
        System.out.print("You are on :" + initial_position);
        System.out.println("\n");





    }
}
