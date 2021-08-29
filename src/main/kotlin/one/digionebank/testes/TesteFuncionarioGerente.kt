package one.digionebank.testes

import one.digionebank.Gerente

fun main() {
    val clark = Gerente(nome="Clark Santos", cpf="467.456.456-12", 3300.00)

    ImprimeRelatorioFuncionario.imprime(clark)
}


