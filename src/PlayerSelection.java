
import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args) {
        String Name;
        int age;
        float height;
        float weight;
        int jersey_number;
        Scanner name  = new Scanner(System.in);
        System.out.print("Enter your name: ");
        Name = name.nextLine();

        Scanner Age = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = Age.nextInt();

        Scanner Weight = new Scanner(System.in);
        System.out.print("Enter your weight in lbs: ");
        weight = Weight.nextFloat();

        Scanner Height = new Scanner(System.in);
        System.out.print("Enter your height in meters : ");
        height = Height.nextFloat();

        Scanner Jersey_number = new Scanner(System.in);
        System.out.print("Enter your jersey number: ");
        jersey_number = Jersey_number.nextInt();


        final double pound = 0.45359237;
        final int meter = 100;

        int weight_kg = (int) (weight * pound);
        int height_cm = (int) (height * meter);



        String category;
        if(age<20)
            category = "Rising Star";
        else if (age<=30)
            category = "Prime Player";
        else
            category = "Veteran Player";
        String position;
        switch(jersey_number){
            case 1:
                position = "Goalkeeper";
                break;
            case 2:
            case 5:
                position = "Defender";
                break;
            case 6:
            case 8:
                position = "Midfielder";
                break;
            case 7:
            case 11:
                position = "Winger";
                break;
            case 9:
                position = "Striker";
                break;
            case 10:
                position = "Playmaker";
                break;
            default:
                position = "Unknown";


        }

        String attackerStatus = (jersey_number==7 || jersey_number ==9 || jersey_number ==10 || jersey_number == 11)
                                ? "YES" : "NO";

        boolean eligible = (age >= 18)&& (age <35)&&(weight_kg<90);

        String eligibility = eligible ? "Eligible" : "Not Eligible";

        String lineup = "x";
        if(category == "Prime Player")
            if(weight_kg <80)
                lineup = "Starting Lineup";
                else
                    lineup = "Bench";


        String decision = eligible ? "Play" : "Rest";

        System.out.println("~~~PLAYER REPORT~~~");
        System.out.println("Player Name: " + Name);
        System.out.println("Age:"+ age +"(" + category + ")");
        System.out.println("Height:" + height_cm + "cm");
        System.out.println("Weight:" + weight_kg + "kg");
        System.out.println("Jersey:" + jersey_number);
        System.out.println("Position:" + position);
        System.out.println("Attacker jersey: " + attackerStatus);
        System.out.println("Eligibility: " + eligibility);
        System.out.println("Lineup Decision: " + lineup);
        System.out.println("Final Decision: " + decision);








    }




}


