package one.digionebank.testes

import one.digionebank.Analista

fun main() {
    val joao = Analista(nome="Joao Pedro", cpf="467.456.456-12", 2000.00)
    ImprimeRelatorioFuncionario.imprime(joao)
}


