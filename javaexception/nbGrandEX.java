class nbGrandEX extends Exception {
    public nbGrandEX(int nombre) {
        super(nombre + " grand, doit < 20");
    }
}