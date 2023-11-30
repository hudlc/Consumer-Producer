public class Main {

    public static void main(String[] args) {

        int limite = 10;

        Deposito dep = new Deposito();
        Consumidor consumidor = new Consumidor(dep, limite);
        Produtor produtor = new Produtor(dep, limite);

        Thread thread1 = new Thread(produtor);
        Thread thread2 = new Thread(consumidor);

        thread1.start();
        thread2.start();

    }

}
