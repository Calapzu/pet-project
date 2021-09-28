package co.com.sofka.pet_project.stock;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.pet_project.stock.events.*;
import co.com.sofka.pet_project.stock.value.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Stock extends AggregateEvent<StockId> {

    protected NombreStock nombreStock;
    protected Set<Producto> productos;
    protected Set<MateriaPrima> materiaPrimas;

    public Stock(StockId entityId, NombreStock nombreStock) {
        super(entityId);
        //Luego de hanber creado el evento de dominio vengo y utilizo este metodo para que halla una consecuencia de persona creada
        appendChange(new StockCreado(nombreStock)).apply();
    }

    private Stock(StockId entityId){
        super(entityId);
        subscribe(new StockChange(this));

    }

    public static Stock from(StockId stockId, List<DomainEvent> events){
        var stock = new Stock(stockId);
        events.forEach(stock::applyEvent);
        return stock;
    }

    public void agregarProducto(ProductoId entityId, NombreProducto nombreProducto, CantidadProducto cantidadProducto) {
        //Se hace la validacion de que los objetos no sean nulos
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombreProducto);
        Objects.requireNonNull(cantidadProducto);
        appendChange(new ProductoAgregado(entityId, nombreProducto, cantidadProducto)).apply();
    }

    public void sacarProducto(ProductoId entityId, CantidadProducto cantidadProducto) {
        //Se hace la validacion de que los objetos no sean nulos
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(cantidadProducto);
        appendChange(new ProductoSacado(entityId, cantidadProducto)).apply();
    }

    //Hallar productos por identificador
    public Optional<Producto> getProductoPorId(ProductoId entityId){
        return productos()
                .stream()
                .filter(producto -> producto.identity().equals(entityId))
                .findFirst();
    }


    public void agregarMateriaPrima(MateriaPrimaId entityId, NombreMateriaPrima nombreMateriaPrima, CantidadMateriaPrima cantidadMateriaPrima) {
        //Se hace la validacion de que los objetos no sean nulos
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombreMateriaPrima);
        Objects.requireNonNull(cantidadMateriaPrima);
        appendChange(new MateriaPrimaAgregada(entityId, nombreMateriaPrima, cantidadMateriaPrima)).apply();
    }

    public void sacarMateriaPrima(MateriaPrimaId entityId, CantidadMateriaPrima cantidadMateriaPrima) {
        //Se hace la validacion de que los objetos no sean nulos
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(cantidadMateriaPrima);
        appendChange(new MateriaPrimaSacada(entityId, cantidadMateriaPrima)).apply();
    }


    //Hallar productos por identificador
    public Optional<MateriaPrima> getMateriaPorId(MateriaPrimaId entityId){
        return materiaPrimas()
                .stream()
                .filter(materiaPrima -> materiaPrima.identity().equals(entityId))
                .findFirst();
    }



    public NombreStock nombreStock() {
        return nombreStock;
    }

    public Set<Producto> productos() {
        return productos;
    }

    public Set<MateriaPrima> materiaPrimas() {
        return materiaPrimas;
    }
}
