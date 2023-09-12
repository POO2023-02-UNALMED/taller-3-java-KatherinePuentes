package taller3.televisores;

public class Control{
    private TV tv;

    public boolean turnOn(){
        estado= true;
    }

    public boolean turnOff(){
        estado= false;
    }

    public void canalUp(){
        if (sePuedeCan(canal+1))
            canal++;
    }

    public void canalDown(){
        if (sePuedeCan(canal-1))
            canal--;
    }

    public boolean sePuedeCan(int canal){
        if (!estado)
            return false;

        return canal>=1 && canal<=120;
    }

    public void volumenlUp(){
        if (sePuedeVol(volumen+1))
            volumen++;
    }

    public void volumenDown(){
        if (sePuedeVol(volumen-1))
            volumen--;
    }

    public boolean sePuedeVol(int volumen){
        if (!estado)
            return false;

        return volumen>=0 && volumen<=7;
    }

    public void enlazar(TV tv){
        this.tv= tv;
        tv.setControl(this);
    }
}