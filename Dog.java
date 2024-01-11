public class Dog extends  Animal{
    int x=4;
    public void speak(){
        System.out.println(this.x);
        System.out.println(super.x);
    }
}
