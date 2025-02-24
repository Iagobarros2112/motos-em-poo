public final class yamaha extends Motocicleta {

    //metodo herdado de motocicleta

    public void mostrarDados() {
        System.out.printf("Modelo %s\nCor: %s\nPlaca: %s\n\n\n\n", this.Modelo, this.Cor, this.Placa);
    }

    //metodo proprio de yamaha
    public String Turbo;
    public String getTurbo() {
        return Turbo;
    }

    
}
