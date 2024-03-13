fun main(args: Array<String>) {
    val boss = Boss()

    boss.weapon = Weapon("Gun","Glock")
    boss.damage = 10
    boss.health = 50

    println("damage ${boss.damage} health ${boss.health} взял пушку ${boss.weapon}")
}