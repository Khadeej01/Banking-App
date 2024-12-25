public class CompteEpargne extends Compte {
    private double  tauxInteret;



    public CompteEpargne(double tauxInteret, String numero, double solde, Client client){
        super(numero,solde,client);
        this.tauxInteret=tauxInteret;


    }
    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }



    @Override
    public String toString() {
        return "CompteEpargne{" +
                "tauxInteret=" + tauxInteret +
                "} " + super.toString();
    }
}
