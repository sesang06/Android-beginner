package javaAnimal;

public class Main {


 public static void main(String[] args) {
     System.out.println("Hello World!");

     Animal myCat = new Cat();
     myCat.run("MyCat"); // 정상 작동합니다.

     myCat.run(null); // 예상하지 못한 동작이 나지만, 컴파일은 됩니다. 컴파일이 안 되도록 수정해 주세요.


 }
}
