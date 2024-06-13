package com.example.menu.entities;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "food")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class FoodEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;
}