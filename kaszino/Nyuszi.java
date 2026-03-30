class Nyuszi extends Jatekos {
    private String szin;
    public Nyuszi(String s) { this.szin = s; }

    @Override
    public void lep() {
        System.out.print("Szín: " + szin + " ");
        super.lep();
        if (asztal.getTet() < 50) {
            asztal.emel(5);
        } else {
            System.out.println("passz nyuszi vok");
        }
    }

    @Override
    public String toString() { return szin + " nyuszi"; }
}