package com.example.bigstarcollectibles.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Robot {
    @Id
    private Integer id;
}
