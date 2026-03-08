package helyo;

public class Helyo {

    public String uzenet;

    public Helyo(String uzenet) {
        this.uzenet = uzenet;
    }

    public void koszon() {
        System.out.println(uzenet);
    }

    public static void main(String[] args) {
    	Helyo program = new Helyo("szia világ xd");
        program.koszon();
    }
}