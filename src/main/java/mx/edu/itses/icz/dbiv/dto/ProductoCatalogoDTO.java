package mx.edu.itses.icz.dbiv.dto;

public record ProductoCatalogoDTO(
        String id,
        String nombre,
        Double precio,
        String categoria,
        Integer stock
) {
}