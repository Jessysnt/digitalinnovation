package one.digionebank.testes

import one.digionebank.Cliente
import one.digionebank.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "Jose Silva",
        cpf="876.876.876-10",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)
}
