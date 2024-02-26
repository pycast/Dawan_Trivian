package fr.dawan.trivian.business.generic;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173/")
public abstract class GenericController<
        D,
        S extends GenericService<D>
        > {
    protected final S service;

    @GetMapping
    public Page<D> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/{id}")
    public Optional<D> findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    public D saveOrUpdate(@RequestBody D dto) {
        return service.saveOrUpdate(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        service.deleteById(id);
    }
}