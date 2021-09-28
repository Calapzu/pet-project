package co.com.sofka.pet_project.jefe.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.pet_project.jefe.value.Nombre;

public class NombreCambiado extends DomainEvent {
    private final Nombre nombre;

    public NombreCambiado(Nombre nombre) {
        super("sofka.jefe.nombrecambiado");
        this.nombre = nombre;
    }

    public Nombre getNombre(){
        return nombre;
    }
}
