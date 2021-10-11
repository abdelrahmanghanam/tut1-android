fun main(args: Array<String>)
{
    println("Hello world")
    var age : Int =5
    println(age.toString())
    var myand=And()
    var myios=IOS()
    var myWeb=Web()
    println("what is the name")
    var name: String? = readLine()
    println("what is the experience")

    var experience: String? = readLine()
    println("what is the age")
    var ages: String?= readLine()
    println("what is the graduation year")
    var graduation= readLine()
//    println(myand.offer("ahmed",2,24,2019))
    println(myand.offer(name,experience,age,graduation))

}