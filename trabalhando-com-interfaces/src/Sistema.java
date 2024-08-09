import edu.device.Iphone;

public class Sistema {
    public static void main(String[] args) throws Exception {
        Iphone device = new Iphone();

        device.ligarDispositivo();
        device.salvarContato("98 99923-3040");
        device.tocarMusica();
        device.navegarInternet();
        device.desligarDispositivo();
    }
}
