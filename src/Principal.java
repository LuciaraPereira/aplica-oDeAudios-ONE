import modelos.MinhasPreferidas;
import modelos.Musica;
import modelos.Podcast;
/// aplicação de um sistema de músicas, utilizando conceitos de
///  orientação a objetos, encapsulamento, herança e polimorfismo. ///
public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();

        musica.setTitulo("Sinônimos");
        musica.setCantor("Zé Ramalho");

        for (int i = 0; i < 1000; i++){
            musica.reproduz();
        }

        for (int i = 0; i < 50; i++){
            musica.curte();
        }

        Podcast podcast = new Podcast();

        podcast.setApresentador("Luci");
        podcast.setTitulo("Podelus");

        for (int i = 0; i<5000; i++){
            podcast.reproduz();
        }

        for (int i = 0; i < 1000; i++){
            podcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();

        preferidas.inclui(podcast);
        preferidas.inclui(musica);
    }
}
