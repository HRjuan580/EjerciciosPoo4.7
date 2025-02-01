class Persona(val dni: String) {
    private val cuentas: Array<Cuenta?> = arrayOfNulls(3)

    fun agregarCuenta(cuenta: Cuenta): Boolean {
        for (i in cuentas.indices) {
            if (cuentas[i] == null) {
                cuentas[i] = cuenta
                return true
            }
        }
        return false
    }

    fun esMorosa(): Boolean {
        for (cuenta in cuentas) {
            if (cuenta != null && cuenta.consultarSaldo() < 0) {
                return true
            }
        }
        return false
    }

    fun obtenerCuenta(numeroCuenta: String): Cuenta? {
        for (cuenta in cuentas) {
            if (cuenta != null && cuenta.numeroCuenta == numeroCuenta) {
                return cuenta
            }
        }
        return null
    }
}