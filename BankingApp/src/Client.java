import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
      this.Id = Id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {

        this.Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {

        this.Prenom = prenom;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {

        this.Email = email;
    }

    public String getAddress() {
        return Addresse;
    }

    public void setAddress(String addresse) {

        this.Addresse = addresse;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {

        this.Telephone = telephone;
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

    public void GestionClient(ArrayList<Client> clients) {
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
                SupprimerClient(clients);
                break;
            case 4:
                AfficherClient(clients);
                break;
            default:
                System.out.println("Choix invalide !");
        }
    }
    public static boolean RegexEmail(String email){
        final String regex ="^[a-z0-9](\\.?[a-z0-9]){5,}@gmail\\.com$";
        Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(email);
        if(matcher.find()){
            System.out.println("Email valide !");
            return true;
        }else {
            System.out.println("Resaisie un  Email(>5 car )");
            return false;
        }
    }

    // regex tel
    public static boolean RegexTelaphone(String telephone) {
        final String regex = "^((05)|(06)|(07))([0-9]{8})$";
        Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(telephone);
        if(matcher.find()){
            System.out.println("Telephone valide !");
            return true;


        }else{
            System.out.println("Telephone invalide !");
            return false;


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

        String Email;
        do {
            System.out.print("Email: ");
             Email = scanner.nextLine();


        }while (!RegexEmail(Email));

        System.out.print("Addresse: ");
        String Addresse = scanner.nextLine();

        do {
            System.out.print("Telephone: ");
            Telephone = scanner.nextLine();


        }while (!RegexTelaphone(Telephone));
        try {

            // telephone contient seulmt des digits
            for (char c : Telephone.toCharArray()) {
                if (!Character.isDigit(c)) {
                    throw new IllegalArgumentException("Le numero de téléphone doit contenir uniquement des chiffres.");
                }
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Erreur de saisie pour le téléphone : " + e.getMessage());
            return;
        }


        clients.add(new Client(Id, Nom, Prenom,Email,Telephone, Addresse));
        System.out.println("Client ajout avec succes ^-^!");
    }
    // Modification du Client

    public void ModifierClient(ArrayList<Client> clients) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ID de l'apprenant à modifier: ");
        int id = scanner.nextInt();
        scanner.nextLine();


        for (Client client : clients) {
            if (client.getId() == id) {
                System.out.print("Nouveau Nom: ");
                client.setNom(scanner.nextLine());
                System.out.print("Nouveau Prénom: ");
                client.setPrenom(scanner.nextLine());
                System.out.print("Nouvel Email: ");
                client.setEmail(scanner.nextLine());
                System.out.print("Nouvelle Addresse: ");
                client.setAddress(scanner.nextLine());
                System.out.print("Nouveau num de  Telephone: ");
                client.setTelephone(scanner.nextLine());

                System.out.println("Apprenant modifié  avec succes ^-^!");
                return;
            }
        }
        System.out.println("Apprenant introuvable !");
    }


    // Supression du client
public void SupprimerClient(ArrayList<Client> clients) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("ID du client  à supprimer: ");
    int id = scanner.nextInt();
    scanner.nextLine();


    if (clients.removeIf(client -> client.getId() == id)) {
        System.out.println("Client supprimé !");
    } else {
        System.out.println("Client introuvable !");
    }
}



    // Affichage d'un clients
    public void AfficherClient(ArrayList<Client> clients) {
        if (clients.isEmpty()) {
            System.out.println("Aucun apprenant trouvé.");
        } else {
            for (Client apprenant : clients) {
                System.out.println(apprenant);
            }
        }
    }

}

