package com.example.VendedoresReservas.Controllers;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

public class VendedorController {


    @RestController
    public class SellerController {

        @PostMapping("/api/vendedores")
        public void aniadirVendedor(@Valid @RequestBody VendedorInput vendedor) {
            System.out.println("Se ha dado de alta al vendedor: "+vendedor);
        }

        @PutMapping("/api/vendedores/{codven}")
        public void modificarVendedor(@PathVariable String codven, @Valid @RequestBody VendedorUpdate vendedor) {
            System.out.println("Se ha modificado el vendedor: "+codven);
        }

        @DeleteMapping("/api/vendedores/{codven}")
        public void borrarVendedor(@PathVariable String codven) {
            System.out.println("Se ha borrado al vendedor: "+codven);
        }

        @GetMapping("/api/vendedores")
        public void visualizarVendedores() {
            System.out.println("Listado de vendedores: " );

        }
    }


}
