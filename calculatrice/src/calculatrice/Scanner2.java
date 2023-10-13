package calculatrice;

import java.util.ArrayList;
import java.util.Scanner;

public class Scanner2 {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> operateurs = new ArrayList<String>() {{
        add("+");
        add("-");
        add("*");
        add("/");
    }};
    
    public String entrerInstruction() {
        System.out.print("Entrez quelque chose : ");
        return scanner.nextLine();
    }

    public void detecterType(String input) {
        try {
            int intValue = Integer.parseInt(input);
            System.out.println("L'entrée est un entier : " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("L'entrée n'est pas un entier.");
            parcourirOperateurs(input);
        }
    }

    public void parcourirOperateurs(String input) {
        for (String operateur : operateurs) {
            if (input.equals(operateur)) {
                System.out.println("L'entrée est un opérateur : " + operateur);
                return;
            }
        }
        System.out.println("L'entrée n'est ni un entier ni un opérateur.");
    }

    
}