package org.kotlinlang.play


fun main(args: Array<String>) {
    var balfur=Community("balfur")
    balfur.addMember(Single(12,Gender.Male,"aa","wall street 2","25/11/1991",7,30,5000,VolunteerType.Spiritual,8))
    var b=Married(13, Gender.Female,"bb","wall street 2","25/11/1991",8,30,4000,VolunteerType.Musical,25,3)
    var c=Single(14,Gender.Male,"cc","wall street 2","25/11/1991",10,30,7500,VolunteerType.Physical,14)
    var d=Married(15,Gender.Male,"dd","wall street 2","25/11/1991",7,22,8000,VolunteerType.Spiritual,24,3)
    var e=Married(16, Gender.Female,"ee","wall street 2","25/11/1991",8,25,14000,VolunteerType.Musical,22,10)
    var f=Single(17,Gender.Male,"ff","wall street 2","25/11/1991",9,36,15000,VolunteerType.Physical,20)
    balfur.addMember(b)
    balfur.addMember(c)
    balfur.addMember(d)
    balfur.addMember(e)
    balfur.addMember(f)
    println(balfur.totalVolunteeringHours())
    println(balfur.totalTax())
    println(balfur.gmachRequest(14))


}