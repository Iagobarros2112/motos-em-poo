
import java.io.IOException;

public class App {

    public static void limpartela() throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
    public static void main(String[] args) throws Exception {

        limpartela();

        Motocicleta m1 = new Motocicleta();
        m1.setModelo("Titan\n");
        m1.setCor("Vermelha\n");
        m1.statusDamoto();
        m1.ligar();

        Motocicleta m2 = new Motocicleta();
        m2.setModelo("Yamaha");
        m2.setCor("Azul");
        m2.setPlaca("xza678");
        m2.statusDamoto();
        m2.desligar();
    }

  
    
}
