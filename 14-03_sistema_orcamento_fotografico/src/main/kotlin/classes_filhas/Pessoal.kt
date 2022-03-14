package classes_filhas

import classes_pai.Fotos

class Pessoal (nome: String, tel: String, email: String)
    : Fotos(nome, tel, email)  {

    override var valorFotos = 10
}