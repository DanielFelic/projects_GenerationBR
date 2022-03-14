package classes_pai

abstract class Fotos (
    override val nome: String, override val tel: String,
    override val email: String
) : Cliente  {

    open var valorFotos = 0
    var totalFotos = 0
    var quantidade = 0

    fun quant(): Int {



        while (true) {
            println("Digite a quantidade de fotos")
            try {
                quantidade = readLine()!!.toInt()
                break

            } catch (e: Exception) {
                println("Quantidade inválida.")
            }
        }
        if (quantidade > 0) {
            totalFotos = quantidade * valorFotos

        }
        return totalFotos
    }

    var periodoEsc = ""

    fun periodo(): String {
        var op = 0

        while (true) {
            println(
                "Em qual período o ensaio será realizado?" +
                        "\n1 - Manhã" +
                        "\n2 - Tarde" +
                        "\n3 - Noite"
            )

            try {
                op = readLine()!!.toInt()
                when (op) {
                    1 -> {
                        periodoEsc = "Manhã"
                        break
                    }
                    2 -> {
                        periodoEsc = "Tarde"
                        break
                    }
                    3 -> {
                        periodoEsc = "Noite"
                        break
                    }
                    else -> {
                        println("Escolha Inválida.")
                    }
                }
            } catch (e: Exception) {
                println("Escolha Inválida.")
            }

        }
        return periodoEsc
    }

    var localEsc = ""

    fun local(): String {
        var op = 0

        while (true) {
            println(
                "O ensaio será realizado ao ar livre?" +
                        "\n1 - Sim" +
                        "\n2 - Não")
            try {
                op = readLine()!!.toInt()
                when (op) {
                    1 -> {
                        localEsc = "Ao ar livre"
                        break
                    }
                    2 -> {
                        localEsc = "Local fechado"
                        break
                    }

                    else -> {
                        println("Escolha inválida")
                    }
                }

            } catch (e: Exception) {
                println("Escolha Inválida.")
            }
        }
        return localEsc
    }

    var tempoEsc = 0

    fun tempo(): Int {

        var op = 0

        while (true) {
            println(
                "\n1 - Entrega Emergencial (7 dias)" +
                        "\n2 - Entrega Rápida (15 dias)" +
                        "\n3 - Entrega Padrão (30 dias)" +
                        "\nEscolha o prazo de entrega:")
            try {
                op = readLine()!!.toInt()
                when (op) {
                    1 -> {
                        tempoEsc = 7
                        break
                    }
                    2 -> {
                        tempoEsc = 15
                        break
                    }
                    3 -> {
                        tempoEsc = 30
                        break
                    }
                    else -> {
                        println("Escolha Inválida.")
                    }
                }
            } catch (e: Exception) {
                println("Escolha Inválida.")
            }

        }
        return tempoEsc
    }

    var formatoEsc = ""
    var quantImp = 0

    fun formato(): String {
        var op = 0

        while (true) {
            println(
                "1 - Entrega Digital" +
                        "\n2 - Entrega Impressa" +
                        "\nEscolha o formato da entrega:")
            try {
                op = readLine()!!.toInt()
                when (op) {
                    1 -> {
                        formatoEsc = "Entrega Digital"
                        break
                    }
                    2 -> {
                        println("Digite a quantidade de fotos impressas:")

                        formatoEsc = "Entrega Impressa"
                        quantImp = readLine()!!.toInt()
                        break
                    }

                    else -> {
                        println("Escolha inválida")
                    }
                }

            } catch (e: Exception) {
                println("Escolha Inválida.")
            }
        }
        return formatoEsc
    }

}