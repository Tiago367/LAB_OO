import java.util.ArrayList;

public class MP3 extends Musica{
    int tamanho;
    public MP3(String album, String titulo, String compositor,String interprete,int ano,int tamanho){
        super(album,titulo,compositor,interprete,ano);
        this.tamanho = tamanho;
    }

    public static void MaioresMusicas(ArrayList<Musica> lista ){
        for(Musica musica : lista){
            if (musica instanceof MP3){
                MP3 mp = (MP3) musica;
                if (mp.tamanho > 250000000){
                    System.out.println("Musica "+ mp.titulo+" esta ocupando muito espaco com "+mp.tamanho/8+"bytes");
                }
            }   
        }
    }
    
}
