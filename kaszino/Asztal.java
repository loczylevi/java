import java.util.ArrayList;
import java.util.Random;

public class Asztal {
    private ArrayList<Jatekos> jatekosok;
    private double tet;
    private int kor;
    private double goal;
    private boolean jatekban = false;


    // egy asztal max 10 fő

    public Asztal(){
        this.jatekosok = new ArrayList<Jatekos>();
        this.tet = 0;
        this.kor = 0;
    }

    public Asztal(int t, int k){
        this.jatekosok = new ArrayList<Jatekos>();
        this.tet = t;
        this.kor = k;
    }

    // getterek
    public int getDB(){
        return this.jatekosok.size();
    }

    public double getTet(){
        return this.tet;
    }

    public int getKor(){
        return this.kor;
    }

    public String toString(){
        return "Játékosok DB: " + getDB() + "Tét: "+ this.tet + "Aktuális kör: " + this.tet;
    }


    /*1. Új játékos csatlakozása az asztalhoz (addJatekos). Ilyenkor a játékosban beállítja, hogy
    melyik asztalnál ül. Jelezze, ha az asztal megtelt!*/

    public void addJatekos(Jatekos player) throws Exception{
        if (getDB() < 10){
            jatekosok.add(player);
            player.setAsztal(this);
        }
        else{
            throw new Exception("Asztal megtelt");
        }
    }

    /*2. Játék kezdése az asztalnál (ujJatek). Ennek hatására a tét és a körszámláló nullázódik, a
    célérték egy véletlen értékre áll (0-100 között).*/

    public void ujJatek(){
        this.tet = 0;
        this.kor = 0;
        this.jatekban = true;
        Random r = new Random();
        this.goal = r.nextDouble() * 100;
    }

    public void emel(double d) {
        this.tet += d;
    }

    public void kor() {
        if (jatekban == false) {
            System.out.println("Vége a játéknak.");
            return;
        }

        kor++;
        for (int i = 0; i < jatekosok.size(); i++) {
            jatekosok.get(i).lep();

            if (tet > goal) {
                jatekban = false;
                System.out.println("Játék vége! Tét: " + tet + " (Goal: " + goal + ")");
                if (tet < goal * 1.1) {
                    System.out.println("A(z) " + (i + 1) + ". sorszámú játékos nyert!");
                } else {
                    System.out.println("Mindenki veszített.");
                }
                return;
            }
        }
        System.out.println("Kör vége. Aktuális tét: " + tet);
    }

}










