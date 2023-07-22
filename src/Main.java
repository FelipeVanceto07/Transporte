public class Main {
    public static void main(String[] args) {


        Moto moto = new Moto("Honda","Titan",2023);
        carro carro = new carro("Honda","City",2013,4);
        caminhao caminhao = new caminhao("Volvo","FH 540", 2023,"Baú");

        moto.informacoes();
        moto.ligar();
        moto.buzinar();
        moto.empinar();

        carro.informacoes();
        carro.ligar();
        carro.buzinar();
        carro.darRe();

        caminhao.informacoes();
        caminhao.ligar();
        caminhao.buzinar();
        caminhao.darRe();
    }
}

