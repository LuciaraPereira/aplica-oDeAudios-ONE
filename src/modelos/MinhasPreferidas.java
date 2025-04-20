package modelos;

public class MinhasPreferidas {

    public void inclui(Audios audio){
        if (audio.getClassificacao()>=9){
            System.out.println(audio.getTitulo() + " é um sucesso preferido por todos!");
        }else {
            System.out.println(audio.getTitulo() + " também é ÓTIMO! " );
        }
    }
}
