import java.util.ArrayList;

public class Deposito {

    private ArrayList<String> caixas = new ArrayList<String>();

    public void depositar(String novaCaixa) {
        caixas.add(novaCaixa);
    }

    public String retirar() {
        int ultimoIndice = caixas.size() - 1;

        String ultimaCaixa = caixas.get(ultimoIndice);

        caixas.remove(ultimoIndice);

        return ultimaCaixa;

    }

    public int getQuantidadeCaixas() {
        return caixas.size();
    }

}
