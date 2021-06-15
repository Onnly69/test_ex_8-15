import java.util.Scanner;

public class ex15 {
    public static int coeficient(int age) {
        if (age >= 18)
            throw new ArithmeticException("varsta unui adolescent nu poate fi mai mare decat 17") ;
        return age;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter date unui adolescent");
        System.out.print("numele: " );
        String nume = obj.nextLine();
        System.out.print("prenumele: " );
        String prenume = obj.nextLine();

        try{
            System.out.print("varsta: ");
            int age = obj.nextInt();
        }
        catch(ArithmeticException ex){
            System.out.println("Exceptie: un adolescent " +
                    "nu poate avea 18 ani sau mai mult");
        }
        System.out.println("Executie continua ...");


    }
}
