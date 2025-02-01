class Cuenta(val numeroCuenta: String, var saldo: Double) {

    fun consultarSaldo(): Double {
        return saldo
    }

    fun recibirAbono(cantidad: Double) {
        saldo += cantidad
    }

    fun realizarPago(cantidad: Double): Boolean {
        if (saldo >= cantidad) {
            saldo -= cantidad
            return true
        }
        return false
    }
}

