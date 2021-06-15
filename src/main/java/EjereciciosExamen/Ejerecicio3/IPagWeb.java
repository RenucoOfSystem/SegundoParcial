package EjereciciosExamen.Ejerecicio3;

public interface IPagWeb {
    void attach(IUsuario observer);
    void deattach(IUsuario observer);
    void notifyObserver(Post post);
}
