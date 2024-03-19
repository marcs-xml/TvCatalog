package br.com.learning.TvCatalog.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Tvs")
public class Tv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "brand", nullable = false, length = 255)
    private String brand;
    @Column(name = "model", nullable = false, length = 255)
    private String model;
    @Column(name = "quality", nullable = false, length = 255)
    private String quality;
    @Column(name = "inches", nullable = false, length = 255)
    private String inches;
    @Column(name = "amount", nullable = false, length = 255)
    private int amount;
    @Column(name = "price", nullable = false, length = 255)
    private float price;
    @Lob
    @Column(name = "image", columnDefinition="LONGBLOB")
    private byte[] image;
}
