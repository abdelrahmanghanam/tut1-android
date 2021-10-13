open class Applicant() {
    var age_restriction: Int=0
    var exp_restriction: Int=0;
    var offer_resitriction: Int=0;
    var vacancy: String=""



    fun age_filter(age:Int):Boolean {
        if (age <=this.age_restriction)
            return true
        else
            return false
    }

    fun experience_filter(experience: Int):Boolean{
        if (experience >=this.exp_restriction)
            return true
        else
            return false
    }

    fun graduation_age(graduationYear: Int,age: Int): Int {
        return age-(2021-graduationYear)
    }

    fun offer(name:String, experience: Int,age: Int,graduationYear: Int): String {
        var gradAge: Int = graduation_age(graduationYear,age)
        if (!age_filter(age))
        {
            return "Sorry but your age doesn't match our requirements"
        }
        if (!experience_filter(experience))
        {
            return "Sorry but your work experience years doesn't match our requirements"
        }
        var salary:Int=(experience/(age-gradAge))* offer_resitriction
        if (salary<=offer_resitriction)
            return "Dear $name, based on your info we would like to have you as a part of our company, kindly find the offer below: $salary K"
        else
            return "You exceed expectation"
    }


}
