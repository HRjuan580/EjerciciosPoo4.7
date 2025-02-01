fun main() {
    // Crear una persona con DNI
    val persona = Persona("12345678A")

    // Crear dos cuentas
    val cuenta1 = Cuenta("ES123456789", 0.0)
    val cuenta2 = Cuenta("ES987654321", 700.0)

    // Agregar cuentas a la persona
    persona.agregarCuenta(cuenta1)
    persona.agregarCuenta(cuenta2)

    // Recibir nómina mensual en la primera cuenta
    cuenta1.recibirAbono(1100.0)

    // Pagar el alquiler con la segunda cuenta
    val pagoAlquilerExitoso = cuenta2.realizarPago(750.0)

    // Verificar si la persona es morosa
    if (persona.esMorosa()) {
        println("La persona es morosa.")
    } else {
        println("La persona no es morosa.")
    }

    // Realizar una transferencia de la primera cuenta a la segunda
    val transferenciaExitosa = Transferencia.realizarTransferencia(
        persona, persona, "ES123456789", "ES987654321", 300.0
    )

    if (transferenciaExitosa) {
        println("Transferencia realizada con éxito.")
    } else {
        println("No se pudo realizar la transferencia.")
    }

    // Verificar si la persona es morosa después de la transferencia
    if (persona.esMorosa()) {
        println("La persona es morosa después de la transferencia.")
    } else {
        println("La persona no es morosa después de la transferencia.")
    }

    // Mostrar saldos finales
    println("Saldo de la cuenta 1: ${cuenta1.consultarSaldo()}")
    println("Saldo de la cuenta 2: ${cuenta2.consultarSaldo()}")
}