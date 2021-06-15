package EjereciciosExamen.Ejerecicio3;

public class Client {
    public static void main(String[]args){
        PagWeb pagina = new PagWeb();

        Registrador usuario1 = new Registrador("Videos", new Persona("Rene1"));
        Registrador usuario2 = new Registrador("Estado", new Persona("Rene2"));
        Registrador usuario3 = new Registrador("Videos", new Persona("Rene3"));
        Registrador usuario4 = new Registrador("Videos", new Persona("Rene4"));
        Registrador usuario5 = new Registrador("Fotos", new Persona("Rene5"));

        pagina.attach(usuario1);
        pagina.attach(usuario2);
        pagina.attach(usuario3);
        pagina.attach(usuario4);
        pagina.attach(usuario5);

        pagina.makePost(new Post("Contenido1", "Videos"));
        pagina.makePost(new Post("Contenido2", "Fotos"));
        pagina.makePost(new Post("Contenido3", "Estado"));
    }
}
