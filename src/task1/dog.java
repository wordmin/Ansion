//构造方法
package task1;

public class dog {
  /* public dog(){
    }

    public dog(String name) {
        //这个构造器仅有一个参数：name
        System.out.println("它的名字是："+name);
    }

    public static void main(String[] args) {
        //下面语句创建一个test构造方法对象
        dog dogs = new dog("小明");
    }*/

    int dogAge;
    public dog(String name){
        //这个构造器仅有一个参数：name
        System.out.println("它的名字是："+name);
    }

    public void setDogAge(int Age) {
        dogAge = Age;
    }
    public int getDogAge(){
        System.out.println("它的年龄是："+ dogAge);
        return dogAge;
    }

    public static void main(String[] args) {
        /*创建对象*/
        dog dogs=new dog("小明");
        /*通过方法设定age*/
        dogs.setDogAge(6);
        /*调用另一个方法获取AGE*/
        dogs.getDogAge();
        /*也可以这样访问变量*/
        System.out.println("变量值="+ dogs.dogAge);
    }
}
