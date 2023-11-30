import java.util.Random;

public class Consumidor implements Runnable {

    private int limite;
    private Deposito deposito;
    private Random generator = new Random();

    public Consumidor(Deposito deposito, int limite) {
        this.deposito = deposito;
        this.limite = limite;
    }

    public void run() {
        try {
            for (int i = 0; i < limite;) {
                if (deposito.getQuantidadeCaixas() > 0) {
                    System.out.println("*Retirando caixa ID: " + deposito.retirar());
                    i++;
                } else {
                    System.out.println("Nenhuma caixa encontrada!");
                }
                Thread.sleep(generator.nextInt(1000));
            }

        }

        catch (Exception e) {
            System.out.println("Nenhuma caixa encontrada pelo consumidor");
        }
    }

}
