
class Teste {

    fun main(args: Array<String>) {
        for (i in 1..100)
            println(saidaNumero(i)
    }

    fun tdd(){
        Assertions.assertEquals("1",saidaNumero(1))
        Assertions.assertEquals("2",saidaNumero(2))
        Assertions.assertEquals("Fizz",saidaNumero(3))
        Assertions.assertEquals("Buzz",saidaNumero(5))
        Assertions.assertEquals("Fizz",saidaNumero(6))
        Assertions.assertEquals("Buzz",saidaNumero(10))
        Assertions.assertEquals("FizzBuzz",saidaNumero(15))
    }

    private fun saidaNumero(numero: Int): String {
        var saida = ""
        if(numero%3==0)
            saida += "Fizz"
        if(numero%5==0)
            saida += "Buzz"
        if(saida=="")
            saida += numero.toString()
        return saida
    }
}
