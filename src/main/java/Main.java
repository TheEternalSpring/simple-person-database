import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner inputDevice = new Scanner(System.in);

        while(true){
            Path tehDatabase = Path.of("Database.txt");
            FileWriter databaseWriter = new FileWriter(tehDatabase.toFile(),true);
            Path numberPath = Path.of("saved_numbering.txt");
            String contentsOfNumberingPath = Files.readString(numberPath);
            int loadTheNumber = Integer.parseInt(contentsOfNumberingPath.trim());

            System.out.println("would you like to:");
            System.out.println("Add Person? (+)");
            System.out.println("Exit? (-)");
            System.out.println("Reset Database?(/)");
            String action = inputDevice.nextLine();

            //something

            if (action.equals("+")){
                System.out.println("Enter person name:");
                String name = inputDevice.nextLine();
                System.out.println("Enter where the person lives:");
                String city = inputDevice.nextLine();
                System.out.println("Enter person work or occupation:");
                String occupation = inputDevice.nextLine();
                System.out.println("Enter person age:");
                int age = Integer.parseInt(inputDevice.nextLine().trim());


                System.out.println("Digesting input, please wait");
                Person thisSpecificPerson =  new Person(name,age,city,occupation);
                System.out.println(thisSpecificPerson);

                databaseWriter.write(loadTheNumber + " - " + thisSpecificPerson.toString() + "\n");
                databaseWriter.close();

                loadTheNumber++;
                Files.writeString(numberPath,String.valueOf(loadTheNumber));


            }

            if (action.equals("-")){
                break;
            }

            if (action.equals("/")){
                Files.writeString(numberPath,String.valueOf(1));
                new FileWriter(tehDatabase.toFile(), false).close();
            }

        }


    }
}
