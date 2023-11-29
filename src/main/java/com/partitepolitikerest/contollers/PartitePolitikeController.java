package com.partitepolitikerest.contollers;


import com.partitepolitikerest.dto.PartitePolitikeDto;
import com.partitepolitikerest.services.PartitePolitikeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/partitepolitike")
@CrossOrigin(origins = "*")
public class PartitePolitikeController {
    private final PartitePolitikeService partitePolitikeService;

    public PartitePolitikeController(PartitePolitikeService partitePolitikeService) {
        this.partitePolitikeService = partitePolitikeService;
    }

    @GetMapping
    public List<PartitePolitikeDto> getAllPartite() {
        return partitePolitikeService.getAll();
    }

    @GetMapping("/{id}")
    public PartitePolitikeDto getPartitById(@PathVariable Long id) {

        return partitePolitikeService.getById(id);

    }

    @PostMapping
    public void addParti(@RequestBody PartitePolitikeDto partitePolitike) {
        partitePolitikeService.add(partitePolitike);
    }

    @PutMapping("/{id}")
    public void updatePartite(@PathVariable Long id, @RequestBody PartitePolitikeDto partitePolitikeDto) {
        partitePolitikeService.update(id, partitePolitikeDto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        partitePolitikeService.deleteById(id);
    }
}
