package org.kotlinlang.play

class Single(
    id: Int, gender: Gender, name: String, address: String, birthDay: String, toraHours: Int, workHours: Int,
    income: Int, volunteer: VolunteerType, yearsOfEducation: Int):CommunityMember(id, gender, name, address, birthDay, toraHours, workHours, income, volunteer) {

    var yearsOfEducation: Int = 0
        private set(value) {
            if (value < 0) throw IllegalArgumentException("must be a positive number")
            field = value
        }

    init{
        this.yearsOfEducation=yearsOfEducation
    }

    override fun taxVal(): Int {
        val tax = 400 - 10 * toraHours - 5 * workHours
        if (tax > 0) return (tax) else return (0)
    }

    override fun gmachVal(): Int {
        return 0
    }

    override fun volunteeringHours(): Int {
        val hours=50-toraHours-workHours
        if(hours>5) return (5)
            else if (hours<0) return 0 else return  hours
    }

}