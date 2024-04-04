import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        String[] screen = {"1","2","3","4","5","6","7","8","9"};
        ArrayList<Integer> filled = new ArrayList<Integer>();
        boolean gameIsOn = true;
        System.out.println("Player one X , player two O \nEnter number between 1-9");
        Scanner scanner = new Scanner(System.in);
        int input;
        while (gameIsOn) {
            try {
                System.out.println(" ___ ___ ___\n"+"| "+screen[0]+" | "+screen[1]+" | "+screen[2]+" | "+"\n ___ ___ ___\n"+"| "+screen[3]+" | "+screen[4]+" | "+screen[5]+" | "+"\n ___ ___ ___\n"+"| "+screen[6]+" | "+screen[7]+" | "+screen[8]+" | "+"\n ___ ___ ___");
                System.out.println("Player one enter");
                input = scanner.nextInt();
                change(screen,input,"X",filled);
                if((screen[0]=="X" && screen[1]=="X" && screen[2]=="X")||(screen[3]=="X" && screen[4]=="X" && screen[5]=="X")||(screen[6]=="X" && screen[7]=="X" && screen[8]=="X")||(screen[0]=="X" && screen[3]=="X" && screen[6]=="X")||(screen[1]=="X" && screen[4]=="X" && screen[7]=="X")||(screen[2]=="X" && screen[5]=="X" && screen[8]=="X")||(screen[0]=="X" && screen[4]=="X" && screen[8]=="X")||(screen[2]=="X" && screen[4]=="X" && screen[6]=="X")){            
                    System.out.println("Player one wins!");
                    break;
                }
                else if (filled.size()==9){
                    System.out.println("Draw!");
                    break;
                };
                System.out.println(" ___ ___ ___\n"+"| "+screen[0]+" | "+screen[1]+" | "+screen[2]+" | "+"\n ___ ___ ___\n"+"| "+screen[3]+" | "+screen[4]+" | "+screen[5]+" | "+"\n ___ ___ ___\n"+"| "+screen[6]+" | "+screen[7]+" | "+screen[8]+" | "+"\n ___ ___ ___");
                System.out.println("Player two enter");
                input = scanner.nextInt();
                change(screen,input,"O",filled);
                if((screen[0]=="O" && screen[1]=="O" && screen[2]=="O")||(screen[3]=="O" && screen[4]=="O" && screen[5]=="O")||(screen[6]=="O" && screen[7]=="O" && screen[8]=="O")||(screen[0]=="O" && screen[3]=="O" && screen[6]=="O")||(screen[1]=="O" && screen[4]=="O" && screen[7]=="O")||(screen[2]=="O" && screen[5]=="O" && screen[8]=="O")||(screen[0]=="O" && screen[4]=="O" && screen[8]=="O")||(screen[2]=="O" && screen[4]=="O" && screen[6]=="O")){            
                    System.out.println("Player two wins!");
                    break;
                }
                else if (filled.size()==9){
                    System.out.println("Draw!");
                    break;
                };
            }
            catch(Exception e) {
                System.out.println("Something went wrong");
                break;
            }
            
        }
    }
    static String change(String[] screen,int input,String x,ArrayList<Integer> filled) {
        Scanner scanner = new Scanner(System.in);
        while((input>9||input<1)||contain(input,filled)){
            System.out.println("enter again");
            input = scanner.nextInt();
        }
        filled.add(input);
        return screen[input-1] = x;
    }

    static boolean contain(int input,ArrayList<Integer> arr){
        for (int i:arr){
            if (i==input){
                return true;
            }
        }
        return false;
    }
}