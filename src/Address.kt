public class Address {
    public var name:String = "aaa"
    public var street:String = "bbb"
    public var city:String = "ccc"
    public var state:String = "ae"
    public var zip:String = "bbb"
    var age:Int = 19
        set(value){
            if ((value > 0) && (value < 110)){
                field = value
            }
        }
    var ss:String = "124"
        get(){
            println("dfghj")
            return field
        }


}
class FullName(var firstName:String, var lastName:String){
    val fullName:String
        get() = "$firstName $lastName"
}
class Person(var name:String){
    private var _age = 1
    var age:Int = 1
        set(value){
            if ((value > 0) && (value < 110)){
                field = value / 2
                _age = value

            }
        }
        get(){
            println(_age )
            return field
        }
    var hhh:Int?
        set(value){
            hhh = value
        }
        get(){return hhh}

}