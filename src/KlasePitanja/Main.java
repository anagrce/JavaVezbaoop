package KlasePitanja;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pitanje p1 = new KlasicnoPitanje("Pitanje 1", 10, "Odgovor 1.");
        Pitanje p2 = new KlasicnoPitanje("Pitanje 2.", 10, "Odgovor 2");
        Pitanje p3 = new PitanjeSaPonudjenimOdgovorima("Pitanje 3.", 10, "Pod a.", "Pod b.",
                "Pod c.", "Pod d.", "Tacan odgovor pod a");


        ArrayList<Pitanje> listaPitanja = new ArrayList<>();

        listaPitanja.add(p1);
        listaPitanja.add(p2);
        listaPitanja.add(p3);


        //System.out.println(listaPitanja);
        // }
        for (Pitanje p : listaPitanja) {
            p1.setOsvojenBrojPoena(7);
            p2.setOsvojenBrojPoena(10);
            p3.setOsvojenBrojPoena(5);

            int suma = 0;
            suma += p.getOsvojenBrojPoena();
            System.out.println(suma);

        }

    }
}

