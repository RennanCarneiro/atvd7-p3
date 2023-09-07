public class PostMain {
    public static void main(String[] args) {
        Post postagem = new Post(null, null);
        postagem.setTexto("Bem vindo!");
        postagem.setLink("https://github.com/rennancarneiro");
        postagem.curtir(10);
        postagem.compartilhar(5);
        System.out.println("Texto: " + postagem.getTexto());
        System.out.println("Site Favorito: " + postagem.getLink());
        System.out.println("Número de Curtidas: " + postagem.numeroCurtidas);
        System.out.println("Número de Compartilhamentos: " + postagem.numeroCompartilhamentos);
    }
}
