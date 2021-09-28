package co.com.sofka.pet_project.jefe.value;

import co.com.sofka.domain.generic.Identity;

public class RegistroId extends Identity {
    public RegistroId(){
    }

    private RegistroId(String id){
        super(id);
    }

    public static RegistroId of(String id){
        return new RegistroId(id);
    }
}
