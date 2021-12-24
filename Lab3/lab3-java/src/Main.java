
import java.util.Scanner;

public class Main {

    public static final String SOL_NOMBRE_1 = "Entrez votre première valeur (integer) : ";
    public static final String SOL_NOMBRE_2 = "Entrez votre deuxième valeur (integer) : ";
    public static final String SOL_CALCUL = "Quel calcul souhaitez-vous effectuer ? (add/sub) : ";
    public static final String SOL_RESULTAT = "Votre résultat est : ";
    public static final String SUB = "sub";
    public static final String ADD = "add";

    public static void main (String[] args) {

        int nbr1;
        int nbr2;
        int resultat = 0;
        Function fonction = new Function();
        String typeCalcul;
        Scanner scan= new Scanner(System.in);
        System.out.print(SOL_NOMBRE_1);
        nbr1 = scan.nextInt();
        System.out.print(SOL_NOMBRE_2);
        nbr2 = scan.nextInt();
        System.out.print(SOL_CALCUL);
        scan.nextLine();
        typeCalcul = scan.nextLine();
        System.out.print(SOL_RESULTAT);
        if (typeCalcul.equals(ADD)) {
            resultat = fonction.addition(nbr1, nbr2);
        } else if (typeCalcul.equals(SUB)) {
            resultat = fonction.soustraction(nbr1, nbr2);
        }
        System.out.print(resultat);

    }
}
