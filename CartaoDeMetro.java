public class CartaoDeMetro implements VendasDeTurismoIF{

    private int qtdeViagens;
    public static int VALOR_DE_UMA_VIAGEM;

    public int getQtdeViagens(){
        return qtdeViagens;
    }

    public CartaoDeMetro(int qtdeViagens){
        this.qtdeViagens = qtdeViagens;
    }

    public void setQtdeViagens(int qtdeViagens) {
        this.qtdeViagens = qtdeViagens;
    }

    public int getPreco(){
        return qtdeViagens * VALOR_DE_UMA_VIAGEM;
    }

    public String getDescricao(){
        return qtdeViagens + "viagens de metro.";
    }
}
