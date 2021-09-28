package co.com.sofka.pet_project.stock.value;

import co.com.sofka.domain.generic.Identity;

public class MateriaPrimaId extends Identity {

    public MateriaPrimaId() {
    }

    public MateriaPrimaId(String id) {
        super(id);
    }

    public static MateriaPrimaId of(String id){
        return new MateriaPrimaId(id);
    }
}
