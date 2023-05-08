import java.util.Objects;

public class PasseioDeLancha implements VendasDeTurismoIF {

    private int numeroDePessoas;
    private int qtdeDeHoras;
    private int PRECO_PORPESSOA = 60;

    public int getNumeroDePessoas(){
        return numeroDePessoas;
    }

    public void setNumeroDePessoas(int novaQtde){
        this.numeroDePessoas = novaQtde;
    }

    public int getQtdeDeHoras(){
        return qtdeDeHoras;
    }

    public void setQtdeDeHoras(int novaQtde){
        this.qtdeDeHoras = novaQtde;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroDePessoas, qtdeDeHoras, PRECO_PORPESSOA);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof PasseioDeLancha))
            return false;
        PasseioDeLancha other = (PasseioDeLancha) obj;
        return numeroDePessoas == other.numeroDePessoas
                && Objects.equals(qtdeDeHoras, other.qtdeDeHoras)
                && Double.doubleToLongBits(PRECO_PORPESSOA) == Double.doubleToLongBits(other.PRECO_PORPESSOA);
    }

    @Override
    public String toString() {
        return "Número de pessoas = " + numeroDePessoas + "\nQuantidade de horas = " + qtdeDeHoras + "\nPreço por pessoa = " + PRECO_PORPESSOA;
    }

    @Override
    public int getPreco(){
        int precoTotal = numeroDePessoas * qtdeDeHoras * PRECO_PORPESSOA;
        return precoTotal;
    }

    @Override
    public String getDescricao(){
        return "Numero de pessoas: " + numeroDePessoas + "\nQuantidade de horas: " + qtdeDeHoras + "\nValor do passeio: " + getPreco();
    }

}
