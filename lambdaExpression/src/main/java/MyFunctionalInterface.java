
@FunctionalInterface
public interface MyFunctionalInterface {
    void m1();
//    void m28();
    
    default void m2(){
        System.out.println("Default method 1");
    }

    default void m3(){
        System.out.println("Default method 2");
    }
}
