class Kerucut {
    public int jariJari;
    public int sisiMiring;
    public double phi = 3.14;
   
    public Kerucut(int r, int s) {
        jariJari = r;
        sisiMiring = s;
    }

    public double tinggiKerucut() {
        double t = Math.sqrt(sisiMiring * sisiMiring - jariJari * jariJari);
        return t;
    }

    public double LuasPKerucut() {
        return phi * jariJari * sisiMiring + phi * jariJari * jariJari;
    }
    public double VolumKerucut() {
        return ((phi * jariJari * jariJari) * tinggiKerucut()) / 3;
    }
}
