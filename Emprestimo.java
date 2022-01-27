public class Emprestimo{

    private double credito;
    private double verificaCredito;


    public double getcredito() {
        return credito;
    }

    public double setcredito(double credito) {
        this.credito = credito;
        return credito;
    }

    public void verificaCredito(double saldo) {
        credito = saldo * 12;
        System.out.println("Valo máximo para emprestimo é de: " + credito);
    }

    public double getVerificaCredito() {
        return credito;
    }

    public double setverificaCredito(double credito) {
        this.credito = credito;
        return credito;
    }

}
