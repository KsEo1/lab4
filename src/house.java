public class house implements Budynek{

    private String budynek_1;
    private double space;
    private String adres;
    private int okna;
    private int mieszkancy;
    private double poleBudynku;
    private KolorEnum kolor;
    @Override
    public void setBudynek(String budynek) {
        this.budynek_1 = budynek;
    }
    @Override
    public String getBudynek() {
        return budynek_1;
    }
    public double getspace() {
        return space;
    }
    public void setspace(double space) {
        this.space = space;
    }
    @Override
    public double powierzchnia(double space) {
        return space;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public String adresBudynku(String adres) {
        return adres;
    }
    public int getOkna() {
        return okna;
    }
    public void setOkna(int okna) {
        this.okna = okna;
    }
    @Override
    public int liczbaOkien(int okna) {
        return okna;
    }
    @Override
    public void liczbaMieszkancow(int mieszkancy) { this.mieszkancy = mieszkancy;}

    public double getPoleBudynku() {
        return poleBudynku;
    }
    public void setPoleBudynku(double poleBudynku) {
        this.poleBudynku = poleBudynku;
    }
    @Override
    public double poleBudynku(double wysokosc, double szerokosc) {
        return wysokosc * szerokosc;
    }
    @Override
    public void kolorDomu(KolorEnum kolor) {
        this.kolor = kolor;
    }
    @Override
    public String toString() {
        return "Info house: {" +
                "rodzina='" + budynek_1 +
                ", wymiary='" + space +
                ", adres=" + adres +
                ", okna=" + okna +
                ", mieszkancy=" + mieszkancy +
                ", kolor domu/mieszkania=" + kolor +
                ", wymiary " + poleBudynku +
                '}';
    }
}
