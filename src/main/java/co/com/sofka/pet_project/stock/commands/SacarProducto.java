package co.com.sofka.pet_project.stock.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.pet_project.stock.value.CantidadProducto;
import co.com.sofka.pet_project.stock.value.ProductoId;

public class SacarProducto extends Command {

    private final ProductoId entityId;
    private final CantidadProducto cantidadProducto;

    public SacarProducto(ProductoId entityId, CantidadProducto cantidadProducto) {
        this.entityId = entityId;
        this.cantidadProducto = cantidadProducto;
    }

    public ProductoId getEntityId() {
        return entityId;
    }

    public CantidadProducto getCantidadProducto() {
        return cantidadProducto;
    }
}
