
import java.util.Scanner;
/**
 *  Title:           ClubProgram
 *  Semester:        COP3337  Summer 2023
 *  @author          Christian Rolando
 *
 *  I affirm that this program is entirely my own work
 *  and none of it is the work of any other person.
 *
 *  This program handles the amount of patrons within a club. It takes input from the User and-
 *  ascertains whether or not the club can accommodate the influx while also keeping track out efflux.
 *  Concept(s) used: Loops, while loops, if-else loops.
 */

public class ClubEntrance {

    public static void main(String[] args) {
        //Initialize number of patrons and a Scanner object to read input from user.
        int patrons = 0;
        Scanner keyboard = new Scanner(System.in);
        //Loop until the maximum capacity of 100 patrons is reached.
        while(patrons != 100) {
            System.out.print("Enter how many people want to enter or leave the club: ");
            int num = keyboard.nextInt();
            //Update the number of patrons and keep track.
            patrons += num;
            //If the number of patrons is less than or equal to 0, everyone left, reset counter.
            if(patrons <= 0) {
                System.out.println("Everyone has left the club.");
                patrons = 0;
                //If the number of patrons is equal to 100, the club is at capacity.
            } else if(patrons == 100) {
                System.out.println("The club is at capacity. Program will end.");
                //If the number of patrons is greater than 100, club is full, rollback counter to last value.
            } else if(patrons > 100) {
                System.out.println("The group is too large to enter the club");
                patrons -= num;
            }
            //Print out current number of patrons.
            System.out.println("Currently there are " + patrons +" people in the club.");
        }
    }
}