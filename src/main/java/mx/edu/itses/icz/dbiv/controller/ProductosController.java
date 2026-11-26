package mx.edu.itses.icz.dbiv.controller;

import lombok.RequiredArgsConstructor;
import mx.edu.itses.icz.dbiv.dto.ProductoCatalogoDTO;
import mx.edu.itses.icz.dbiv.model.Producto;
import mx.edu.itses.icz.dbiv.service.ProductoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class ProductosController {

    private final ProductoService productoService;

    @GetMapping("/productos")
    public String index(Model model) {
        List<ProductoCatalogoDTO> productos = productoService.obtenerCatalogoProductos();
        model.addAttribute("productos", productos);
        return "productos/index";
    }

    @PostMapping("/productos/nuevoProducto")
    public String nuevoProducto(@ModelAttribute Producto producto) {
        productoService.guardarProducto(producto);
        return "redirect:/productos";
    }

    @GetMapping("/productos/ver/{id}")
    public String verProducto(@PathVariable String id, Model model) {
        Optional<Producto> productoOpt = productoService.obtenerProductoPorId(id);
        if (productoOpt.isEmpty()) {
            return "redirect:/productos";
        }
        model.addAttribute("producto", productoOpt.get());
        return "productos/ver/detalle";
    }
}