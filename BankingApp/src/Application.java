
import java.util.ArrayList;
import java.util.Scanner;


public class Application {

    public static void main(String[] args) {
        ArrayList<Client> clients = new ArrayList<>();

       Client client = new Client() {
       };

        Scanner sc = new Scanner(System.in);
        int choix;
        do{

            System.out.println("1-Gestion Clients");
            System.out.println("2-Gestion Comptes");
            System.out.println("4-Quitter");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Entrer votre choix :");
            choix = scanner.nextInt();
            switch(choix) {
                case 1:
                    client.gestionClient(clients);
                    break;
                case 2:
                    break;
                default:
                    System.out.println(" choix invalide");
                    break;
            }
        }while(choix != 4);
    }
}
