package org.entdes.segona;

import java.util.ArrayList;
import java.util.List;

class Usuari {
    String nom;
    int edat;
    int alcada;
    
    public Usuari(String a, int b, int c) {
        this.nom = a;
        this.edat = b;
        this.alcada = c;
    }
}

public class GestorUsuaris {
    List<Usuari> usuaris = new ArrayList<>();

    public void afegirUsuaris(String data[][]) {

        if (data.length>0 && Integer.parseInt(data[0][1]) > 0) {
            Usuari u = new Usuari(data[0][0], Integer.parseInt(data[0][1]), Integer.parseInt(data[0][2]));
            usuaris.add(u);
        }

        if (data.length>1 && Integer.parseInt(data[1][1]) > 0) {
            Usuari u = new Usuari(data[1][0], Integer.parseInt(data[1][1]), Integer.parseInt(data[1][2]));
            usuaris.add(u);
        }

        if (data.length>2 && Integer.parseInt(data[0][1]) > 0) {
            Usuari u = new Usuari(data[2][0], Integer.parseInt(data[2][1]), Integer.parseInt(data[2][2]));
            usuaris.add(u);
        }

    }
    
    public static void main(String[] args) {
        String data[][] = {{"Jon", "30", "180"}, {"Laia", "18", "170"}, {"Marc", "25", "175"}};
        GestorUsuaris gestorUsuaris = new GestorUsuaris();
        gestorUsuaris.afegirUsuaris(data);  
        System.out.println(gestorUsuaris.usuaris.size());        

    }

}
