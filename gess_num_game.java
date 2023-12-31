import  java.util.Scanner;
import java.util.Random;

class GessNUm{
    int com;
    int user;
    Random rand = new Random();
    public  GessNUm(){
        com = rand.nextInt(1,100);
    }
    public void setUser(){
        Scanner scan = new Scanner(System.in);
        user = scan.nextInt();
    }
    public  void game(){
        byte count = 0;
        System.out.print("Enter a number form 1 to 99 and exit for 0 : ");
        setUser();
        System.out.println();
        while (true){
            if(user == 0){
                break;
            }
            else if(com>user && user<100){
                System.out.print("please Enter a greater number : ");
                setUser();
                System.out.println();
                count++;
            }
            else if (com <user && user<100) {
                System.out.print("please enter a smaller number : ");
                setUser();
                System.out.println();
                count++;
            }
            else if (user>=100) {
                System.out.print("please enter a proper number : ");
                setUser();
                System.out.println();
                count++;
            } else if (user == com) {
                count++;
                System.out.println("you won in "+count+" gesses");
                break;
            }

        }

    }

}

public class gess_num_game {
    public static void main(String[] args) {
        GessNUm player = new GessNUm();
        player.game();
    }
}
