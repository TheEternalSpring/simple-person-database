import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static int numbering = 1;

    public static void main(String[] args) throws IOException {

        Scanner inputDevice = new Scanner(System.in);

        while(true){
            FileWriter databaseWriter = new FileWriter("Database.txt",true);
            System.out.println("would you like to add(+) person or exit?(-)");
            String action = inputDevice.nextLine();
            if (action.equals("+")){
                System.out.println("Enter person name:");
                String name = inputDevice.nextLine();
                System.out.println("Enter where the person lives:");
                String city = inputDevice.nextLine();
                System.out.println("Enter person work or occupation:");
                String occupation = inputDevice.nextLine();
                System.out.println("Enter person age:");
                int age = inputDevice.nextInt();


                System.out.println("Digesting input, please wait \n");
                Person thisSpecificPerson =  new Person(name,age,city,occupation);
                System.out.println(thisSpecificPerson);
                databaseWriter.write(numbering + " - " + thisSpecificPerson.toString());
                databaseWriter.write("\n");
                databaseWriter.close();
                numbering++;
            }
            if (action.equals("-")){
                break;
            }
            else{
                System.out.println("unidentified command, please try again");
            }

        }


    }
}
