public class Post {
    public String texto;
    public String link;
    public int numeroCurtidas;
    public int numeroCompartilhamentos;

    public Post(String texto, String link) {
        this.texto = texto;
        this.link = link;
        this.numeroCurtidas = 0;
        this.numeroCompartilhamentos = 0;
    }

    public int curtidas(int curtir) {
        return this.numeroCurtidas += curtir;
    }

    public int compartilhamentos(int compartilhados) {
        return this.numeroCompartilhamentos += compartilhados;
    }

    public int getNumeroCurtidas() {
        return this.numeroCurtidas;
    }

    public int getNumeroCompartilhamentos() {
        return this.numeroCompartilhamentos;
    }

}
