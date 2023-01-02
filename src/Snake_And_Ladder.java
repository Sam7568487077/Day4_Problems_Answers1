import java.util.Random;
public class Snake_And_Ladder {
    public static void main(String[] args) {

            int final_position=100; int initial_position=0;int count=0;
            System.out.println(" === Welcome to snake and ladder =====");
        System.out.println(" Your current position is " + initial_position );

        Random rm = new Random();
        Random rm2= new Random();

        int dice_roll_value = rm.nextInt(1, 6);
        System.out.print(" The dice value is : " +dice_roll_value);
        System.out.println("\n");
        System.out.print("You are on :" + initial_position);
        System.out.println("\n");

        int board_items = rm2.nextInt(0, 3);
        switch (board_items) {
            case 0:
                System.out.println("No Play");
                System.out.println("\n");
                initial_position = initial_position;
                System.out.print("The dice rolled value is : " + dice_roll_value);
                System.out.println("\n");
                System.out.print(" Your current position is : " + initial_position);
                System.out.println("\n");
                break;
            case 1:
                System.out.println("Snake Present");
                System.out.println("\n");
                initial_position = initial_position-dice_roll_value;
                System.out.print("The dice rolled value is : " + dice_roll_value);
                System.out.println("\n");
                System.out.print(" Your current position is : " + initial_position);
                System.out.println("\n");
                break;
            case 3:
                System.out.println("Ladder Present");
                System.out.println("\n");
                initial_position = initial_position+dice_roll_value;
                System.out.print("The dice rolled value is : " + dice_roll_value);
                System.out.println("\n");
                System.out.print(" Your current position is : " + initial_position);
                System.out.println("\n");
                break;



        }





    }
}
