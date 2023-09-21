package pilares;
public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        
        // Encapsulamento: nem tudo deve ser visível a todos
        /* jeep.confereCambio();
        jeep.confereCombustivel(); */

        jeep.setChassi("897897");
        //jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("123465");
        //z400.ligar();

        Veiculo coringa = z400;
        coringa.ligar();
    }
}
