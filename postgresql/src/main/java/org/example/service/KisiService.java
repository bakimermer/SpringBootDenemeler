package org.example.service;

import org.example.dto.KisiDto;
import org.example.entity.Kisi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface KisiService {

    KisiDto save(KisiDto kisiDto);

    void delete(Long id);

    List<KisiDto> getAll();

    Page<KisiDto> getAll(Pageable pageable);
}
