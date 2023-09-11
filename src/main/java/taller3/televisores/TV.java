public class TV{

    private Marca marca;
    private int canal= 1;
    private int precio= 500;
    private boolean estado;
    private int volumen= 1;
    private Control control;
    private static int numTV;

    public TV(Marca mar, boolean est){

    }

    public Marca getMarca (){
        return marca;
    }

    public Marca setMarca (Marca marc){
        marca= marc;
    }

    public int getCanal(){
        return canal;
    }

    public int setCanal(int can){
        canal= can;
    }

    public int getPrecio(){
        return precio;
    }

    public int setPrecio(int prec){
        precio= prec;
    }

    public int getVolumen(){
        return volumen;
    }

    public int setVolumen(int vol){
        volumen= vol;
    }

    public Control getControl(){
        return control;
    }

    public Control setControl(Control cont){
        control= cont;
    }

    public static int getNumTV(){
        return numTV;
    }

    public static int setNumTV(int num){
        numTV= num;
    }

    public boolean turnOn(){
        return false;
    }

    public boolean turnOff(){
        return false;
    }

    public boolean getEstado(){
        return estado;
    }
}