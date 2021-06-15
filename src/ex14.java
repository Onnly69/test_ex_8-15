public class ex14 {

    private String denumire;
    protected String companie;
    public String socket;


    public String getDenumire() {
        return denumire;
    }
    public String getCompanie() {
        return companie;
    }

    public void setDenumire(String nume) {
        this.denumire = denumire;
    }
    public void setCompanie(String stapan) {
        this.companie = stapan;
    }

    public void viteza(){
        System.out.println("Viteza CPU-urilor difera");
    }

}
