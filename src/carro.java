public class carro extends Veiculo{
    int quantidadeDePortas;

    carro(String marca, String modelo, int ano, int quantidadeDePortas){
        super(marca,modelo,ano,6,"Bi-Bi","O Carro");
        this.quantidadeDePortas = quantidadeDePortas;
    }
    public void darRe(){
        System.out.println("A Re foi acionada!!");
    }

}