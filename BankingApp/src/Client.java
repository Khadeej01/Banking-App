import java.util.ArrayList;
import java.util.Scanner;
public class Client {
    private int Id;
    private String Nom;
    private String Prenom;
    private String Email;
    private String Addresse;
    private String Telephone;

    public Client(int Id, String Nom, String Prenom, String Email, String Addresse, String Telephone) {
        this.Id = Id;
      this.Nom = Nom ;
      this.Prenom = Prenom;
      this.Email = Email;
      this.Addresse = Addresse;
      this.Telephone = Telephone;

    }

    public Client() {

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = Id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return Addresse;
    }

    public void setAddress(String addresse) {
        Addresse = addresse;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    @Override
    public String toString() {
        return "Client {" +
                "Id=" + Id +
                ", Nom='" + Nom + '\'' +
                ", Prenom='" + Prenom + '\'' +
                ", Email='" + Email + '\'' +
                ", Addresse='" + Addresse + '\'' +
                ", Telephone='" + Telephone + '\'' +
                '}';
    }

    public void gestionClient(ArrayList<Client> clients) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Gestion des Client ---");
        System.out.println("1. Ajouter un Client");
        System.out.println("2. Modifier un Client");
        System.out.println("3. Supprimer un Client");
        System.out.println("4. Afficher les Clients");
        System.out.print("Choix: ");
        int choix = scanner.nextInt();
        scanner.nextLine();


        switch (choix) {
            case 1:
                AjouterClient(clients);
                break;
            case 2:
                ModifierClient(clients);
                break;
            case 3:
                //supprimerClient(clients);
                break;
            case 4:
                AfficherClient(clients);
                break;
            default:
            System.out.println("Choix invalide !");
        }
    }


    // Ajout d'un client
    public void AjouterClient(ArrayList<Client> clients) {
        Scanner scanner = new Scanner(System.in);

        int Id = clients.size() + 1;
        System.out.println("Saisie ces infos : ");
        System.out.print("Nom: ");
        String Nom = scanner.nextLine();
        System.out.print("Prénom: ");
        String Prenom = scanner.nextLine();
        System.out.print("Email: ");
        String Email = scanner.nextLine();
        System.out.print("Addresse: ");
        String Addresse = scanner.nextLine();
       // String[] notesInput = scanner.nextLine().split(" ");
        System.out.print("Telephone: ");
        String Telephone = scanner.nextLine();

        Compte compte = rechercherCompte(numeroCompte, comptes);
        clients.add(new Client(Id, Nom, Prenom,Email,Telephone, Addresse));
        System.out.println("Client ajout avec succes !");
    }


}

