import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Newspaper> allNewspapers = new ArrayList<Newspaper>();
    public static void main(String[] args) {
        System.out.println("Välkommen till tidnings adminsitrationen!");
        System.out.println("1. Lägg till tidning");
        System.out.println("2 - Visa alla tidningar");
        System.out.println("3 - Ändra tidning");
        System.out.println("");
        int userChoice = input.nextInt();
        input.nextLine();

        switch (userChoice){
            case 1 -> addPaper();
        }

    }
    public static void addPaper(){
        int userChoice = 0;
        do {
            System.out.print("Vad ska tidningen ha för namn: ");
            String newName = input.nextLine();
            Newspaper n = new Newspaper(newName);
            allNewspapers.add(n);


        } while (userChoice!=0);

    }

    public static void removePaper(){

        System.out.println("ange ID på den tidning du vill ta bort");

        int foundId = input.nextInt();
        input.nextLine()//consumes rest of line.

        for (int i = 0; i < allNewspapers.size();i++){
            if (allNewspapers.get(i).getPaperId()==foundId){
                allNewspapers.remove(i);
                break;
            }
        }


    }



}