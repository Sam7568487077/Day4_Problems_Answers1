import java.util.Random;
import java.util.Scanner;

public class Snake_And_Ladder {
    public static void main(String[] args) {

        // for user 1
        int final_position = 100;
        int initial_position = 0;
        // for user 2
        int final_position2 = 100;
        int initial_position2 = 0;
        int count = 0;
        int count2=0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" === Welcome to snake and ladder =====");


        System.out.println(" Your current position of User 1 is" + initial_position);
        System.out.println(" Your current position of User 2 is" + initial_position2);

//for user 1
        Random rm = new Random();
        Random rm2 = new Random();

        // for user 2
        Random rm3 = new Random();
        Random rm4 = new Random();



        while (initial_position < final_position) {

            int dice_roll_value = rm.nextInt(1, 6);
            System.out.print(" The dice value is : " + dice_roll_value);
            System.out.println("\n");
            System.out.println("Position of User 1 :" + initial_position);
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
                        System.out.print(" ---- Position of User 1 ---- : " + initial_position);
                        System.out.println("\n");
                    }
                    break;
                case 1:
                    System.out.println("Ladder Present");
                    System.out.println("\n");


                    if (initial_position < 95) {
                        if (dice_roll_value == 1 || dice_roll_value == 2 || dice_roll_value == 3 || dice_roll_value == 4 || dice_roll_value == 5 || dice_roll_value == 6) {
                            System.out.print("The dice rolled value is : " + dice_roll_value);
                            System.out.println("\n");
                            initial_position = initial_position + dice_roll_value;
                            System.out.println("\n");
                            System.out.print(" #### Position of User 1 #### : " + initial_position);
                            System.out.println("\n");

                        }

                    }
                    if (initial_position == 95) {
                        if (dice_roll_value == 6) {
                            initial_position = initial_position;
                            System.out.println("The dice rolled value is : " + dice_roll_value);
                            System.out.println("          ");
                            System.out.println(" #### Position of User 1 #### : " + initial_position);
                            ;
                            System.out.println("\n");


                        } else if (dice_roll_value == 1 || dice_roll_value == 2 || dice_roll_value == 3 || dice_roll_value == 4 || dice_roll_value == 5) {
                            System.out.print("The dice rolled value is : " + dice_roll_value);
                            System.out.println("\n");
                            initial_position = initial_position + dice_roll_value;
                            System.out.println("\n");
                            System.out.print(" #### Position of User 1 #### : " + initial_position);
                            System.out.println("\n");

                        }

                    }
                    if (initial_position == 96) {
                        if (dice_roll_value == 5 || dice_roll_value == 6) {
                            initial_position = initial_position;
                            System.out.println("The dice rolled value is : " + dice_roll_value);
                            System.out.println("          ");
                            System.out.println(" #### Position of User 1 #### : " + initial_position);
                            System.out.println("\n");

                        } else if (dice_roll_value == 1 || dice_roll_value == 2 || dice_roll_value == 3 || dice_roll_value == 4) {
                            System.out.print("The dice rolled value is : " + dice_roll_value);
                            System.out.println("\n");
                            initial_position = initial_position + dice_roll_value;
                            System.out.println("\n");
                            System.out.print(" #### Position of User 1 #### : " + initial_position);
                            System.out.println("\n");

                        }
                    }
                    if (initial_position == 97) {
                        if (dice_roll_value == 4 || dice_roll_value == 5 || dice_roll_value == 6) {
                            initial_position = initial_position;
                            System.out.println("The dice rolled value is : " + dice_roll_value);
                            System.out.println("          ");
                            System.out.println(" #### Position of User 1 #### : " + initial_position);
                            System.out.println("\n");

                        } else if (dice_roll_value == 1 || dice_roll_value == 1 || dice_roll_value == 3) {
                            System.out.print("The dice rolled value is : " + dice_roll_value);
                            System.out.println("\n");
                            initial_position = initial_position + dice_roll_value;
                            System.out.println("\n");
                            System.out.print(" #### Position of User 1 #### : " + initial_position);
                            System.out.println("\n");

                        }
                    }
                    if (initial_position == 98) {
                        if (dice_roll_value == 3 || dice_roll_value == 4 || dice_roll_value == 5 || dice_roll_value == 6) {
                            initial_position = initial_position;
                            System.out.println("The dice rolled value is : " + dice_roll_value);

                            System.out.println("          ");
                            System.out.println(" #### Position of User 1 #### : " + initial_position);
                            System.out.println("\n");


                        } else if (dice_roll_value == 2 || dice_roll_value == 1) {
                            System.out.print("The dice rolled value is : " + dice_roll_value);
                            System.out.println("\n");
                            initial_position = initial_position + dice_roll_value;
                            System.out.println("\n");
                            System.out.print(" #### Position of User 1 #### : " + initial_position);
                            System.out.println("\n");

                        }
                    }
                    if (initial_position == 99) {

                        if (dice_roll_value == 2 || dice_roll_value == 3 || dice_roll_value == 4 || dice_roll_value == 5 || dice_roll_value == 6) {
                            initial_position = initial_position;
                            System.out.println("The dice rolled value is : " + dice_roll_value);
                            System.out.println("          ");
                            System.out.println(" #### Position of User 1 #### : " + initial_position);
                            ;
                            System.out.println("\n");

                        } else if (dice_roll_value == 1) {
                            System.out.print("The dice rolled value is : " + dice_roll_value);
                            System.out.println("\n");
                            initial_position = initial_position + dice_roll_value;
                            System.out.println("\n");
                            System.out.print(" #### Position of User 1 #### : " + initial_position);
                            System.out.println("\n");

                        }

                    }
                    if (initial_position == 100) {
                        if (dice_roll_value == 1 || dice_roll_value == 2 || dice_roll_value == 3 || dice_roll_value == 4 || dice_roll_value == 5 || dice_roll_value == 6) {
                            initial_position = initial_position;
                            System.out.println("The dice rolled value is : " + dice_roll_value);
                            System.out.println("          ");
                            System.out.println(" #### Position of User 1 #### : " + initial_position);
                            System.out.println("\n");
                            System.out.println("\n");
                            break;

                        }
                    }

                    break;
                case 2:
                    System.out.println("Snake Present");
                    if (initial_position == 0) {
                        if (dice_roll_value == 1 || dice_roll_value == 2 || dice_roll_value == 3 || dice_roll_value == 4 || dice_roll_value == 5 || dice_roll_value == 6) {
                            System.out.println("\n");
                            initial_position = initial_position;
                            System.out.println("The dice rolled is:" + dice_roll_value);
                            System.out.print("~~~~ Position of User 1 ~~~~ :" + initial_position);
                            System.out.println("\n");
                        }
                    }
                    if (initial_position == 1) {
                        if (dice_roll_value == 1) {
                            System.out.println("\n");
                            initial_position = 0;
                            System.out.println("The dice rolled is:" + dice_roll_value);
                            System.out.print("~~~~ Position of User 1 ~~~~ :" + initial_position);
                            System.out.println("\n");
                        } else if (dice_roll_value == 2 || dice_roll_value == 3 || dice_roll_value == 4 || dice_roll_value == 5 || dice_roll_value == 6) {
                            initial_position = initial_position;
                            System.out.println("The dice rolled is:" + dice_roll_value);
                            System.out.print("~~~~ Position of User 1 ~~~~ :" + initial_position);
                            System.out.println("\n");
                        }
                    }
                    if (initial_position == 2) {
                        if (dice_roll_value == 1 || dice_roll_value == 2) {
                            System.out.println("\n");
                            initial_position = initial_position - dice_roll_value;
                            System.out.println("The dice rolled is:" + dice_roll_value);
                            System.out.print("~~~~ Position of User 1 ~~~~ :" + initial_position);
                            System.out.println("\n");
                        } else if (dice_roll_value == 3 || dice_roll_value == 4 || dice_roll_value == 5 || dice_roll_value == 6) {
                            initial_position = initial_position;
                            System.out.println("The dice rolled is:" + dice_roll_value);
                            System.out.print("~~~~ Position of User 1 ~~~~ :" + initial_position);
                            System.out.println("\n");
                        }
                    }


                    if (initial_position == 3) {
                        if (dice_roll_value == 1 || dice_roll_value == 2 || dice_roll_value == 3) {
                            System.out.println("\n");
                            initial_position = initial_position - dice_roll_value;
                            System.out.println("The dice rolled is:" + dice_roll_value);
                            System.out.print("~~~~ Position of User 1 ~~~~ :" + initial_position);
                            System.out.println("\n");
                        } else if (dice_roll_value == 4 || dice_roll_value == 5 || dice_roll_value == 6) {
                            initial_position = initial_position;
                            System.out.println("The dice rolled is:" + dice_roll_value);
                            System.out.print("~~~~ Position of User 1 ~~~~ :" + initial_position);
                            System.out.println("\n");
                        }
                    }


                    if (initial_position == 4) {
                        if (dice_roll_value == 1 || dice_roll_value == 2 || dice_roll_value == 3 || dice_roll_value == 4) {
                            System.out.println("\n");
                            initial_position = initial_position - dice_roll_value;
                            System.out.println("The dice rolled is:" + dice_roll_value);
                            System.out.print("~~~~ Position of User 1 ~~~~ :" + initial_position);
                            System.out.println("\n");
                        } else if (dice_roll_value == 5 || dice_roll_value == 6) {
                            initial_position = initial_position;
                            System.out.println("The dice rolled is:" + dice_roll_value);
                            System.out.print("~~~~ Position of User 1 ~~~~ :" + initial_position);
                            System.out.println("\n");
                        }
                    }


                    if (initial_position == 5) {
                        if (dice_roll_value == 1 || dice_roll_value == 2 || dice_roll_value == 3 || dice_roll_value == 4 || dice_roll_value == 5) {
                            System.out.println("\n");
                            initial_position = initial_position - dice_roll_value;
                            System.out.println("The dice rolled is:" + dice_roll_value);
                            System.out.print("~~~~ Position of User 1 ~~~~ :" + initial_position);
                            System.out.println("\n");
                        } else if (dice_roll_value == 6) {
                            initial_position = initial_position;
                            System.out.println("The dice rolled is:" + dice_roll_value);
                            System.out.print("~~~~ Position of User 1 ~~~~ :" + initial_position);
                            System.out.println("\n");
                        }
                    }


                    if (initial_position == 6) {
                        if (dice_roll_value == 1 || dice_roll_value == 2 || dice_roll_value == 3 || dice_roll_value == 4 || dice_roll_value == 5 || dice_roll_value == 6) {
                            System.out.println("\n");
                            initial_position = initial_position - dice_roll_value;
                            System.out.println("The dice rolled is:" + dice_roll_value);
                            System.out.print("~~~~ Position of User 1 ~~~~ :" + initial_position);
                            System.out.println("\n");
                        }

                    }
                    break;

            }

            count = count + 1;
        }




        // loop for second user

        while (initial_position2 < final_position2) {

            int dice_roll_value2 = rm3.nextInt(1, 6);
            System.out.print(" The dice value is : " + dice_roll_value2);
            System.out.println("\n");
            System.out.print("User 2 is on :" + initial_position2);
            System.out.println("\n");

            int board_items2 = rm4.nextInt(0, 3);
            switch (board_items2) {
                case 0:
                    System.out.println("No Play");
                    System.out.println("\n");
                    if (initial_position2 <= 100) {
                        initial_position2 = initial_position2;
                        System.out.print("The dice rolled value is : " + dice_roll_value2);
                        System.out.println("\n");
                        System.out.print(" Position of User 2 is : " + initial_position2);
                        System.out.println("\n");
                    }
                    break;
                case 1:
                    System.out.println("Ladder Present");
                    System.out.println("\n");


                    if (initial_position2 < 95) {
                        if (dice_roll_value2 == 1 || dice_roll_value2 == 2 || dice_roll_value2 == 3 || dice_roll_value2 == 4 || dice_roll_value2 == 5 || dice_roll_value2 == 6) {
                            System.out.print("The dice rolled value is : " + dice_roll_value2);
                            System.out.println("\n");
                            initial_position2 = initial_position2 + dice_roll_value2;
                            System.out.println("\n");
                            System.out.print(" Position of User 2 is : " + initial_position2);
                            System.out.println("\n");

                        }

                    }
                    if (initial_position2 == 95) {
                        if (dice_roll_value2 == 6) {
                            initial_position2 = initial_position2;
                            System.out.println("The dice rolled value is : " + dice_roll_value2);
                            System.out.println("          ");
                            System.out.println(" Position of User 2 is : " + initial_position2);
                            ;
                            System.out.println("\n");


                        } else if (dice_roll_value2 == 1 || dice_roll_value2 == 2 || dice_roll_value2 == 3 || dice_roll_value2 == 4 || dice_roll_value2 == 5) {
                            System.out.print("The dice rolled value is : " + dice_roll_value2);
                            System.out.println("\n");
                            initial_position2 = initial_position2 + dice_roll_value2;
                            System.out.println("\n");
                            System.out.print(" Position of User 2 is : " + initial_position2);
                            System.out.println("\n");

                        }

                    }
                    if (initial_position2 == 96) {
                        if (dice_roll_value2 == 5 || dice_roll_value2 == 6) {
                            initial_position2 = initial_position2;
                            System.out.println("The dice rolled value is : " + dice_roll_value2);
                            System.out.println("          ");
                            System.out.println(" Position of User 2 is : " + initial_position2);
                            System.out.println("\n");

                        } else if (dice_roll_value2 == 1 || dice_roll_value2 == 2 || dice_roll_value2 == 3 || dice_roll_value2 == 4) {
                            System.out.print("The dice rolled value is : " + dice_roll_value2);
                            System.out.println("\n");
                            initial_position = initial_position2 + dice_roll_value2;
                            System.out.println("\n");
                            System.out.print(" Position of User 2 is : " + initial_position2);
                            System.out.println("\n");

                        }
                    }
                    if (initial_position2 == 97) {
                        if (dice_roll_value2 == 4 || dice_roll_value2 == 5 || dice_roll_value2 == 6) {
                            initial_position2 = initial_position2;
                            System.out.println("The dice rolled value is : " + dice_roll_value2);
                            System.out.println("          ");
                            System.out.println(" Position of User 2 is : " + initial_position2);
                            System.out.println("\n");

                        } else if (dice_roll_value2 == 1 || dice_roll_value2 == 1 || dice_roll_value2 == 3) {
                            System.out.print("The dice rolled value is : " + dice_roll_value2);
                            System.out.println("\n");
                            initial_position2 = initial_position2 + dice_roll_value2;
                            System.out.println("\n");
                            System.out.print(" Position of User 2 is : " + initial_position2);
                            System.out.println("\n");

                        }
                    }
                    if (initial_position2 == 98) {
                        if (dice_roll_value2 == 3 || dice_roll_value2 == 4 || dice_roll_value2 == 5 || dice_roll_value2 == 6) {
                            initial_position2 = initial_position2;
                            System.out.println("The dice rolled value is : " + dice_roll_value2);

                            System.out.println("          ");
                            System.out.println(" Position of User 2 is : " + initial_position2);
                            System.out.println("\n");


                        } else if (dice_roll_value2 == 2 || dice_roll_value2 == 1) {
                            System.out.print("The dice rolled value is : " + dice_roll_value2);
                            System.out.println("\n");
                            initial_position2 = initial_position2 + dice_roll_value2;
                            System.out.println("\n");
                            System.out.print(" Position of User 2 is : " + initial_position2);
                            System.out.println("\n");

                        }
                    }
                    if (initial_position2 == 99) {

                        if (dice_roll_value2 == 2 || dice_roll_value2 == 3 || dice_roll_value2 == 4 || dice_roll_value2 == 5 || dice_roll_value2 == 6) {
                            initial_position2 = initial_position2;
                            System.out.println("The dice rolled value is : " + dice_roll_value2);
                            System.out.println("          ");
                            System.out.println(" YPosition of User 2 is : " + initial_position2);
                            System.out.println("\n");

                        } else if (dice_roll_value2 == 1) {
                            System.out.print("The dice rolled value is : " + dice_roll_value2);
                            System.out.println("\n");
                            initial_position2 = initial_position2 + dice_roll_value2;
                            System.out.println("\n");
                            System.out.print(" Position of User 2 is : " + initial_position2);
                            System.out.println("\n");

                        }

                    }
                    if (initial_position2 == 100) {
                        if (dice_roll_value2 == 1 || dice_roll_value2 == 2 || dice_roll_value2 == 3 || dice_roll_value2 == 4 || dice_roll_value2 == 5 || dice_roll_value2 == 6) {
                            initial_position2 = initial_position2;
                            System.out.println("The dice rolled value is : " + dice_roll_value2);
                            System.out.println("          ");
                            System.out.println(" Position of User 2 is : " + initial_position2);
                            System.out.println("\n");
                            System.out.println("\n");
                            break;
                        }
                    }

                    break;
                case 2:
                    System.out.println("Snake Present");
                    if (initial_position2 == 0) {
                        if (dice_roll_value2 == 1 || dice_roll_value2 == 2 || dice_roll_value2 == 3 || dice_roll_value2 == 4 || dice_roll_value2 == 5 || dice_roll_value2 == 6) {
                            System.out.println("\n");
                            initial_position2 = initial_position2;
                            System.out.println("The dice rolled is:" + dice_roll_value2);
                            System.out.print(" ~~ Position of User 2 is ~~ :" + initial_position2);
                            System.out.println("\n");
                        }
                    }
                    if (initial_position2 == 1) {
                        if (dice_roll_value2 == 1) {
                            System.out.println("\n");
                            initial_position2 = 0;
                            System.out.println("The dice rolled is:" + dice_roll_value2);
                            System.out.print("~~ Position of User 2 is ~~ :" + initial_position2);
                            System.out.println("\n");
                        } else if (dice_roll_value2 == 2 || dice_roll_value2 == 3 || dice_roll_value2 == 4 || dice_roll_value2 == 5 || dice_roll_value2 == 6) {
                            initial_position2 = initial_position2;
                            System.out.println("The dice rolled is:" + dice_roll_value2);
                            System.out.print("~~ Position of User 2 is ~~ :" + initial_position2);
                            System.out.println("\n");
                        }
                    }
                    if (initial_position2 == 2) {
                        if (dice_roll_value2 == 1 || dice_roll_value2 == 2) {
                            System.out.println("\n");
                            initial_position2 = initial_position2 - dice_roll_value2;
                            System.out.println("The dice rolled is:" + dice_roll_value2);
                            System.out.print("~~ Position of User 2 is ~~ :" + initial_position2);
                            System.out.println("\n");
                        } else if (dice_roll_value2 == 3 || dice_roll_value2 == 4 || dice_roll_value2 == 5 || dice_roll_value2 == 6) {
                            initial_position2 = initial_position2;
                            System.out.println("The dice rolled is:" + dice_roll_value2);
                            System.out.print("Y~~ Position of User 2 is ~~ :" + initial_position2);
                            System.out.println("\n");
                        }
                    }


                    if (initial_position2 == 3) {
                        if (dice_roll_value2 == 1 || dice_roll_value2 == 2 || dice_roll_value2 == 3) {
                            System.out.println("\n");
                            initial_position2 = initial_position2 - dice_roll_value2;
                            System.out.println("The dice rolled is:" + dice_roll_value2);
                            System.out.print("~~ Position of User 2 is ~~ :" + initial_position2);
                            System.out.println("\n");
                        } else if (dice_roll_value2 == 4 || dice_roll_value2 == 5 || dice_roll_value2 == 6) {
                            initial_position2 = initial_position2;
                            System.out.println("The dice rolled is:" + dice_roll_value2);
                            System.out.print("~~ Position of User 2 is ~~ :" + initial_position2);
                            System.out.println("\n");
                        }
                    }


                    if (initial_position2 == 4) {
                        if (dice_roll_value2 == 1 || dice_roll_value2 == 2 || dice_roll_value2 == 3 || dice_roll_value2 == 4) {
                            System.out.println("\n");
                            initial_position2 = initial_position2 - dice_roll_value2;
                            System.out.println("The dice rolled is:" + dice_roll_value2);
                            System.out.print("~~ Position of User 2 is ~~ :" + initial_position2);
                            System.out.println("\n");
                        } else if (dice_roll_value2 == 5 || dice_roll_value2 == 6) {
                            initial_position2 = initial_position2;
                            System.out.println("The dice rolled is:" + dice_roll_value2);
                            System.out.print("~~ Position of User 2 is ~~ :" + initial_position2);
                            System.out.println("\n");
                        }
                    }


                    if (initial_position2 == 5) {
                        if (dice_roll_value2 == 1 || dice_roll_value2 == 2 || dice_roll_value2 == 3 || dice_roll_value2 == 4 || dice_roll_value2 == 5) {
                            System.out.println("\n");
                            initial_position2 = initial_position2 - dice_roll_value2;
                            System.out.println("The dice rolled is:" + dice_roll_value2);
                            System.out.print("~~ Position of User 2 is ~~ :" + initial_position2);
                            System.out.println("\n");
                        } else if (dice_roll_value2 == 6) {
                            initial_position2 = initial_position2;
                            System.out.println("The dice rolled is:" + dice_roll_value2);
                            System.out.print("Y~~ Position of User 2 is ~~ :" + initial_position2);
                            System.out.println("\n");
                        }
                    }


                    if (initial_position2 == 6) {
                        if (dice_roll_value2 == 1 || dice_roll_value2 == 2 || dice_roll_value2 == 3 || dice_roll_value2 == 4 || dice_roll_value2 == 5 || dice_roll_value2 == 6) {
                            System.out.println("\n");
                            initial_position2 = initial_position2 - dice_roll_value2;
                            System.out.println("The dice rolled is:" + dice_roll_value2);
                            System.out.print("~~ Position of User 2 is ~~ :" + initial_position2);
                            System.out.println("\n");
                        }

                    }
                    break;

            }

            count2 = count2 + 1;
        }

        System.out.print("User 1 reached home in:" + count + " steps");
        System.out.println("\n");
        System.out.print("User 2 reached home in:" + count2 + "  steps");
        if(count < count2)
        {
            System.out.println("\n");
            System.out.println("User 1 is the winner");
        }
        else
        {
            System.out.println("\n");
            System.out.println("User 2 is the winner");
        }

    }

}