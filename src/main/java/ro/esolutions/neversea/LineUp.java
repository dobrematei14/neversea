package ro.esolutions.neversea;

import java.util.ArrayList;

public class LineUp {
    public static Ziua day1 = new Ziua();
    public static Ziua day2 = new Ziua();
    public static Ziua day3 = new Ziua();
    public static Ziua day4 = new Ziua();

    public static void initLineUp() {
        Artist nane = new Artist("nane", "20.00", "The Ark", "Populara");
        Artist valentino = new Artist("Valentino Khan", "00.00", "The Ark", "Electronic/House");
        Artist salvatore = new Artist("Salvatore Ganacci", "2.00", "Main Stage", "Manele");
        Artist lost = new Artist("Lost Frequencies", "00.00", "Main Stage", "Religios");
        Artist vini = new Artist("Vini Vici", "2.30", "Main Stage", "pshi");
        Artist steve = new Artist("Steve Aoki", "3.45", "Main Stage", "K-Pop");
        Artist nicolae1 = new Artist("Nicolae Guta", "00.00", "Main Stage", "manele");
        Artist nicolae2 = new Artist("Nicolae Guta", "00.00", "Main Stage", "manele");
        Artist nicolae3 = new Artist("Nicolae Guta", "00.00", "Main Stage", "manele");

        day1.numeleZilei = "Day 1";
        if (day1.artisti.isEmpty()) {
            day1.artisti.add(nane);
            day1.artisti.add(valentino);
        }
        day2.numeleZilei = "Day 2";
        if (day2.artisti.isEmpty()) {
            day2.artisti.add(nicolae1);
            day2.artisti.add(vini);
        }

        //192.168.99.172:8080/getArtistByDay/day1

        day3.numeleZilei = "Day 3";
        if (day3.artisti.isEmpty()) {
            day3.artisti.add(salvatore);
            day3.artisti.add(nicolae2);
        }
        day4.numeleZilei = "Day 4";
        if (day4.artisti.isEmpty()) {
            day4.artisti.add(lost);
            day4.artisti.add(nicolae3);
            day4.artisti.add(steve);
        }

    }
}
