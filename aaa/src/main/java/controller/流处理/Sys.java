package controller.流处理;

import java.util.Objects;

/**
 * @author admin
 * @ClassName Sys
 * @Description
 * @Date 2019/9/24
 */
public class Sys {

  private int id;
  private String name;

  public Sys(int id,String name) {
    this.id=id;
    this.name=name;
  }

  public Sys() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id=id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name=name;
  }

  @Override
  public String toString() {
    return "Sys{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if(this == o) return true;
    if(o == null || getClass() != o.getClass()) return false;
    Sys sys=(Sys) o;
    return id == sys.id &&
            Objects.equals(name,sys.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id,name);
  }
}
