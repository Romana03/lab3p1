import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Citim primul șir de la tastatură
        System.out.print("Introduceti elementele primului sir (separate prin spatiu): ");
        String inputA = in.nextLine();
        String[] a = inputA.split(" ");

        // Citim al doilea șir de la tastatură
        System.out.print("Introduceti elementele celui de-al doilea sir (separate prin spatiu): ");
        String inputB = in.nextLine();
        String[] b = inputB.split(" ");

        HashSet<String> setA = new HashSet<>();
        HashSet<String> setB = new HashSet<>();

        // Adăugăm elementele din prima listă în setA
        for (String element : a) {
            setA.add(element);
        }

        // Adăugăm elementele din a doua listă în setB
        for (String element : b) {
            setB.add(element);
        }

        // Găsim elementele comune
        setA.retainAll(setB);

        // Afișăm rezultatele
        if (setA.isEmpty()) {
            System.out.println("Nu exista elemente comune intre cele doua siruri.");
        } else {
            System.out.println("Elementele comune sunt:");
            for (String element : setA) {
                System.out.println(element);
            }
        }
    }
}