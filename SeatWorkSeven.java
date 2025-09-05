

public class SeatWorkSeven {
  public static void main(String args[]){
       char grade = 'C';

    switch(grade){
        case 'A':
        System.out.println("Excellent!");
        break;
        case 'B':
        System.out.println("Very Good!");
        break;
        case 'C':
        System.out.println("Nice!");
        break;
        case 'D':
        System.out.println("You passed!");
        break;
        case 'F':
        System.out.println("Better try again.");
        break; 
        default:
        System.out.println("Invalid Grade");
    }
   System.out.println("Your grade is " + grade);
    } 
}