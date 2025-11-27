package cz.czechitas.java2webapps.lekce10.service;

import cz.czechitas.java2webapps.lekce10.entity.Trida;
import cz.czechitas.java2webapps.lekce10.entity.Ucitel;
import cz.czechitas.java2webapps.lekce10.repository.UcitelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UciteleService {
    private final UcitelRepository ucitelRepository;

    public UciteleService(UcitelRepository ucitelRepository) {
        this.ucitelRepository = ucitelRepository;
    }

    /**
     * Vrací seznam všech učitelů.
     * @return Seznam učitelů.
     */
    public List<Ucitel> findAll() {
        return ucitelRepository.findAll();
    }

    /**
     * Vrací detail učitelů.
     * @param id Identifikátor učitele.
     * @return Detail učitele nebo {@code null}.
     */
    public Ucitel findById(int id) {
        return ucitelRepository.findById(id).orElse(null);
    }
}
