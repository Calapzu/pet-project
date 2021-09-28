package co.com.sofka.pet_project.stock;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.pet_project.stock.value.CantidadMateriaPrima;
import co.com.sofka.pet_project.stock.value.MateriaPrimaId;
import co.com.sofka.pet_project.stock.value.NombreMateriaPrima;

import java.util.Objects;

public class MateriaPrima extends Entity<MateriaPrimaId> {

    private NombreMateriaPrima nombreMateriaPrima;
    private CantidadMateriaPrima cantidadMateriaPrima;

    public MateriaPrima(MateriaPrimaId entityId, NombreMateriaPrima nombreMateriaPrima, CantidadMateriaPrima cantidadMateriaPrima) {
        super(entityId);
        this.nombreMateriaPrima = nombreMateriaPrima;
        this.cantidadMateriaPrima = cantidadMateriaPrima;
    }

    //Luego de haber instaciado las clases de objeto de valor de NombreMateriaPrima y CantidadMateriaPrima, y de haberlas colocado en el
    //constructor y colocado los getter de cada uno, luego se crean los comportamientos de la entidad
    public void agregarMateriaPrima(NombreMateriaPrima nombreMateriaPrima, CantidadMateriaPrima cantidadMateriaPrima){
        this.nombreMateriaPrima = Objects.requireNonNull(nombreMateriaPrima);
        this.cantidadMateriaPrima = Objects.requireNonNull(cantidadMateriaPrima);

    }

    public void sacarMateriaPrima(NombreMateriaPrima nombreMateriaPrima, CantidadMateriaPrima cantidadMateriaPrima){
        this.nombreMateriaPrima = Objects.requireNonNull(nombreMateriaPrima);
        this.cantidadMateriaPrima = Objects.requireNonNull(cantidadMateriaPrima);

    }

    public NombreMateriaPrima nombreMateriaPrima() {
        return nombreMateriaPrima;
    }

    public CantidadMateriaPrima cantidadMateriaPrima() {
        return cantidadMateriaPrima;
    }
}
