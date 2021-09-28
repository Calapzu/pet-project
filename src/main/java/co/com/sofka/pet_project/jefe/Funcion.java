package co.com.sofka.pet_project.jefe;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.pet_project.jefe.value.Caracteristica;
import co.com.sofka.pet_project.jefe.value.Descripcion;
import co.com.sofka.pet_project.jefe.value.FuncionId;

import java.util.Objects;

public class Funcion extends Entity<FuncionId> {

    private Caracteristica caracteristica;
    private Descripcion descripcion;

    public Funcion(FuncionId entityId, Caracteristica caracteristica, Descripcion descripcion) {
        super(entityId);
        this.caracteristica = caracteristica;
        this.descripcion = descripcion;
    }

    public void actualizaDescripcion(Descripcion descripcion){
        this.descripcion = Objects.requireNonNull(descripcion);
    }

    public void actualizarCaracteristica(Caracteristica caracteristica){
        this.caracteristica = Objects.requireNonNull(caracteristica);
    }

    public Caracteristica caracteristica(){
        return caracteristica;
    }

    public Descripcion descripcion(){
        return descripcion;
    }
}
