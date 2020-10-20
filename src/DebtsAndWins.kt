package org.kotlinlang.play

// interface of Debts And Wins fo a Community Member
interface DebtsAndWins {

    //the amount of money someone could pays for taxes increases if he has a lot of children and decreases if he learns a lot of tora
    fun taxVal(): Int

    //the amount of money someone could get from the gmach increases if he has a lot of children and decreases if he has a high income
    //singles don't get from the gmach
    fun gmachVal(): Int

    //the amount of hours someone needs to volunteer depends on how busy he is.
    // the maximum is 5 for a single and 3 for a married
    fun volunteeringHours(): Int
}