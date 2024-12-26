import java.util.ArrayList;
import java.util.Scanner;

public class CompteCourant extends Compte {
    private double FraisBancaire;

    ArrayList<CompteCourant> compteCourants = new ArrayList<CompteCourant>();
    Scanner sc = new Scanner(System.in);

    public CompteCourant(double FraisBancaire, String numero, double solde, Client client) {
        super(numero, solde, client);
        this.FraisBancaire = FraisBancaire;


    }
    public CompteCourant() {

    }

    public double getFraisBancaire() {
        return FraisBancaire;
    }

    public void setFraisBancaire(double FraisBancaire) {
        this.FraisBancaire = FraisBancaire;
    }

    // Gestion du compte Courant
    public void GestionCompteCourant(ArrayList<CompteCourant> compteCourants,ArrayList<Client> clients) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ajouter un compte courant ");
        System.out.println("Afficher un compte courant ");
        System.out.println("Tapez votre choix");
        int choix = sc.nextInt();
        switch (choix) {
            case 1:
                AjouterCompteCourant(compteCourants,clients);
                break;
            case 2:
                AfficherCompteCourant(compteCourants);
                break;
            default:
                System.out.println("Choix invalide");
                break;
        }
    }
}
