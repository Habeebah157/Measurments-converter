import java.util.Scanner;
public class Friends {
    public static void main(String args[]){

                Scanner in = new Scanner(System.in);
                int flag = 0;

                do{
                    System.out.println("Pick a option:\n press 5 to quit" );
                    System.out.println("1)Convert from kg to Ibs");
                    System.out.println("2)Convert from Ibs to kg");
                    System.out.println("3)Convert from feet to cm");
                    System.out.println("4)Convert from cm to feet");

                    int choiceog = in.nextInt();
                    switch(choiceog){
                        case 1:
                            System.out.print("Put in the weight in kg: ");
                            float choice = in.nextFloat();
                            System.out.println(toPounds(choice) + "ibs");
                            break;
                        case 2:
                            System.out.print("Put in the weight in ibs: ");
                            float choice2 = in.nextFloat();
                            System.out.println(toKg(choice2) + "kg");
                            break;
                        case 3:
                            System.out.print("Put in your height in feet: ");
                            float feet = in.nextFloat();
                            System.out.println("Put in the inches: ");
                            float inches = in.nextFloat();
                            System.out.println(toCm(feet,inches) + "cm");
                            break;
                        case 4:
                            System.out.println("Put in your height in cm");
                            float cm = in.nextFloat();
                            System.out.println(toFeet(cm) + "feet and inches");
                    }
                }while(flag == 0);
        System.out.println("Ended Program");
            }
            public static float toPounds(float kg){
                float pound = kg /0.45359237f;
                return pound;
            }
            public static float toKg(float pound){
                float kg = pound * (float)0.45359237f;
                return kg;
            }
           public static float toCm(float feet, float inches){

             float tocm = (feet * 30.48f) + (inches * 2.54f);
            return tocm;
             //to be continued
           }
           public static float toFeet(float cm){
                float toFeet = (cm/30.48f);
                return toFeet;
           }
        }


