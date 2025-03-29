package com.wjahat.fragrances.controller;

import com.wjahat.fragrances.model.Perfume;
import com.wjahat.fragrances.service.PerfumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/perfumes")
@CrossOrigin("*")
public class PerfumeController {

    @Autowired
    private PerfumeService perfumeService;

    @GetMapping
    public List<Perfume> getAllPerfumes() {
        return perfumeService.getAllPerfumes();
    }

    @GetMapping("/wishlist")
    public List<Perfume> getWishlistPerfumes() {
        return perfumeService.getWishlistPerfumes();
    }

    @GetMapping("/collection")
    public List<Perfume> getCollectionPerfumes() {
        return perfumeService.getCollectionPerfumes();
    }

    @PostMapping
    public Perfume addPerfume(@RequestBody Perfume perfume) {
        return perfumeService.savePerfume(perfume);
    }
}
