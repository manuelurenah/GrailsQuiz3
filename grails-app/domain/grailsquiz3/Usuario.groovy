package grailsquiz3

class Usuario {

    String nombre
    String apellido
    String cedula
    String email
    Date fechaNacimiento

    static constraints = {
        nombre blank: false
        apellido blank: false
        email email: true
    }

    @Override
    String toString() {
        return nombre + ' ' + apellido;
    }
}
