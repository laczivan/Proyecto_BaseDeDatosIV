package mx.edu.itses.icz.dbiv.service;

import lombok.RequiredArgsConstructor;
import mx.edu.itses.icz.dbiv.dto.ProductoCatalogoDTO;
import mx.edu.itses.icz.dbiv.model.Producto;
import mx.edu.itses.icz.dbiv.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductoService {

    private final ProductoRepository productoRepository;

    public List<ProductoCatalogoDTO> obtenerCatalogoProductos() {
        return productoRepository.findAllCatalogo();
    }

    public List<Producto> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }

    public Producto guardarProducto(Producto producto) {
        if (producto.getId() != null && producto.getId().isBlank()) {
            producto.setId(null);
        }
        return productoRepository.save(producto);
    }
    public Optional<Producto> obtenerProductoPorId(String id) {
        return productoRepository.findById(id);
    }
}