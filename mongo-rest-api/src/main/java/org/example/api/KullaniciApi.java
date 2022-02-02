package org.example.api;

import org.example.entity.Kullanici;
import org.example.repository.KullaniciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/kullanici")
public class KullaniciApi {

    @Autowired
    private KullaniciRepository kullaniciRepository;

    @PostConstruct
    public void init() {
        Kullanici kullanici = new Kullanici();
        kullanici.setAd("test");
        kullanici.setSoyad("xxx");

        kullaniciRepository.save(kullanici);
    }

    @PostMapping
    public ResponseEntity<Kullanici> ekle(@RequestBody Kullanici kullanici) {
        return ResponseEntity.ok(kullaniciRepository.save(kullanici));
    }

    @GetMapping
    public ResponseEntity<List<Kullanici>> tumunuListele() {
        return ResponseEntity.ok(kullaniciRepository.findAll());
    }

    @GetMapping("/getEkle")
    public ResponseEntity<String> ekleWithGet() {
        Kullanici kullanici = new Kullanici();
        kullanici.setAd("test");
        kullanici.setSoyad("xxx");

        kullaniciRepository.save(kullanici);

        return ResponseEntity.ok("Eklendi");
    }
}
