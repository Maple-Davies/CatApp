class Cat (val name: String, var age: Int, var weight: Int) {

    public fun walk(distance: Int) : Boolean
    {
        if(weight - distance >= 5) {
            weight -= distance
            return true
        }
        return false
    }
    fun eat(amount: Int) {
        if (weight < 20) {
            weight += amount
        } else {
            println("thats a chonky cat maybe dont let it eat anymore until its had a walk")
        }
    }

    override fun toString() : String {
        return "Name: $name Age: $age"
    }
}
