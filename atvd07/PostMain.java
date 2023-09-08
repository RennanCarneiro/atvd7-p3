public class PostMain {
    public static void main(String[] args) {
        Post postagem = new Post("Nova postagem", "https://www.twitter.com/");
        System.out.println("Texto: " + postagem.texto);
        System.out.println("Link: " + postagem.link);
        System.out.println("Numero de curtidas: " + postagem.curtidas(55));
        System.out.println("Numero de compartilhamentos: " + postagem.compartilhamentos(2));
    }
}
