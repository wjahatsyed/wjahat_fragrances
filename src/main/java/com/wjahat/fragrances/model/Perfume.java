package com.wjahat.fragrances.model;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "perfumes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Perfume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String brand;

    @Column(columnDefinition = "TEXT")
    private String notes;

    private String type;
    private BigDecimal price;

    private String imagePath; // Storing file path, not actual image

    @Column(name = "created_at", updatable = false, nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    private boolean inWishlist;  // New field: true if perfume is in wishlist, false if in collection
}
