package KlasePitanja;

public class KlasicnoPitanje extends Pitanje{

    private String odgovorNaPitanje;


    public KlasicnoPitanje( String s, int i, String s1){

    }

    /*public KlasicnoPitanje(String tekstPitanja, int brojMaxPoena, String odgovorNaPitanje) {
        super(tekstPitanja, brojMaxPoena);
        this.odgovorNaPitanje = odgovorNaPitanje;
    }*/

    public String getOdgovorNaPitanje() {
        return odgovorNaPitanje;
    }

    public void setOdgovorNaPitanje(String odgovorNaPitanje) {
        this.odgovorNaPitanje = odgovorNaPitanje;
    }

    @Override
    public String toString(){
        return "Klasicno pitanje : " + getTekstPitanja() +
                "\nOdgovor na pitanje : " + this.odgovorNaPitanje;
    }

}
