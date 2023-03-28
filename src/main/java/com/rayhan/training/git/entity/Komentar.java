package com.rayhan.training.git.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity @Data
public class Komentar {

    @Id @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_tamu")
    private Tamu tamu;

    private LocalDateTime waktu;

    private String pesan;
}
