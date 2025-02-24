//classe generica principal
public class Motocicleta {
    
    //atributos
    private String Modelo;
    private String Cor;
    private String Placa;
    private boolean Ligada;

    //métodos de modelo
    public String getModelo() {
        return Modelo;
    }

    //testar se modelo eh valido
    public void setModelo(String Modelo) throws Exception {
        int qtdeLetras = Modelo.trim().split(" ").length;
        if (qtdeLetras < 3) {
            this.Modelo = Modelo;
        } else {
            throw new Exception("Modelo Da Moto Inexistente");
        }
    }

    //métodos de cor
    public String getCor() {
        return Cor;
    }
    //testar se cor é valida
    public void setCor(String Cor) throws Exception {
        int qtdeLetrasEmCor = Modelo.trim().split(" ").length;
        if (qtdeLetrasEmCor < 3) {
            this.Cor = Cor;
        } else {
            throw new Exception("Cor Da Moto Inexistente");
        }

    }

    //métodos de placa
    public String getPlaca() {
        return Placa;
    }

     //testar se placa é valida
     public void setPlaca(String Placa) throws Exception {
        int qtdeCaracteresPlaca = Modelo.trim().split(" ").length;
        if (qtdeCaracteresPlaca < 3) {
            this.Placa = Placa;
        } else {
            throw new Exception("Placa Da Moto Inexistente");
        }

    }
    
     //métodos de ligada
     void ligar() {

        this.Ligada = true;
     }

     void desligar() {

        this.Ligada = false;
     }
    
  

    public void statusDamoto () {
        System.out.println("A Motocicleta No Modelo :\n" + this.Modelo);
        System.out.println("Na Cor : \n" + this.Cor);
        System.out.println("De placa: \n" + this.Placa);
        System.out.println("Está ligada?\n" + this.Ligada);

        
        


    }

    public Motocicleta () {
        this.Modelo = "sem nome";
        this.Cor = "sem cor";
        this.Placa = "sem placa";
        this.Ligada = false;
    }

   




}




