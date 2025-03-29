package com.wjahat.fragrances.repository;

import com.wjahat.fragrances.model.Perfume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PerfumeRepository extends JpaRepository<Perfume, Long> {
    List<Perfume> findByInWishlist(boolean inWishlist);
}
