package com.mipagina.halls_service.dto;

import java.util.List;

public class HallDTO {
    private Long idHalls;
    private String name;
    private int capacity;
    private List<TableDTO> listTables;

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

    public List<TableDTO> getListTables() {
        return listTables;
    }

    public void setListTables(List<TableDTO> listTables) {
        this.listTables = listTables;
    }

    public HallDTO() {
    }

    public HallDTO(Long idHalls, String name, int capacity, List<TableDTO> listTables) {
        this.idHalls = idHalls;
        this.name = name;
        this.capacity = capacity;
        this.listTables = listTables;
    }
}
