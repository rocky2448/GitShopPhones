fun main() {
    val cityKazan = ShopCityKazan("Казань")
    val citySamara = ShopCitySamara("Самара")
    val repairShop = RepairShop()
    var countShowRepairShop = true
    var continueShopping = true

    while (continueShopping) {
        println("Выберите город: (Казань/Самара)")
        val selectedCity = readlnOrNull() ?: "Пусто"
        if (selectedCity.equals("Казань", ignoreCase = true)) {
            cityKazan.welcome()
            cityKazan.choosePhoneModel()
            println("Показать статистику покупок по России? (да/нет)")
            val answer = readlnOrNull() ?: "нет"
            if (answer.equals("да", ignoreCase = true)) cityKazan.showStatistics()
            if (countShowRepairShop) {
                repairShop.welcome()
                repairShop.chooseCity()
                repairShop.choosePhoneModel()
                countShowRepairShop = false
            }
        } else {
            citySamara.welcome()
            citySamara.choosePhoneModel()
            println("Показать статистику покупок по России? (да/нет)")
            val answer = readlnOrNull() ?: "нет"
            if (answer.equals("да", ignoreCase = true)) citySamara.showStatistics()
        }
        println("Хотите продолжить покупки? (да/нет)")
        val answer = readlnOrNull() ?: "нет"
        continueShopping = answer.equals("да", ignoreCase = true)
    }
}