package com.partitepolitikerest.services;

import com.partitepolitikerest.dto.PartitePolitikeDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PartitePolitikeInterface {

    boolean add(PartitePolitikeDto partitePolitike);

    List<PartitePolitikeDto> getAll();

    PartitePolitikeDto getbyId(Long id);

    boolean update(Long id, PartitePolitikeDto updatePartitePolitike);

    boolean deleteById(Long id);

}
