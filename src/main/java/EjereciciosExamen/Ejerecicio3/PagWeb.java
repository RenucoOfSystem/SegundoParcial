package EjereciciosExamen.Ejerecicio3;

import java.util.ArrayList;
import java.util.List;

public class PagWeb implements IPagWeb{

    private List<IUsuario> usersList = new ArrayList<>();
    private List<Post> posts = new ArrayList<>();

    public void makePost(Post post){
        posts.add(post);
        this.notifyObserver(post);
    }
    @Override
    public void attach(IUsuario observer) {
        usersList.add(observer);
    }

    @Override
    public void deattach(IUsuario observer) {
        usersList.remove(observer);
    }

    @Override
    public void notifyObserver(Post post) {

    }
}
