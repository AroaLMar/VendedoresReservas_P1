package com.example.VendedoresReservas.Controllers;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservasController {


    @PostMapping("/api/reservas/clientes/{codcli}/coches/{matricula}")
    public void reservarCoche(@PathVariable String codcli, @PathVariable String matricula) {
        System.out.println("El cliente:  "+codcli+ " ha reservado el coche con matricula: " +matricula);
    }

    @DeleteMapping("/api/reservas/clientes/{codcli}/coches/{matricula}")
    public void cancelarReserva(@PathVariable String codcli, @PathVariable String matricula) {
        System.out.println("El cliente: " + codcli + " ha cancelado la reserva del coche con matricula: " + matricula);
    }
}
