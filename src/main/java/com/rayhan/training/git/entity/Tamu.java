package com.rayhan.training.git.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity @Data
public class Tamu {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nama;
    private String  email;
}
