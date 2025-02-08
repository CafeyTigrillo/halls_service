package com.mipagina.halls_service.service;

import com.mipagina.halls_service.dto.HallDTO;
import com.mipagina.halls_service.model.Halls;

import java.util.List;

public interface IHallsService {
    public void saveHall(Halls halls);
    public List<Halls> listHalls();
    public Halls getHall(Long idHall);
    public void updateHall(Long idHall,Halls halls);
    public void deleteHall(Long idHall);

    public HallDTO getTablesHall(Long idHall);
}
