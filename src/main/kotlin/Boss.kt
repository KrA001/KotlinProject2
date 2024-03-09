class Boss : GameEntity() {

   var weapon: Weapon = Weapon()
       get() = field
       set(value) {
           field = value
       }
}