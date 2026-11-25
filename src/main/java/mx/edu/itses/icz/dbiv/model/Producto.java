package mx.edu.itses.icz.dbiv.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "productos")
public class Producto {

    @Id
    private String id; // Mapea automáticamente al campo "_id" de MongoDB

    private String nombre;
    private Double precio;
    private String categoria;
    private Integer stock;
}