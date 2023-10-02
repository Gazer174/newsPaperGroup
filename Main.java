import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Newspaper> allNewspapers = new ArrayList<Newspaper>();
    public static int paperIdTracker = 1;
    public static void main(String[] args) {
        boolean exitProgram = false;
        do {
            System.out.println("Välkommen till tidnings adminsitrationen!");
            System.out.println("0. Avsluta program");
            System.out.println("1. Lägg till tidning");
            System.out.println("2. visa alla tidningar");
            //System.out.println("Visa alla tidningar");
            System.out.println("Ditt val: ");
            int userChoice = input.nextInt();
            input.nextLine();

            switch (userChoice){
                case 0 -> exitProgram = true;
                case 1 -> addPaper();
                case 2 -> showAllPapers();

            }
        } while (!exitProgram);

    }
    public static void addPaper(){

            System.out.print("Vad ska tidningen ha för namn: ");
            String newName = input.nextLine();



        System.out.println("hur många sidor?");
        int pagesInput = input.nextInt();
        System.out.println("vad ska priset vara?: ");
        double price = input.nextDouble();
        String a = dateOut();

        input.nextLine();
            Newspaper n = new Newspaper(newName,a,pagesInput,price);
            allNewspapers.add(n);
            System.out.println("du har lagt till " + n);



    }
    public static String dateOut(){
        Date a = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yy");
        String str = formatter.format(a);
        return str;
    }
    public static void showAllPapers(){
        for (Newspaper n:allNewspapers){
            System.out.println(n);
        }
    }

}