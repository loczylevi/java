public class Kezdo extends Jatekos {
    private String nev;

    public Kezdo(String nev) {
        this.nev = nev;
    }


    public void lep() {
        System.out.print(this.toString() + " ");
        super.lep();
        if (asztal.getKor() % 2 == 0) {
            asztal.emel(1);
        }
    }

    public String toString() {
        return nev;
    }
}