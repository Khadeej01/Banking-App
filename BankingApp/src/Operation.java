import java.util.ArrayList;
import java.util.Scanner;

public class Operation {
    private String type;
    private double montant;
    private String date;
    private CompteCourant compteCourant;
    private CompteEpargne compteEpargne;

    Scanner sc = new Scanner(System.in);
    public ArrayList<Operation> oprations = new ArrayList<>();



    public Operation(String type, double montant, String date, CompteCourant compteCourant, CompteEpargne compteEpargne) {
        this.type = type;
        this.montant = montant;
        this.date = date;
        this.compteCourant = compteCourant;
        this.compteEpargne = compteEpargne;
    }

    public Operation() {


    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public double getMontant() {
        return montant;
    }


    public void setMontant(double montant) {
        this.montant = montant;
    }


    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }


    public CompteCourant getCompteCourant() {
        return compteCourant;
    }


    public void setCompteCourant(CompteCourant compteCourant) {
        this.compteCourant = compteCourant;
    }


    public CompteEpargne getCompteEpargne() {
        return compteEpargne;
    }


    public void setCompteEpargne(CompteEpargne compteEpargne) {
        this.compteEpargne = compteEpargne;
    }


    @Override
    public String toString() {
        return "Operation{" +
                "type='" + type + '\'' +
                ", montant=" + montant +
                ", date='" + date + '\'' +
                ", compteCourant=" + compteCourant +
                ", compteEpargne=" + compteEpargne +
                '}';
    }

    public void GestionOperation(ArrayList<CompteCourant> compteCourants,ArrayList<CompteEpargne> compteEpargnes) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Gestion des operations ---");
        System.out.println("1. Effectuer dépôts");
        System.out.println("2. Effectuer retraits");
        System.out.println("3. Effectuer virements");
        System.out.println("4. Quitter");
        System.out.print("Choix: ");
        int choix = scanner.nextInt();
        scanner.nextLine();
        switch (choix) {
            case 1:
                EffetuerDepot(compteCourants,compteEpargnes);
                break;
            case 2:
                //     EffectuerRetraits();
                break;
            case 3:
               //    EffectuerVirement();
                break;
            default:
                System.out.println("choix invalide !");
                break;
        }
    }

    // methode de depotsnEffectuer un depots


    public void EffetuerDepot(ArrayList<CompteCourant> compteCourants, ArrayList<CompteEpargne> compteEpargnes) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------Effetuer dépôt---------");
        System.out.println("le montant : ");
        double montant = sc.nextDouble();
        sc.nextLine();
        System.out.println("la date : ");
        String date = sc.nextLine();
        System.out.println("--------- Compte ---------- ");
        System.out.println("1-Compte Courant");
        System.out.println("2-Compte Epargne");
        System.out.println("Tapez votre choix :  ");
        int choix = sc.nextInt();
        switch (choix) {
            case 1:
                System.out.println("Enter le numero de comptes courants : ");
                String numero = sc.nextLine();
                CompteCourant comptecourant = rechercheCompteCourant(numero, compteCourants);
                comptecourant.setSolde(montant+comptecourant.getSolde());
                Operation operation = new Operation("Dépot", montant, date, comptecourant,null);
                oprations.add(operation);

                break;
            case 2:
                System.out.println("Enter le numero de comptes Epargnes : ");
                String numeroE= sc.nextLine();
                CompteEpargne compteEpargne = rechercheCompteEpargne(numeroE,compteEpargnes);
                if(compteEpargne != null) {
                    System.out.println("Compte n'existe pas ! ");
                    return;
                }
                compteEpargne.setSolde(montant+compteEpargne.getSolde());

                 operation = new Operation("Dépot", montant, date, null,  compteEpargne);
                oprations.add(operation);
                System.out.println("Dépot effucter avec succes ! ");
                break;
            default:
                System.out.println("Choix invalide");
        }


    }

    public CompteCourant rechercheCompteCourant(String numero, ArrayList<CompteCourant> courants) {
        for (CompteCourant compteCourant : courants) {
            if (compteCourant.getNumero().equals(numero)) {
                return compteCourant;
            }
        }
        return null;


    }

    public CompteEpargne rechercheCompteEpargne(String numero, ArrayList<CompteEpargne> compteEpargnes) {

        for (CompteEpargne compteEpargne : compteEpargnes) {
            if (compteEpargne.getNumero().equals(numero)) {
                return compteEpargne;
            }
        }
        return null;


    }
}
