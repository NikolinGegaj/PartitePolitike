package com.partitepolitikerest.mappers;


import com.partitepolitikerest.dto.PartitePolitikeDto;
import com.partitepolitikerest.models.PartitePolitike;
import org.springframework.stereotype.Component;

@Component
public class PartitePolitikeMapper {

    public PartitePolitike toEntity(PartitePolitikeDto dto) {
        PartitePolitike partitePolitike = new PartitePolitike();
        partitePolitike.setEmriZyrtar(dto.getEmriZyrtar());
        partitePolitike.setAkronimi(dto.getAkronimi());
        partitePolitike.setAdresa(dto.getAdresa());
        return partitePolitike;
    }

    public PartitePolitikeDto toDto(PartitePolitike partitePolitike) {
        PartitePolitikeDto dto = new PartitePolitikeDto();
        dto.setEmriZyrtar(partitePolitike.getEmriZyrtar());
        dto.setAkronimi(partitePolitike.getAkronimi());
        dto.setAdresa(partitePolitike.getAdresa());
        return dto;

    }
}
