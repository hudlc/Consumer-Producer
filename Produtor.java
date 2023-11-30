import java.util.Random;

public class Produtor implements Runnable {

    private int limite;
    private Deposito deposito;
    private Random generator = new Random();

    public Produtor(Deposito deposito, int limite) {
        this.deposito = deposito;
        this.limite = limite;
    }

    public void run() {
        try {
            for (int i = 0; i < limite; i++) {
                String idCaixa = "" + generator.nextInt(100);
                System.out.println("Inserindo caixa ID: " + idCaixa);
                deposito.depositar(idCaixa);
                Thread.sleep(generator.nextInt(3000));
            }

        } catch (Exception e) {

        }

    }

}
