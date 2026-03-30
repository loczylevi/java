public class Robot extends Jatekos {
    private static int counter = 0;
    private int id;

    public Robot() {
        this.id = counter++;
    }


    public void lep() {
        System.out.print(this.toString() + " ");
        super.lep();
    }

    public String toString() { return "Robot" + id; }
}