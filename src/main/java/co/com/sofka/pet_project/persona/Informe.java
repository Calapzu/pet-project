package co.com.sofka.pet_project.persona;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.pet_project.persona.value.DescripcionInforme;
import co.com.sofka.pet_project.persona.value.InformeId;

import java.util.Objects;

public class Informe extends Entity<InformeId> {

    private DescripcionInforme descripcionInforme ;

    public Informe(InformeId entityId, DescripcionInforme descripcionInforme) {
        super(entityId);
        this.descripcionInforme = descripcionInforme;
    }

    public void actualizaDescripcionInforme(DescripcionInforme descripcionInforme){
        this.descripcionInforme = Objects.requireNonNull(descripcionInforme);
    }

    public void mostrarInforme(DescripcionInforme descripcionInforme){
        this.descripcionInforme = Objects.requireNonNull(descripcionInforme);
    }

    public DescripcionInforme descripcion() {
        return descripcionInforme;
    }
}
