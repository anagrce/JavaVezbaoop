package KlasePitanja;

public abstract class Pitanje {

   /* Napisati apstraktnu klasu Pitanje koja ima atribute:
            ● String tekstPitanja
● int brojMaxPoena (>0)
● Int osvojenBrojPoena (>=0)
● boolean pitanjePregledano
    Geteri i seteri za ove attribute*/

    private String tekstPitanja;
    private int brojMaxPoena;
    private int osvojenBrojPoena;
    private boolean pitanjePregledano;

    public Pitanje(){

    }

    /*public Pitanje(String tekstPitanja, int brojMaxPoena, int osvojenBrojPoena, boolean pitanjePregledano) {
        this.tekstPitanja = tekstPitanja;
        this.brojMaxPoena = brojMaxPoena;
        this.osvojenBrojPoena = osvojenBrojPoena;
        this.pitanjePregledano = pitanjePregledano;
    }*/

    public String getTekstPitanja() {
        return tekstPitanja;
    }

    public void setTekstPitanja(String tekstPitanja) {
        this.tekstPitanja = tekstPitanja;
    }

    public int getBrojMaxPoena() {
        return brojMaxPoena;
    }

    public int setBrojMaxPoena(int brojMaxPoena) {
        if (brojMaxPoena > 0) {
            this.brojMaxPoena = brojMaxPoena;
        } else {
            this.brojMaxPoena = 1;
        }
        return 0;
    }

    public int getOsvojenBrojPoena() {
        return  osvojenBrojPoena;
    }

    public void setOsvojenBrojPoena(int osvojenBrojPoena){
        if (osvojenBrojPoena >= 0) {
            this.osvojenBrojPoena = osvojenBrojPoena;
        } else {
            this.osvojenBrojPoena = 0;
        }
    }


    public boolean isPitanjePregledano() {
        return pitanjePregledano;
    }

    public void setPitanjePregledano(boolean pitanjePregledano){
        this.pitanjePregledano = pitanjePregledano;
    }
    @Override
    public String toString() {
        return "Pitanje " + tekstPitanja + "\n makismalan broj poena : " + brojMaxPoena +
                "\nOsvojen broj poena : " + osvojenBrojPoena +
                "\nPitanje je pregledano? " + pitanjePregledano;
    }
}
