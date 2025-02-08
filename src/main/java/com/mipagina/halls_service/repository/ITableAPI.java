package com.mipagina.halls_service.repository;

import com.mipagina.halls_service.dto.TableDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "tableLounge-service")
public interface ITableAPI {
    @GetMapping("/tables/{idTable}")
    public List<TableDTO> getTablesByHallId(@PathVariable("idTable") Long idTable);
}
