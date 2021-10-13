fun main(args: Array<String>)
{
    println("this is a program that determines acceptence in specific vacancy")

    var myand=And()
    var myios=IOS()
//    //test case
//    println(myios.offer("ahmed",2,24,2019))
    var myweb=Web()
    println("what is the name?")
    var name: String = readLine().toString()
    println("what are your experience years?")
    var experience: String = readLine().toString()
    println("what is your age?")
    var age: String= readLine().toString()
    println("what is the graduation year?")
    var graduation: String= readLine().toString()
    println("what vacancy are you applying for android: and, ios:ios, web:web?")
    var vac: String= readLine().toString().lowercase()
    when (vac){
        "and" -> println(myand.offer(name,experience.toInt(),age.toInt(),graduation.toInt()))
        "ios" ->println(myios.offer(name,experience.toInt(),age.toInt(),graduation.toInt()))
        "web" ->println(myweb.offer(name,experience.toInt(),age.toInt(),graduation.toInt()))
        else -> println(" wrong entry !!!")
    }


}
