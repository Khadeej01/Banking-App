
import java.util.ArrayList;
import java.util.Scanner;


public class Application {

    public static void main(String[] args) {
        ArrayList<Client> clients = new ArrayList<>();
        ArrayList<CompteCourant> compteCourants = new ArrayList<>();
        ArrayList<CompteEpargne> compteEpargnes = new ArrayList<>();

       Client client = new Client() {
       };

        int choix;
        do{
            System.out.println("1-Gestion Clients");
            System.out.println("2-Gestion Comptes");
            System.out.println("3-Gestion Operations");
            System.out.println("4-Quitter");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Entrer votre choix :");
            choix = scanner.nextInt();
            switch(choix) {
                case 1:
                    client.GestionClient(clients);
                    break;
                case 2:

                 Compte.GestionCompte(compteCourants,compteEpargnes,clients);
                    break;
                    case 3:
                        Operation.GestionOperation();
                default:
                    System.out.println(" choix invalide");
                    break;
            }
        }while(choix != 4);
    }
}
