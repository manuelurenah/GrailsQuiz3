package grailsquiz3

class Evento {

    String nombre
    Date fechaInicio
    Date fechaFin

    static hasMany = [usuarios: Usuario]

    static constraints = {
        nombre blank: false
        fechaInicio blank: false
        fechaFin blank: false
    }
}
