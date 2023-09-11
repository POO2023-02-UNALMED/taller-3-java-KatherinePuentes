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
        estado= true;
    }

    public boolean turnOff(){
        estado= false;
    }

    public boolean getEstado(){
        return estado;
    }

    public void canalUp(){
        if (sePuedeCan(canal+1))
            canal++;
    }

    public void canalDown(){
        if (sePuedeCan(canal-1))
            canal--;
    }

    public void volumenlUp(){
        if (sePuedeVol(volumen+1))
            volumen++;
    }

    public void volumenDown(){
        if (sePuedeVol(volumen-1))
            volumen--;
    }

    public boolean sePuedeCan(int canal){
        if (!estado)
            return false;

        return canal>=1 && cala<=120;
    }

    public boolean sePuedeVol(int volumen){
        if (!estado)
            return false;

        return volumen>=0 && volumen<=7;
    }
}