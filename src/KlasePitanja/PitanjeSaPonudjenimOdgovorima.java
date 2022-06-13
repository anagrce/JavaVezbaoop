package KlasePitanja;

public class PitanjeSaPonudjenimOdgovorima extends Pitanje{

    private String odgovorA,odgovorB,odgovorC,odgovorD,tacanOdgovor;

    public PitanjeSaPonudjenimOdgovorima(String s, int i, String odgovorA, String odgovorB,
                                         String odgovorC, String odgovorD,String tacanOdgovor) {

        this.odgovorA = odgovorA;
        this.odgovorB = odgovorB;
        this.odgovorC = odgovorC;
        this.odgovorD = odgovorD;
    }

    public String getOdgovorA() {
        return odgovorA;
    }

    public void setOdgovorA(String odgovorA) {
        this.odgovorA = odgovorA;
    }

    public String getOdgovorB() {
        return odgovorB;
    }

    public void setOdgovorB(String odgovorB) {
        this.odgovorB = odgovorB;
    }

    public String getOdgovorC() {
        return odgovorC;
    }

    public void setOdgovorC(String odgovorC) {
        this.odgovorC = odgovorC;
    }

    public String getOdgovorD() {
        return odgovorD;
    }

    public void setOdgovorD(String odgovorD) {
        this.odgovorD = odgovorD;
    }

    public String getTacanOdgovor() {
        return tacanOdgovor;
    }

    public void setTacanOdgovor(String tacanOdgovor) {
        this.tacanOdgovor = tacanOdgovor;
    }
    @Override
    public String toString(){
        return "Tekst pitanja : " + super.getTekstPitanja() + "\nA : " + this.odgovorA +
                "\nB : " + this.odgovorB + "\nC : " + this.odgovorC + "\nD : " + this.odgovorD;

    }
}
