package mx.edu.itses.icz.dbiv.repository;

import mx.edu.itses.icz.dbiv.dto.ProductoCatalogoDTO;
import mx.edu.itses.icz.dbiv.model.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends MongoRepository<Producto, String> {

    /**
     * Aplica una proyección directa en MongoDB devolviendo únicamente
     * los campos definidos en ProductoCatalogoDTO.
     */
    @Query(
            value = "{}",
            fields = "{ '_id': 1, 'nombre': 1, 'precio': 1, 'categoria': 1, 'stock': 1 }"
    )
    List<ProductoCatalogoDTO> findAllCatalogo();
}