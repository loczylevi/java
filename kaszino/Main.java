
public class Main {
    public static void main(String[] args) {
        Asztal a = new Asztal();

        try {
            // 2/d: Két kezdő és egy robot
            a.addJatekos(new Kezdo("Laci"));
            a.addJatekos(new Kezdo("Sanyi"));
            a.addJatekos(new Robot());

            // 4/c: Mester és Nyuszi
            a.addJatekos(new Mester(10));
            a.addJatekos(new Nyuszi("Kék"));

            System.out.println("Játék indul:");
            a.ujJatek();

            for (int i = 0; i < 10; i++) {
                System.out.println("\n--- " + (i + 1) + ". kör ---");
                a.kor();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}