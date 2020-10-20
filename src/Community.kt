package org.kotlinlang.play

//object that represents a community using CommunityMember object
class Community(val name: String) {
    private var community = mutableListOf<CommunityMember>()

    //adds a member to the community
    fun addMember(member: CommunityMember){
        try{
            community.add(member)
        }
        catch (e:Exception) {println (e)}
    }

    //calculates the total tax from all community members
     fun totalTax():Int{
         var sum:Int=0
         for(c in community){
             sum+=c.taxVal()
         }
         return sum
     }

    //calculates the money a member couled et from gmach
    fun gmachRequest(id: Int):Int{
        val member=findMemberById(id)
        if (member==null)
            throw IllegalArgumentException("the person is not a member in the community")
        return member.gmachVal()
    }

    //calculates the total volunteering hours from all community members
    fun totalVolunteeringHours(): MutableList<String> {
        var list: MutableList<CommunityMember> = community
        list.sortBy { it.volunteer }
        var aa= mutableListOf<String>("list of volunteering Hours sorted acording to volunteering type in community $name \n")
        for(c in list){
            aa.add("volunteeringType:c${c.volunteer}, ${c.name}, id:${c.id}, volunteeringHours:${c.volunteeringHours()}  \n")
        }
        return aa

    }

    //finds a community member by his id
    fun findMemberById(id:Int): CommunityMember? {
        for (c in community){
            if(c.id==id) return c
        }
        return null
    }

    //finds a community members by their name
    fun findMemberByName(name: String): List<CommunityMember> {
        var list= mutableListOf<CommunityMember>()
        for (c in community){
            if(c.name.equals(name))
                list.add(c)
        }
        return list
    }
}