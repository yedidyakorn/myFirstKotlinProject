package org.kotlinlang.play

import java.util.*

class Married(
    id: Int, gender: Gender, name: String, address: String, birthDay: String, toraHours: Int, workHours: Int,
    income: Int, volunteer: VolunteerType, spouseId: Int, numOfCchildren: Int
) : CommunityMember(id, gender, name, address, birthDay, toraHours, workHours, income, volunteer) {

    var spouseId: Int = 0
        private set(value) {
            if (value < 0) throw IllegalArgumentException("must be a positive number")
            field = value
        }

    var numOfCchildren: Int = 0
        private set(value) {
            if (value < 0) throw IllegalArgumentException("must be a positive number")
            field = value
        }

    init {
        this.spouseId = spouseId
        this.numOfCchildren = numOfCchildren
    }

    override fun gmachVal(): Int {
        val gmach = 50000 - income * 2 + 5000 * numOfCchildren
        return if (gmach < 15000) (15000) else gmach
    }

    override fun taxVal(): Int {
        val tax = 1000 - 30 * toraHours - 5 * workHours + 100 * numOfCchildren
        return if (tax > 0) (tax) else 0
    }

    override fun volunteeringHours(): Int {
        val hours = 50 - toraHours - workHours
        return if (hours > 3) (3)
        else if (hours < 0) 0 else hours
    }

}