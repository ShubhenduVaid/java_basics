package variables;

public class VariblesExample {

    private String name;
    private int numb;
    private float deci;
    private double deci2;
    private char part;
    private boolean bool;

    public VariblesExample() {
        name = "Shubh";
        numb = 5;
        deci = 5.5F;
        deci2 =5.5;
        part  = 's';
        bool = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumb() {
        return numb;
    }

    public void setNumb(int numb) {
        this.numb = numb;
    }

    public float getDeci() {
        return deci;
    }

    public void setDeci(float deci) {
        this.deci = deci;
    }

    public double getDeci2() {
        return deci2;
    }

    public void setDeci2(double deci2) {
        this.deci2 = deci2;
    }

    public char getPart() {
        return part;
    }

    public void setPart(char part) {
        this.part = part;
    }

    public boolean isBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }
}
