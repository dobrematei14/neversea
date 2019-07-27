package ro.esolutions.neversea;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@RestController
public class ConectorExtern {

    @GetMapping("/getArtistByDay/{day}")
    public List<Artist> getArtistByDay(
            @PathVariable String day) throws Exception {
        LineUp.initLineUp();
        if (day.equals("day1")) {
            return LineUp.day1.artisti;
        }
        if (day.equals("day2")) {
            return LineUp.day2.artisti;
        }
        if (day.equals("day3")) {
            return LineUp.day3.artisti;
        }
        if (day.equals("day4")) {
            return LineUp.day4.artisti;
        }
        throw new Exception();
    }

    @GetMapping("/getArtistByGenre/{genre}")
    public List<Artist> getArtistByGenre(@PathVariable String genre) {
        LineUp.initLineUp();
        Set<Artist> totiArtistii = new HashSet<>();
        totiArtistii.addAll(LineUp.day1.artisti);
        totiArtistii.addAll(LineUp.day2.artisti);
        totiArtistii.addAll(LineUp.day3.artisti);
        totiArtistii.addAll(LineUp.day4.artisti);
        List<Artist> artisti = new ArrayList<>();
        for (Artist i : totiArtistii) {
            if (i.genMuzical.equalsIgnoreCase(genre)) {
                artisti.add(i);
            }
        }
        return artisti;
    }

    @GetMapping("/getArtistByStage/{stage}")
    public List<Artist> getArtistByStage(
            @PathVariable String stage) throws Exception {
        LineUp.initLineUp();

        Set<Artist> totiArtistii = new HashSet<>();
        totiArtistii.addAll(LineUp.day1.artisti);
        totiArtistii.addAll(LineUp.day2.artisti);
        totiArtistii.addAll(LineUp.day3.artisti);
        totiArtistii.addAll(LineUp.day4.artisti);
        List<Artist> artisti = new ArrayList<>();
        for (Artist i : totiArtistii) {
            String currentArtistStage = i.scena.replaceAll("\\s+", "");
            if (currentArtistStage.equalsIgnoreCase(stage)) {
                artisti.add(i);
            }

        }
            return artisti;
    }
    @GetMapping("/getArtist/{name}")
    public List<Artist> getArtist(
            @PathVariable String name) throws Exception {
        LineUp.initLineUp();

        Set<Artist> totiArtistii = new HashSet<>();
        totiArtistii.addAll(LineUp.day1.artisti);
        totiArtistii.addAll(LineUp.day2.artisti);
        totiArtistii.addAll(LineUp.day3.artisti);
        totiArtistii.addAll(LineUp.day4.artisti);
        List<Artist> artisti = new ArrayList<>();
        for (Artist i : totiArtistii) {
            String currentArtist = i.nume.toLowerCase().replaceAll("\\s+", "");
            if (currentArtist.contains(name.toLowerCase())) {
                artisti.add(i);
            }

        }
        return artisti;
    }

    @PostMapping("/insertArtist")
    public void insertArtistOnDay(@RequestBody Artist artist, String day) {
        // imi ia ziua respectiva
        //adauga artistul pe ziua respectiva
    }
}
