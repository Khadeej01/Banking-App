abstract class Compte {

    private String numero;
    private double solde;
    Client client ;

    public Compte(String numero, double solde, Client client) {
        this.numero = numero;
        this.solde = solde;
        this.client = client;
    }
    public String getNumero(){
        return numero ;
    }
    public void setNumero(String numero){
        this.numero  = numero ;
    }
    public double getSolde(){
        return solde;
    }
    public void setSolde(double solde){
     this.solde = solde;
    }
    public Client getClient( Client client){
        return client ;
    }
    public void setClient(Client client ){
        client = client;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numero='" + numero + '\'' +
                ", solde=" + solde +
                ", client=" + client +
                '}';
    }
}
