package org.kotlinlang.play

import java.lang.IllegalStateException
import kotlin.IllegalArgumentException

//abstract object of a Community Member
abstract class CommunityMember(
    id: Int,
    gender: Gender,
    name: String,
    address: String,
    birthDay: String,
    toraHours: Int,
    workHours: Int,
    income: Int,
    volunteer: VolunteerType
) : DebtsAndWins {

    var id: Int = 0
        private set(value) {
            if (value < 0) throw IllegalArgumentException("must be a positive number")
            field = value
        }

    var gender: Gender = gender
        private set

    var name: String = name
        private set(value) {}

    var address: String = address
        private set(value) {}

    var birthDay: String = birthDay
        private set

    var toraHours: Int = 0
        private set(value) {
            if (value < 0) throw IllegalArgumentException("must be a positive number")
            field = value
        }

    var workHours: Int = 0
        private set(value) {
            if (value < 0) throw IllegalArgumentException("must be a positive number")
            field = value
        }

    var income: Int = 0
        private set(value) {
            if (value < 0) throw IllegalArgumentException("must be a positive number")
            field = value
        }

    var volunteer: VolunteerType = volunteer
        private set


    init {
        this.id = id
        this.income = income
        this.workHours = workHours
        this.toraHours = toraHours
        if(workHours+toraHours<28||toraHours<7)
            throw IllegalArgumentException("the member is a BATLAN and is rejected from community")
    }

    abstract override fun gmachVal() :Int

    abstract override fun taxVal(): Int

    abstract override fun volunteeringHours():Int

    override fun toString(): String {
        return ("$name, $id \t ")
    }

}