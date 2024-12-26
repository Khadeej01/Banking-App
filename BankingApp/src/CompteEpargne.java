import java.util.ArrayList;
import java.util.Scanner;

public class CompteEpargne extends Compte {
    private double tauxInteret;


    public CompteEpargne(double tauxInteret, String numero, double solde, Client client) {
        super(numero, solde, client);
        this.tauxInteret = tauxInteret;


    }
    public CompteEpargne() {
        
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    //Gestion du compte epargne
    
    public  void GestionCompteEpargne(ArrayList<CompteEpargne> compteEpargnes,ArrayList<Client> clients ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ajouter un compte Epargnes ");
        System.out.println("Afficher un compte Epargnes ");
        System.out.println("Tapez votre choix");
        int choix = sc.nextInt();
        switch (choix) {
            case 1:
                AjouterCompteEpargne(compteEpargnes,clients);
                break;
            case 2:
                AfficherCompteEpargne(compteEpargnes, clients);
                break;
            default:
                System.out.println("Choix invalide");
                break;
        }
    }

    // Ajouter un compte epargne
    public void AjouterCompteEpargne(ArrayList<CompteEpargne> compteEpargnes ,ArrayList<Client> clients) {
        Scanner sc = new Scanner(System.in);
        System.out.println("le numero du compte courant ");
        String numero = sc.nextLine();
        System.out.println("le solde du compte courant ");
        double solde = sc.nextDouble();
        System.out.println("les tauxInteret ");
        double tauxInteret = sc.nextDouble();
        CompteEpargne compteEpargne = new CompteEpargne();
        System.out.println("le numero du proprietaire compte courant ");
        int Nproprietaire = sc.nextInt();
        Client client = compteEpargne.RechercherClient(Nproprietaire,clients);
        if(client==null) {
            System.out.println("La client n'existe pas");
            return;
        }
        compteEpargnes.add(new CompteEpargne(tauxInteret,numero,solde,client) );
        System.out.println("le compteEpargne ajouter avec succes ^-^ ");
    }

// Affichage du compte Epargne

        private void AfficherCompteEpargne(ArrayList<CompteEpargne> compteEpargnes, ArrayList<Client> clients) {
            if (compteEpargnes.isEmpty()) {
                System.out.println("Aucun apprenant trouvé.");
            } else {
                for (CompteEpargne compteEpargne : compteEpargnes) {
                    System.out.println(compteEpargne);
                }
            }
        }
}
