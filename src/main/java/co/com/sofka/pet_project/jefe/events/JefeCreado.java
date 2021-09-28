package co.com.sofka.pet_project.jefe.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.pet_project.jefe.value.Cargo;
import co.com.sofka.pet_project.jefe.value.Email;
import co.com.sofka.pet_project.jefe.value.Nombre;

public class JefeCreado extends DomainEvent {

    private final Nombre nombre;
    private final Email email;
    private final Cargo cargo;

    public JefeCreado(Nombre nombre, Email email, Cargo cargo) {
        super("sofka.jefe.jefecreado");
        this.nombre = nombre;
        this.email = email;
        this.cargo = cargo;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Email getEmail() {
        return email;
    }

    public Cargo getCargo() {
        return cargo;
    }
}
