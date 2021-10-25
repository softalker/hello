package world;

import hello.World;

public class Hello implements Supplier<String> {
  
  public static void main(String[] args) {
    return new World().get();
  }
  
}
