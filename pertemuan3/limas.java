class Limas {
    public int sisi;
    public int tinggi;

    public double LuasPLimas() {
        double tinggiStegak = Math.sqrt((0.5 * sisi) * (0.5 * sisi) + tinggi * tinggi);
        double luasStegak = (0.5 * sisi * tinggiStegak);
        return (sisi * sisi) + (4 * luasStegak);
    }

    public double VolumLimas() {
        return ((sisi * sisi) * tinggi) / 3;
    }

}