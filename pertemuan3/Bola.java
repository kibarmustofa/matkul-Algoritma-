class Bola {
    public int jariJari;

    public double LuasPBola() {
        return 4 * 3.14 * (jariJari * jariJari);
    }

    public double VolumBola() {
        return Math.PI * (jariJari * jariJari * jariJari) * 4 / 3;
    }

}