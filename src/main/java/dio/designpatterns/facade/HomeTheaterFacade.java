package dio.designpatterns.facade;

public class HomeTheaterFacade {
    private Amplificador amp;
    private Tuner tuner;
    private DVD dvd;
    private Projetor projetor;
    private Luzes luzes;

    public HomeTheaterFacade(Amplificador amp, Tuner tuner, DVD dvd, Projetor projetor, Luzes luzes) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.projetor = projetor;
        this.luzes = luzes;
    }

    public void watchMovie(String movie){
        System.out.println("Está pronto para assistir ao filme ...");
        luzes.brilho(10);
        amp.on();
        tuner.on();
        dvd.on();
        projetor.on();
        dvd.play(movie);
    }

    public void endMovie(){
        System.out.println("Desligando o HomeTheater");
        luzes.brilho(100);
        amp.off();
        tuner.off();
        dvd.off();
        projetor.off();
    }

}
