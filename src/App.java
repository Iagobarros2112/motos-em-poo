
import java.io.IOException;
import java.util.ArrayList;

public class App {

    public static void limpartela() throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
    public static void main(String[] args) throws Exception {

        limpartela();

        Motocicleta m1 = new Titan();
        m1.setModelo("Titan\n");
        m1.setCor("Vermelha\n");
        
        m1.ligar();

        Motocicleta m2 = new yamaha();
        m2.setModelo("Yamaha\n");
        m2.setCor("Azul\n");
        m2.setPlaca("xza678\n");
        
        m2.desligar();

        ArrayList<Motocicleta> motos = new ArrayList<Motocicleta>();
           motos.add(m1);
           motos.add(m2);
       

        for (Motocicleta p : motos) {
           p.mostrarDados();
        }
        
    }

  
    
}
