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
    //Ajouter Compte Courant
    public void AjouterCompteCourant(ArrayList<CompteCourant> compteCourants,ArrayList<Client> clients) {
        Scanner sc = new Scanner(System.in);
        System.out.println("le numero du compte courant ");
        String numero = sc.nextLine();
        System.out.println("le solde du compte courant ");
        double solde = sc.nextDouble();
        System.out.println("les frais bancaires ");
        double FraisBancaire = sc.nextDouble();
        sc.nextLine();
        CompteCourant compteCourant = new CompteCourant();
        System.out.println("le numero du proprietaire compte courant ");
        int Nproprietaire = sc.nextInt();
        Client client = compteCourant.RechercherClient(Nproprietaire,clients);
        if(client==null) {
            System.out.println("La client n'existe pas");
            return;
        }

        compteCourants.add(new CompteCourant(FraisBancaire,numero,solde,client) );
        System.out.println("Compte courant ajouter avec succes ^-^ ");

    }
     // Affichage du compte courant
    public void AfficherCompteCourant(ArrayList<CompteCourant> compteCourants) {
        if (compteCourants.isEmpty()) {
            System.out.println("Aucun apprenant trouvé.");
        } else {
            for (CompteCourant compteCourant : compteCourants) {
                System.out.println(compteCourant);
            }
        }
    }
}
