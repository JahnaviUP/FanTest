import java.util.*;
public class FanTest{
     public static void main(String []args){
        Fan fan = new Fan();
        while(true){
            Scanner sc= new Scanner(System.in);
            System.out.println("Please enter command: 1 - Increase Fan Speed, 2 - Change Fan Direction");
            int input = sc.nextInt();
            switch(input) {
                case 1:
                    fan.increaseSpeed();
                    fan.printCurrentState();
                    break;
                case 2:
                    fan.changeDirection();
                    fan.printCurrentState();
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
     }
}

class Fan{
    private int speed;                  // Encapsulation of variables
    private String direction;
    
    public Fan(){
        speed = 0;                      // Constructor to initialise default values
        direction = "clockwise";
    }
    
    public void increaseSpeed(){
        speed = (speed + 1)%4;          // As max speed is 3 and we need to  circle back to 0
    }
    
    public void changeDirection(){
        if(direction == "clockwise"){
            direction = "anti-clockwise";
        }
        else{
            direction = "clockwise";
        }
    }

    public int getSpeed(){          // Getter method to access the private variable speed
        return speed;
    }

    public String getDirection(){   // Getter method to access the private variable direction
        return direction;
    }

    public void printCurrentState(){
        System.out.println("Current Speed: "+getSpeed()+", Current Direction: "+getDirection()+"\n");
    }
}