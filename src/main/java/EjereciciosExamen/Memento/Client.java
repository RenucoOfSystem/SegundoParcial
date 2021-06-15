package EjereciciosExamen.Memento;

public class Client {
    public static void main(String[]args){
        CareTaker alamacenador = new CareTaker();
        Archivo archivo = new Archivo();
        String doc;

        doc = "este documento es una prueba";
        archivo.versionamiento(doc, alamacenador);
        doc = "el exito solo depende de tu esfuezo";
        archivo.versionamiento(doc, alamacenador);
        doc = "prologo";
        archivo.versionamiento(doc, alamacenador);
        doc = "este documento fue actualizado satisfactoriamente";
        archivo.versionamiento(doc, alamacenador);

        archivo.restoreInformation(alamacenador.getMemento("Version 1"));
    }
}
