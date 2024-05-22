package dio.designpatterns.facade;

public class DVD {
    public void on() {
        System.out.println("DVD ligado");
    }

    public void off() {
        System.out.println("DVD desligado");
    }
    public void play(String movie) {
        System.out.println("Apresnetando o filme: " + movie);
    }
}
