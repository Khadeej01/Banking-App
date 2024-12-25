public class CompteCourant extends Compte {
    private String FraisBancaire;
    public  CompteCourant(String FraisBancaire,String numero,double solde,Client client ) {
        super( numero , solde, client);
        this.FraisBancaire = FraisBancaire;


    }

    public String getFraisBancaire() {
        return FraisBancaire;
    }

    public void setFraisBancaire(String FraisBancaire) {
       this.FraisBancaire = FraisBancaire;
    }

    @Override
    public String toString() {
        return "CompteCourant{" +
                "FraisBancaire='" + FraisBancaire + '\'' +
                "} " + super.toString();
    }
}

