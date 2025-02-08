package com.mipagina.halls_service.service;

import com.mipagina.halls_service.dto.HallDTO;
import com.mipagina.halls_service.dto.TableDTO;
import com.mipagina.halls_service.model.Halls;
import com.mipagina.halls_service.repository.IHallsRepository;
import com.mipagina.halls_service.repository.ITableAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HallsService implements IHallsService{

    @Autowired
    private IHallsRepository hallsRepository;

    @Autowired
    private ITableAPI tableAPI;

    @Override
    public void saveHall(Halls halls) {
        hallsRepository.save(halls);
    }

    @Override
    public List<Halls> listHalls() {
        return hallsRepository.findAll();
    }

    @Override
    public Halls getHall(Long idHall) {
        return hallsRepository.findById(idHall).orElse(null);
    }

    @Override
    public void updateHall(Long idHall, Halls halls) {
        Halls halls1=this.getHall(idHall);
        halls1.setIdHalls(idHall);
        halls1.setName(halls.getName());
        halls1.setCapacity(halls.getCapacity());
        this.saveHall(halls1);
    }

    @Override
    public void deleteHall(Long idHall) {
        hallsRepository.deleteById(idHall);
    }

    @Override
    public HallDTO getTablesHall(Long idHall) {
        Halls halls=hallsRepository.findById(idHall).orElse(null);
        List<TableDTO> tableList=tableAPI.getTablesByHallId(idHall);
        HallDTO hallDTO=new HallDTO(halls.getIdHalls(),halls.getName(),halls.getCapacity(),tableList);
        return hallDTO;
    }
}
