package mx.edu.itses.icz.dbiv.controller;

import lombok.RequiredArgsConstructor;
import mx.edu.itses.icz.dbiv.service.ProductoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ProductosController {

    private final ProductoService productoService;

    @GetMapping("/productos")
    public String index(Model model) {
        model.addAttribute("productos", productoService.obtenerTodosLosProductos());
        return "productos/index";
    }
}