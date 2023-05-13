import java.util.ArrayList;
import java.util.List;
public abstract class Musica {
    String album;
    String titulo;
    String interprete;
    String compositor;
    int ano;


    public Musica(String album, String titulo, String compositor,String interprete,int ano){
        this.interprete = interprete;
        this.titulo = titulo;
        this.compositor = compositor;
        this.album = album;
        this.ano = ano;
    }
    @Override
    public String toString(){
        return "Musica " + this.titulo + " interpretada por " + this.interprete + " composta por " +  this.compositor + " no ano de " + this.ano;

    }

    public static void BuscaPeriodo(List<Musica> lista,int inicio, int fim){
        for( Musica musica:lista){
            if (musica.ano <= fim && musica.ano >= inicio ){ System.out.println(musica);}

        }

    }

    public void buscaAlbum(List<Musica> lista,String nome){
        for( Musica musica:lista){

            if (musica.album == nome ){ System.out.println(musica);}

        }
    }

    public void buscatitulo(List<Musica> lista,String nome){
        for( Musica musica:lista){
            if (musica.titulo == nome ){ System.out.println(musica);}

        }
    }

    public void buscaCompositor(List<Musica> lista,String nome){
        for( Musica musica:lista){
            if (musica.compositor == nome ){ System.out.println(musica);}

        }
    }

    public static void buscaInterprete(List<Musica> lista,String nome){
        for( Musica musica:lista){
            if (musica.interprete == nome ){ System.out.println(musica);}

        }
    }



}