public class caminhao extends Veiculo {
    int quantidadeDePortas;
    String carroceria;

    caminhao(String marca, String modelo, int ano, String carroceria){

        super(marca,modelo,ano,6,"FUUUUOOONNNNN","O Caminhao");
        this.carroceria = carroceria;
        this.quantidadeDePortas = 2;
    }
    public void darRe(){
        System.out.println("A Re foi acionada!!");
    }
}