package controller;

/**
 * @author admin
 * @ClassName User
 * @Description
 * @Date 2019/9/16
 */
public class User {
  public String name;
  public int age;

  public User() {
  }

  public User(String name,int age) {
    this.name=name;
    this.age=age;
  }

  @Override
  public String toString() {
    return "User{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}
