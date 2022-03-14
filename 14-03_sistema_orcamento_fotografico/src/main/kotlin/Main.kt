import classes_filhas.*

fun main() {

    var lista = Lista_Orcamentos()

    while (true) {
        println("Escolha entre as opções abaixo:" +
                "\n\n1 - Ensaio de Casamento" +
                "\n2 - Ensaio de Formatura" +
                "\n3 - Ensaio Familiar" +
                "\n4 - Ensaio de Casal" +
                "\n5 - Ensaio Pessoal" +
                "\n6 - Ensaio Personalizado" +
                "\nSAIR - Digite outro número qualquer"
        )
        try {
            var opc = readLine()!!.toInt()

            when(opc){
                1 -> {

                    println("Digite seu nome: ")
                    var nome = readLine()!!

                    println("Digite um nome de usuário: ")
                    var usuario = readLine()!!

                    println("Digite seu telefone: ")
                    var tel = readLine()!!

                    println("Digite seu e-mail: ")
                    var email = readLine()!!

                    lista.orcCasamento[usuario] = Casamento(nome, tel, email)

                    lista.orcCasamento[usuario]!!.quant()

                    lista.orcCasamento[usuario]!!.periodo()

                    lista.orcCasamento[usuario]!!.local()

                    lista.orcCasamento[usuario]!!.tempo()

                    lista.orcCasamento[usuario]!!.formato()


                    println("***ORÇAMENTO***" +
                            "\n\nUsuário: $usuario" +
                            "\nNome: $nome" +
                            "\nEmail: $email" +
                            "\nTelefone: $tel" +
                            "\nTipo de ensaio: Ensaio de Casamento" +
                            "\nLocação: ${lista.orcCasamento[usuario]!!.localEsc}" +
                            "\nQuantidade de Fotos: ${lista.orcCasamento[usuario]!!.quantidade}" +
                            "\nQuantidade de Fotos Impressas: ${lista.orcCasamento[usuario]!!.quantImp}" +
                            "\nTempo de entrega: ${lista.orcCasamento[usuario]!!.tempoEsc} dias" +
                            "\nTOTAL: R$${lista.orcCasamento[usuario]!!.totalFotos}")

                    break
                }

                2 -> {

                    println("Digite seu nome: ")
                    var nome = readLine()!!

                    println("Digite um nome de usuário: ")
                    var usuario = readLine()!!

                    println("Digite seu telefone: ")
                    var tel = readLine()!!

                    println("Digite seu e-mail: ")
                    var email = readLine()!!

                    lista.orcFormatura[usuario] = Formatura(nome, tel, email)

                    lista.orcFormatura[usuario]!!.quant()

                    lista.orcFormatura[usuario]!!.periodo()

                    lista.orcFormatura[usuario]!!.local()

                    lista.orcFormatura[usuario]!!.tempo()

                    lista.orcFormatura[usuario]!!.formato()


                    println("***ORÇAMENTO***" +
                            "\n\nUsuário: $usuario" +
                            "\nNome: $nome" +
                            "\nEmail: $email" +
                            "\nTelefone: $tel" +
                            "\nTipo de ensaio: Ensaio de Formatura" +
                            "\nLocação: ${lista.orcFormatura[usuario]!!.localEsc}" +
                            "\nQuantidade de Fotos: ${lista.orcFormatura[usuario]!!.quantidade}" +
                            "\nQuantidade de Fotos Impressas: ${lista.orcFormatura[usuario]!!.quantImp}" +
                            "\nTempo de entrega: ${lista.orcFormatura[usuario]!!.tempoEsc} dias" +
                            "\nTOTAL: R$${lista.orcFormatura[usuario]!!.totalFotos}")

                    break
                }

                3 -> {

                    println("Digite seu nome: ")
                    var nome = readLine()!!

                    println("Digite um nome de usuário: ")
                    var usuario = readLine()!!

                    println("Digite seu telefone: ")
                    var tel = readLine()!!

                    println("Digite seu e-mail: ")
                    var email = readLine()!!

                    lista.orcFamilia[usuario] = Família(nome, tel, email)

                    lista.orcFamilia[usuario]!!.quant()

                    lista.orcFamilia[usuario]!!.periodo()

                    lista.orcFamilia[usuario]!!.local()

                    lista.orcFamilia[usuario]!!.tempo()

                    lista.orcFamilia[usuario]!!.formato()


                    println("***ORÇAMENTO***" +
                            "\n\nUsuário: $usuario" +
                            "\nNome: $nome" +
                            "\nEmail: $email" +
                            "\nTelefone: $tel" +
                            "\nTipo de ensaio: Ensaio de Família" +
                            "\nLocação: ${lista.orcFamilia[usuario]!!.localEsc}" +
                            "\nQuantidade de Fotos: ${lista.orcFamilia[usuario]!!.quantidade}" +
                            "\nQuantidade de Fotos Impressas: ${lista.orcFamilia[usuario]!!.quantImp}" +
                            "\nTempo de entrega: ${lista.orcFamilia[usuario]!!.tempoEsc} dias" +
                            "\nTOTAL: R$${lista.orcFamilia[usuario]!!.totalFotos}")

                    break
                }

                4 -> {

                    println("Digite seu nome: ")
                    var nome = readLine()!!

                    println("Digite um nome de usuário: ")
                    var usuario = readLine()!!

                    println("Digite seu telefone: ")
                    var tel = readLine()!!

                    println("Digite seu e-mail: ")
                    var email = readLine()!!

                    lista.orcCasal[usuario] = Casal(nome, tel, email)

                    lista.orcCasal[usuario]!!.quant()

                    lista.orcCasal[usuario]!!.periodo()

                    lista.orcCasal[usuario]!!.local()

                    lista.orcCasal[usuario]!!.tempo()

                    lista.orcCasal[usuario]!!.formato()

                    println("***ORÇAMENTO***" +
                            "\n\nUsuário: $usuario" +
                            "\nNome: $nome" +
                            "\nEmail: $email" +
                            "\nTelefone: $tel" +
                            "\nTipo de ensaio: Ensaio de Casal" +
                            "\nLocação: ${lista.orcCasal[usuario]!!.localEsc}" +
                            "\nQuantidade de Fotos: ${lista.orcCasal[usuario]!!.quantidade}" +
                            "\nQuantidade de Fotos Impressas: ${lista.orcCasal[usuario]!!.quantImp}" +
                            "\nTempo de entrega: ${lista.orcCasal[usuario]!!.tempoEsc} dias" +
                            "\nTOTAL: R$${lista.orcCasal[usuario]!!.totalFotos}")

                    break
                }

                5 -> {

                    println("Digite seu nome: ")
                    var nome = readLine()!!

                    println("Digite um nome de usuário: ")
                    var usuario = readLine()!!

                    println("Digite seu telefone: ")
                    var tel = readLine()!!

                    println("Digite seu e-mail: ")
                    var email = readLine()!!

                    lista.orcPessoal[usuario] = Pessoal(nome, tel, email)

                    lista.orcPessoal[usuario]!!.quant()

                    lista.orcPessoal[usuario]!!.periodo()

                    lista.orcPessoal[usuario]!!.local()

                    lista.orcPessoal[usuario]!!.tempo()

                    lista.orcPessoal[usuario]!!.formato()


                    println("***ORÇAMENTO***" +
                            "\n\nUsuário: $usuario" +
                            "\nNome: $nome" +
                            "\nEmail: $email" +
                            "\nTelefone: $tel" +
                            "\nTipo de ensaio: Ensaio Pessoal" +
                            "\nLocação: ${lista.orcPessoal[usuario]!!.localEsc}" +
                            "\nQuantidade de Fotos: ${lista.orcPessoal[usuario]!!.quantidade}" +
                            "\nQuantidade de Fotos Impressas: ${lista.orcPessoal[usuario]!!.quantImp}" +
                            "\nTempo de entrega: ${lista.orcPessoal[usuario]!!.tempoEsc} dias" +
                            "\nTOTAL: R$${lista.orcPessoal[usuario]!!.totalFotos}")

                    break

                }

                6 -> {

                    println("Digite seu nome: ")
                    var nome = readLine()!!

                    println("Digite um nome de usuário: ")
                    var usuario = readLine()!!

                    println("Digite seu telefone: ")
                    var tel = readLine()!!

                    println("Digite seu e-mail: ")
                    var email = readLine()!!

                    lista.orcPersonalizado[usuario] = Personalizado(nome, tel, email)

                    println("Muito obrigado $nome pelo cadastro! Avaliaremos de forma" +
                            " personalizada seu ensaio, para isso entraremos em contato " +
                            "através do telefone $tel ou pelo e-mail $email.")

                    break
                }

                else -> break

            }

        } catch (e: Exception) {
            println("Escolha inválida.")
        }
    }

}