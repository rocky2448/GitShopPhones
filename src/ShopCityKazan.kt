class ShopCityKazan(private val cityName: String) : AbstractPhoneShop() {
    val listPhoneKazan = mapOf(
        "SAMSUNG S6" to 43000,
        "XIAOMI NOTE 4" to 28000,
        "POCO M4" to 23000,
        "ONE PLUS 9T" to 52000,
        "ZTE BLADE 20 SMART" to 16000
    )

    override fun welcome() {
        println("Добро пожаловать в магазин телефонов в городе $cityName!")
    }

    override fun chooseCity() {
        println("Выберите другой город для покупки телефона.")
    }

    override fun choosePhoneModel() {
        var purchases = true
        var countPurchasesNotLuck = 0
        while (purchases) {
            if (countPurchasesNotLuck >=2) {
                purchases = false
                countPurchasesNotLuck = 0
            }
            println("Выберите модель телефона для покупки.")
            listPhoneKazan.forEach { println("${it.key} - стоимость ${it.value}р.") }
            val chosenModel = readlnOrNull()?.uppercase() ?: "Пусто"
            selectedPhone = chosenModel
            if (listPhoneKazan.containsKey(chosenModel)) {
                phoneModelsSold[chosenModel] = phoneModelsSold.getOrDefault(chosenModel, 0) + 1
                println("Вы приобрели телефон модели $chosenModel")
                purchases = false
            } else {
                println("Такой модели телефона нет в магазине")
                countPurchasesNotLuck++
            }

        }

    }
}