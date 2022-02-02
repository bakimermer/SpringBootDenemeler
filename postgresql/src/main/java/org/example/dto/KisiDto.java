package org.example.dto;

import lombok.Data;
import org.example.entity.Adres;

import java.util.List;

@Data
public class KisiDto {

    private Long id;
    private String ad;
    private String soyad;
    private List<String> adresler;
}
