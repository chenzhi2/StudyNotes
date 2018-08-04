### super/this的区别

- this引用当前对象：用类名定义一个变量的时候，定义的只是一个引用，外面可以通过这个引用来访问这个类里面的属性和方法，类里面也有一个引用来访问自己的属性和方法，这个引用就是this对象，它可以在类里面来引用这个类的属性和方法。this的三种用法

  每当一个对象创建后，Java虚拟机会给这个对象分配一个引用自身的指针，这个指针的名字就是this，this只能在类中的非静态方法中使用，静态的代码和静态的代码块绝对不能出现this的用法。

  - 在类的方法定义中使用的this关键字代表调用该方法对象的引用。（this关键字只能在方法内部使用，只有当需要明确指出当前对象的引用时，才使用this关键字）

  - 表示用类的成员变量，而非函数参数。

  - 将当前的对象传递给其他方法。

  - 用于在构造方法中引用满足指定参数类型的构造器。（只能引用一个构造方法且必须位于开始）举个栗子

    ```java
    public class TestDemo {
        int number=0;
        TestDemo increment(){
            number++;
            return this;
        }
        public void print(){
            System.out.println("number"+number);
        }
        public static void main(String[] args){
            TestDemo t = new TestDemo();
            t.increment().increment().increment().print();
        }
    }
    
    ```

    

- super表示对某个类的父类的引用，使用和this基本相同，比较如下

  - super()从子类中调用父类的构造方法，this()在同一类内调用其他方法。
  - this和super不能同时出现在一个构造函数里面。
  - super()和this()均需要放在构造方法内第一行。
  - this()和super()都指的是对象，所以都不可以在static环境中使用。