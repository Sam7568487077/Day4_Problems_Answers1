import java.util.Random;
import java.util.Scanner;
public class Snake_And_Ladder {
    public static void main(String[] args) {


            int final_position=100; int initial_position=0;int count=0;
            Scanner sc=new Scanner(System.in);
            System.out.println(" === Welcome to snake and ladder =====");
            System.out.println(" Your current position is" + initial_position );




            Random rm = new Random();
            Random rm2= new Random();


            while(initial_position < final_position)
            {

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
                        if (initial_position <= 100) {
                            initial_position = initial_position;
                            System.out.print("The dice rolled value is : " + dice_roll_value);
                            System.out.println("\n");
                            System.out.print(" Your current position is : " + initial_position);
                            System.out.println("\n");
                        }
                        break;
                    case 1:
                        System.out.println("Ladder Present");
                        System.out.println("\n");


                        if(initial_position < 95)
                        {
                            if( dice_roll_value == 1 ||dice_roll_value == 2 || dice_roll_value == 3 || dice_roll_value == 4 ||dice_roll_value == 5 || dice_roll_value == 6)
                            {
                                System.out.print( "The dice rolled value is : " + dice_roll_value);
                                System.out.println("\n");
                                initial_position = initial_position + dice_roll_value;
                                System.out.println("\n");
                                System.out.print(" Your current position is : " + initial_position );
                                System.out.println("\n");

                            }

                        }
                        if(initial_position == 95)
                        {
                            if(dice_roll_value == 6) {
                                initial_position = initial_position;
                                System.out.println( "The dice rolled value is : " + dice_roll_value);
                                System.out.println("          ");
                                System.out.println(" Your current position is : " + initial_position);;
                                System.out.println("\n");


                            }
                            else if (dice_roll_value == 1 ||dice_roll_value == 2 || dice_roll_value == 3 || dice_roll_value == 4 ||dice_roll_value == 5)
                            {
                                System.out.print( "The dice rolled value is : " + dice_roll_value);
                                System.out.println("\n");
                                initial_position = initial_position + dice_roll_value;
                                System.out.println("\n");
                                System.out.print(" Your current position is : " + initial_position);
                                System.out.println("\n");

                            }

                        }
                        if(initial_position == 96 )
                        {
                            if (dice_roll_value == 5 || dice_roll_value == 6) {
                                initial_position = initial_position;
                                System.out.println( "The dice rolled value is : " + dice_roll_value);
                                System.out.println("          ");
                                System.out.println(" Your current position is : " + initial_position);
                                System.out.println("\n");

                            }
                            else if (dice_roll_value == 1 ||dice_roll_value == 2 || dice_roll_value == 3 || dice_roll_value == 4)
                            {
                                System.out.print( "The dice rolled value is : " + dice_roll_value);
                                System.out.println("\n");
                                initial_position = initial_position + dice_roll_value;
                                System.out.println("\n");
                                System.out.print(" Your current position is : " + initial_position);
                                System.out.println("\n");

                            }
                        }
                        if(initial_position == 97)
                        {
                            if (dice_roll_value == 4 ||dice_roll_value == 5 || dice_roll_value == 6)
                            {
                                initial_position = initial_position;
                                System.out.println( "The dice rolled value is : " + dice_roll_value);
                                System.out.println("          ");
                                System.out.println(" Your current position is : " + initial_position);
                                System.out.println("\n");

                            }
                            else if (dice_roll_value == 1 || dice_roll_value == 1 || dice_roll_value == 3)
                            {
                                System.out.print( "The dice rolled value is : " + dice_roll_value);
                                System.out.println("\n");
                                initial_position = initial_position + dice_roll_value;
                                System.out.println("\n");
                                System.out.print(" Your current position is : " + initial_position);
                                System.out.println("\n");

                            }
                        }
                        if(initial_position == 98)
                        {
                            if (dice_roll_value == 3 || dice_roll_value == 4 || dice_roll_value == 5 || dice_roll_value == 6)
                            {
                                initial_position = initial_position;
                                System.out.println( "The dice rolled value is : " + dice_roll_value);

                                System.out.println("          ");
                                System.out.println(" Your current position is : " + initial_position);
                                System.out.println("\n");


                            } else if ( dice_roll_value == 2 || dice_roll_value == 1)
                            {
                                System.out.print( "The dice rolled value is : " + dice_roll_value);
                                System.out.println("\n");
                                initial_position = initial_position + dice_roll_value;
                                System.out.println("\n");
                                System.out.print(" Your current position is : " + initial_position);
                                System.out.println("\n");

                            }
                        }
                        if(initial_position == 99)
                        {

                            if ( dice_roll_value == 2 || dice_roll_value == 3 || dice_roll_value == 4 ||dice_roll_value == 5 || dice_roll_value == 6)
                            {
                                initial_position = initial_position;
                                System.out.println( "The dice rolled value is : " + dice_roll_value);
                                System.out.println("          ");
                                System.out.println(" Your current position is : " + initial_position);;
                                System.out.println("\n");

                            }
                            else if (  dice_roll_value == 1)
                            {
                                System.out.print( "The dice rolled value is : " + dice_roll_value);
                                System.out.println("\n");
                                initial_position = initial_position + dice_roll_value;
                                System.out.println("\n");
                                System.out.print(" Your current position is : " + initial_position);
                                System.out.println("\n");

                            }

                        }
                        if(initial_position == 100) {
                            if (dice_roll_value == 1 || dice_roll_value == 2 || dice_roll_value == 3 || dice_roll_value == 4 || dice_roll_value == 5 || dice_roll_value == 6) {
                                initial_position = initial_position;
                                System.out.println("The dice rolled value is : " + dice_roll_value);
                                System.out.println("          ");
                                System.out.println(" Your current position is : " + initial_position);
                                System.out.println("\n");

                                System.out.println(" ================ YOU HAVE WON ============");
                                System.out.println("\n");
                                break;

                            }
                        }

                        break;
                    case 2:
                        System.out.println("Snake Present");
                        if(initial_position == 0)
                        {
                            if( dice_roll_value == 1 ||dice_roll_value == 2 || dice_roll_value == 3 || dice_roll_value == 4 ||dice_roll_value == 5 || dice_roll_value == 6)
                            {
                                System.out.println("\n");
                                initial_position = initial_position ;
                                System.out.println("The dice rolled is:" + dice_roll_value);
                                System.out.print("Your current position is :" + initial_position);
                                System.out.println("\n");
                            }
                        }
                        if (initial_position == 1)
                        {
                            if(dice_roll_value == 1)
                            {
                                System.out.println("\n");
                                initial_position = 0 ;
                                System.out.println("The dice rolled is:" + dice_roll_value);
                                System.out.print("Your current position is :" + initial_position);
                                System.out.println("\n");
                            }
                            else if (dice_roll_value == 2 || dice_roll_value == 3 || dice_roll_value == 4 ||dice_roll_value == 5 || dice_roll_value == 6)
                            {
                                initial_position = initial_position ;
                                System.out.println("The dice rolled is:" + dice_roll_value);
                                System.out.print("Your current position is :" + initial_position);
                                System.out.println("\n");
                            }
                        }
                        if (initial_position == 2)
                        {
                            if(dice_roll_value == 1 || dice_roll_value == 2)
                            {
                                System.out.println("\n");
                                initial_position = initial_position - dice_roll_value ;
                                System.out.println("The dice rolled is:" + dice_roll_value);
                                System.out.print("Your current position is :" + initial_position);
                                System.out.println("\n");
                            }
                            else if ( dice_roll_value == 3 || dice_roll_value == 4 ||dice_roll_value == 5 || dice_roll_value == 6)
                            {
                                initial_position = initial_position ;
                                System.out.println("The dice rolled is:" + dice_roll_value);
                                System.out.print("Your current position is :" + initial_position);
                                System.out.println("\n");
                            }
                        }


                        if (initial_position == 3)
                        {
                            if(dice_roll_value == 1 || dice_roll_value == 2 || dice_roll_value == 3)
                            {
                                System.out.println("\n");
                                initial_position = initial_position - dice_roll_value ;
                                System.out.println("The dice rolled is:" + dice_roll_value);
                                System.out.print("Your current position is :" + initial_position);
                                System.out.println("\n");
                            }
                            else if (  dice_roll_value == 4 ||dice_roll_value == 5 || dice_roll_value == 6)
                            {
                                initial_position = initial_position ;
                                System.out.println("The dice rolled is:" + dice_roll_value);
                                System.out.print("Your current position is :" + initial_position);
                                System.out.println("\n");
                            }
                        }


                        if (initial_position == 4)
                        {
                            if(dice_roll_value == 1 || dice_roll_value == 2 || dice_roll_value == 3 || dice_roll_value == 4)
                            {
                                System.out.println("\n");
                                initial_position = initial_position - dice_roll_value ;
                                System.out.println("The dice rolled is:" + dice_roll_value);
                                System.out.print("Your current position is :" + initial_position);
                                System.out.println("\n");
                            }
                            else if (  dice_roll_value == 5 || dice_roll_value == 6)
                            {
                                initial_position = initial_position ;
                                System.out.println("The dice rolled is:" + dice_roll_value);
                                System.out.print("Your current position is :" + initial_position);
                                System.out.println("\n");
                            }
                        }


                        if (initial_position == 5)
                        {
                            if(dice_roll_value == 1 || dice_roll_value == 2 || dice_roll_value == 3 || dice_roll_value == 4 || dice_roll_value == 5)
                            {
                                System.out.println("\n");
                                initial_position = initial_position - dice_roll_value ;
                                System.out.println("The dice rolled is:" + dice_roll_value);
                                System.out.print("Your current position is :" + initial_position);
                                System.out.println("\n");
                            }
                            else if (  dice_roll_value == 6)
                            {
                                initial_position = initial_position ;
                                System.out.println("The dice rolled is:" + dice_roll_value);
                                System.out.print("Your current position is :" + initial_position);
                                System.out.println("\n");
                            }
                        }


                        if (initial_position == 6)
                        {
                            if(dice_roll_value == 1 || dice_roll_value == 2 || dice_roll_value == 3 || dice_roll_value == 4 || dice_roll_value == 5 || dice_roll_value == 6)
                            {
                                System.out.println("\n");
                                initial_position = initial_position - dice_roll_value ;
                                System.out.println("The dice rolled is:" + dice_roll_value);
                                System.out.print("Your current position is :" + initial_position);
                                System.out.println("\n");
                            }

                        }
                        break;

                }

               count=count+1;
            }
        System.out.print("The total number of times the die rolled is:" + count);




    }

    }