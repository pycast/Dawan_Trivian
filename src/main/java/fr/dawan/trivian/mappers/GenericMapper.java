package fr.dawan.trivian.mappers;

public interface GenericMapper<E,D> {
    D toDto(E entity);
    E toEntity(D dto);
}