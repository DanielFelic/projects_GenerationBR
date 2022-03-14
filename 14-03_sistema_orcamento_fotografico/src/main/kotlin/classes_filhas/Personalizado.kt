package classes_filhas

import classes_pai.Cliente

class Personalizado (override val nome: String, override val tel: String,
                    override val email: String) : Cliente {
}