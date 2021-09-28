package co.com.sofka.pet_project.jefe;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.pet_project.jefe.value.CantidadDeInformes;
import co.com.sofka.pet_project.jefe.value.Nombre;
import co.com.sofka.pet_project.jefe.value.RegistroId;
import co.com.sofka.pet_project.persona.value.DescripcionInforme;

import java.util.Objects;

public class Regitro extends Entity<RegistroId> {

    private Nombre nombre;


    public Regitro(RegistroId entityId, Nombre nombre ) {
        super(entityId);
        this.nombre = nombre;
    }

    public void actualizaRegistro(RegistroId registroId, Nombre nombre){
        this.entityId = Objects.requireNonNull(registroId);
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void almacenarRegistro(RegistroId registroId, Nombre nombre, CantidadDeInformes cantidadDeInformes){
        this.entityId = Objects.requireNonNull(registroId);
        this.nombre = Objects.requireNonNull(nombre);
    }

    public Nombre nombre() {
        return nombre;
    }
}
