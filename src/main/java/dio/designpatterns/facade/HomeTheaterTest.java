package dio.designpatterns.facade;

public class HomeTheaterTest {
    public static void main(String[] args) {
        Amplificador amp = new Amplificador();
        Tuner tuner = new Tuner();
        DVD dvd = new DVD();
        Projetor projector = new Projetor();
        Luzes lights = new Luzes();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, projector, lights);
        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}
