package mx.edu.itses.icz.dbiv.service;

import lombok.RequiredArgsConstructor;
import mx.edu.itses.icz.dbiv.model.Producto;
import mx.edu.itses.icz.dbiv.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductoService {

    private final ProductoRepository productoRepository;

    /**
     * Recupera todos los documentos BSON de la colección 'productos'
     * y los mapea a una lista de objetos Java.
     */
    public List<Producto> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }
}