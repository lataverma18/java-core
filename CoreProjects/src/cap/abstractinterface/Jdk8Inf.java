package cap.abstractinterface;

public interface Jdk8Inf {
 void get();
default void put(){
	 System.out.println("put of Jdk8Inf");
 }
}
