class Transferencia {
    companion object {
        fun realizarTransferencia(origen: Persona, destino: Persona, numCuentaOrigen: String, numCuentaDestino: String, cantidad: Double): Boolean {
            val cuentaOrigen = origen.obtenerCuenta(numCuentaOrigen)
            val cuentaDestino = destino.obtenerCuenta(numCuentaDestino)

            if (cuentaOrigen != null && cuentaDestino != null) {
                if (cuentaOrigen.realizarPago(cantidad)) {
                    cuentaDestino.recibirAbono(cantidad)
                    return true
                }
            }
            return false
        }
    }
}