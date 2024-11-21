class RepairShop : AbstractPhoneShop() {
    var repairOffered = false

    override fun welcome() {
        print("Добро пожаловать в ремонтную мастерскую ")
    }

    override fun chooseCity() {
        println("города Казань")
    }

    override fun choosePhoneModel() {
        if (!repairOffered) {
            println("У вас есть сломанный телефон. Хотите его отремонтировать? (да/нет)")
            val answer = readlnOrNull() ?: "нет"
            if (answer.equals("да", ignoreCase = true)) {
                repairOffered = true
                println("Ваш телефон успешно отремонтирован.")
            }
        } else {
            println("Не нуждаетесь в ремонте.")
        }
    }
}