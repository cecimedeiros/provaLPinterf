import java.util.ArrayList;

public class VendasDaAgenciaDeTurismo extends VendasDeTurismoIF{

    ArrayList <Double> VendasDeTurismo = new ArrayList<>();
    double soma;

    public void adicionaVenda(double item){
        soma += item;
        VendasDeTurismo.add(item);
    }

    public double getPrecoDeVenda(int posicao){
        return VendasDeTurismo.get(posicao);
    }

    public double getPrecoTotal(){
        return soma;
    }

    public ArrayList listagemDeVendas(){
        return VendasDeTurismo;
    }

}
