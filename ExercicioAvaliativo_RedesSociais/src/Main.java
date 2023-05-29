import classes.Usuario;
import classes.rede_social.*;

public class Main {
    public static void main(String[] args) {
        // instancia duas redes sociais
        Facebook facebook = new Facebook("123456", 10);
        Twitter twitter = new Twitter("987654", 25);

        // cria um array de redes sociais e armazena as duas redes sociais instanciadas
        RedeSocial [] redesSociais = new RedeSocial[2];

        redesSociais[0] = facebook;
        redesSociais[1] = twitter;

        // instancia um usuario e lhe atribui o array de redes sociais
        Usuario usuario = new Usuario("Luiz Matheus", "luiz@email.com.br", redesSociais);

        try {
            // executa ações das redes sociais
            for (int i = 0; i < usuario.getRedesSociais().length; i++) {
                RedeSocial r = usuario.getRedesSociais()[i];

                r.postarComentario();
                r.postarFoto();
                r.postarVideo();
                r.curtirPublicacao();

                if (r instanceof Twitter) {
                    Twitter t = (Twitter) r;
                    t.compartilhar();
                } else if (r instanceof Facebook) {
                    Facebook f = (Facebook) r;
                    f.fazStreaming();
                    f.compartilhar();
                } else if (r instanceof Instagram) {
                    Instagram ig = (Instagram) r;
                } else if (r instanceof GooglePlus) {
                    GooglePlus gp = (GooglePlus) r;
                    gp.compartilhar();
                    gp.fazStreaming();
                }

                System.out.println("");
            }
        }catch (NullPointerException e){
            System.out.println(e.fillInStackTrace());
        }
    }
}