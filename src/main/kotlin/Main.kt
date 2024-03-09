fun main(args: Array<String>) {
    var boss = Boss()

    val weapon = Weapon()
    weapon.gun = "пистолет"
    weapon.glock = "глок"
    boss.weapon = weapon
    boss.damage = 10
    boss.health = 50

    println("damage ${boss.damage} health ${boss.health} взял пушку ${weapon.glock}")
}