package EjereciciosExamen.Memento;

public class Archivo {
    private String estado;
    private int numeroVersion;

    public Archivo(){
        this.numeroVersion=1;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void versionamiento(String estado, CareTaker almacenador){
        int numeroPalabras = 0;
        for (String palabras: estado.split(" ")){
            numeroPalabras++;
        }
        if(numeroPalabras>=5){
            setEstado(estado);
            almacenador.versionate("Version: " + numeroVersion++, makeVersion() );
        }


        }

        public Memento makeVersion(){
            System.out.println("Generando Version");
            System.out.println(">DOC: " +estado);
            return new Memento(this.estado);
        }
        public void restoreInformation(Memento memento){
        this.estado = memento.getEstado();
        System.out.println("Version anterior>" + estado);
        }
}
