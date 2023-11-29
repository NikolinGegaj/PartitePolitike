package com.partitepolitikerest.services;

import com.partitepolitikerest.dto.PartitePolitikeDto;
import com.partitepolitikerest.mappers.PartitePolitikeMapper;
import com.partitepolitikerest.models.PartitePolitike;
import com.partitepolitikerest.repositories.PartitePolitikeRepositories;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartitePolitikeService {

    private final PartitePolitikeRepositories partitePolitikeRepositories;

    private final PartitePolitikeMapper partitePolitikeMapper;

    public PartitePolitikeService(PartitePolitikeRepositories partitePolitikeRepositories, PartitePolitikeMapper partitePolitikeMapper) {
        this.partitePolitikeRepositories = partitePolitikeRepositories;
        this.partitePolitikeMapper = partitePolitikeMapper;

    }

    public boolean add(PartitePolitikeDto partitePolitikeDto) {
        var entity = partitePolitikeMapper.toEntity(partitePolitikeDto);
        partitePolitikeRepositories.save(entity);
        return true;
    }

    public List<PartitePolitikeDto> getAll() {
        return partitePolitikeRepositories.findAll().stream().map(partitePolitikeMapper::toDto).toList();
    }

    public PartitePolitikeDto getById(Long id) {
        var optionalEntity = partitePolitikeRepositories.findById(id);
        if (optionalEntity.isEmpty())
            throw new EntityNotFoundException("Partia me kete id nuk u gjet" + id);
        var entity = optionalEntity.get();
        return partitePolitikeMapper.toDto(entity);
    }

    public boolean update(Long id, PartitePolitikeDto partitePolitikeDto) {
        var optionalPartitePolitike = partitePolitikeRepositories.findById(id);
        if (optionalPartitePolitike.isEmpty())
            throw new EntityNotFoundException("Partia me kete id nuk u gjet" + id);

        var entity = optionalPartitePolitike.get();

        entity.setEmriZyrtar(partitePolitikeDto.getEmriZyrtar());
        entity.setAkronimi(partitePolitikeDto.getAkronimi());
        entity.setAdresa(partitePolitikeDto.getAdresa());
        partitePolitikeRepositories.save(entity);
        return true;
    }


    public boolean deleteById(Long id){
        partitePolitikeRepositories.deleteById(id);
        return true;
    }

}

