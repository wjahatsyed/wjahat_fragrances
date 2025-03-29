package com.wjahat.fragrances.service;

import com.wjahat.fragrances.model.Perfume;
import com.wjahat.fragrances.repository.PerfumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PerfumeService {

    @Autowired
    private PerfumeRepository perfumeRepository;

    public List<Perfume> getAllPerfumes() {
        return perfumeRepository.findAll();
    }

    public List<Perfume> getWishlistPerfumes() {
        return perfumeRepository.findByInWishlist(true);
    }

    public List<Perfume> getCollectionPerfumes() {
        return perfumeRepository.findByInWishlist(false);
    }

    public Perfume savePerfume(Perfume perfume) {
        return perfumeRepository.save(perfume);
    }
}
