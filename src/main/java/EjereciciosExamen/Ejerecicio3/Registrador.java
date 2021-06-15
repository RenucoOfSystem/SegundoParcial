package EjereciciosExamen.Ejerecicio3;

public class Registrador implements IUsuario{

    private String preferences;
    private  Persona user;

    public Registrador(String preferences, Persona user) {
        this.preferences = preferences;
        this.user = user;
    }

    @Override
    public void update(String message, Post post) {
        System.out.println("Nueva notificacion!!!");
        System.out.println(user.getNombre());
        System.out.println(post.getContent());
    }

    @Override
    public String getPreferences() {
        return preferences;
    }
}
