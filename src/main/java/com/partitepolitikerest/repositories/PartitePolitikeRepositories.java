package com.partitepolitikerest.repositories;

import com.partitepolitikerest.dto.PartitePolitikeDto;
import com.partitepolitikerest.models.PartitePolitike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartitePolitikeRepositories extends JpaRepository<PartitePolitike, Long> {
}
