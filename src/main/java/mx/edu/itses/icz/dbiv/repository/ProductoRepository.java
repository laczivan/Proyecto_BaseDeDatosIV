package mx.edu.itses.icz.dbiv.repository;

import mx.edu.itses.icz.dbiv.model.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends MongoRepository<Producto, String> {
    // Hereda automáticamente operaciones CRUD como findAll(), save(), findById() y deleteById()
}