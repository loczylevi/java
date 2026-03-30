class Mester extends Jatekos {
    private int fokozat;
    public Mester(int f) { this.fokozat = f; }

    @Override
    public void lep() {
        System.out.print("Mester fokozat: " + fokozat + " ");
        super.lep();
        asztal.emel(asztal.getTet() * (fokozat / 100.0));
    }

    @Override
    public String toString() { return "Mester" + fokozat; }
}