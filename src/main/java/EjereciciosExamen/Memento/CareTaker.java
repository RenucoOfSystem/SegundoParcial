package EjereciciosExamen.Memento;

import java.util.HashMap;
import java.util.Map;

public class CareTaker {
    private Map<String, Memento> almacenamientoDeEstados = new HashMap<>();

    public void versionate(String number, Memento memento){ almacenamientoDeEstados.put(number, memento); }

    public Memento getMemento(String version){
        return almacenamientoDeEstados.get(version);
    }
}
