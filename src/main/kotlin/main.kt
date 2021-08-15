fun main() {
    var expensesTotal = 0.0
    val musicPrice = 100.00
    var amountMusic = 1
    val constantBuyer = true
    var resultPrice = 0.0
    var currentPrice = amountMusic * musicPrice

    if (expensesTotal <= 1000)
        resultPrice = currentPrice
    else if (expensesTotal >= 1001.0 && amountMusic > 10)
        resultPrice = currentPrice - (amountMusic / 11 * 100.toDouble())
    else if (expensesTotal > 10001.0)
        resultPrice = (currentPrice - (amountMusic / 11 * 100.toDouble()))
    resultPrice -= resultPrice * 0.05

     if (constantBuyer)
         resultPrice -= (resultPrice / 100 * 1)

    expensesTotal += resultPrice

    println(resultPrice)
}