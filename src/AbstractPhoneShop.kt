abstract class AbstractPhoneShop : PhoneShop {
    var phoneModelsSold = mutableMapOf<String, Int>(
        "SAMSUNG S6" to 125,
        "XIAOMI NOTE 4" to 145,
        "POCO M4" to 218,
        "ONE PLUS 9T" to 52,
        "ZTE BLADE 20 SMART" to 83
    )
    var selectedPhone = ""

    override fun showStatistics() {
        if (phoneModelsSold.containsKey(selectedPhone)) {
            println("Статистика покупок:")
            println("Модель $selectedPhone продано ${phoneModelsSold[selectedPhone]}шт")
        }
        else {
            println("Вы не выбрали телефон")
        }
    }
}