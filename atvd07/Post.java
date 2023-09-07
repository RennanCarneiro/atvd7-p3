public class Post {
    public String texto;
    public String link;
    public int numeroCurtidas;
    public int numeroCompartilhamentos;


    public Post (String texto, String link){
        this.texto = texto;
        this.link = link;
    }

    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void curtir(int curtir){
        numeroCurtidas += curtir;
    }
    public void compartilhar(int compartilhar){
        numeroCompartilhamentos += compartilhar;
    }
}
