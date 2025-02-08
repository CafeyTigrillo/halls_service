package com.mipagina.halls_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Halls {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHalls;
    private String name;
    private int capacity;

    public Long getIdHalls() {
        return idHalls;
    }

    public void setIdHalls(Long idHalls) {
        this.idHalls = idHalls;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Halls(Long idHalls, String name, int capacity) {
        this.idHalls = idHalls;
        this.name = name;
        this.capacity = capacity;
    }

    public Halls() {
    }
}
