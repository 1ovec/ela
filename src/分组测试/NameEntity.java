package 分组测试;

/**
 * @author admin
 * @ClassName NameEntity
 * @Description
 * @Date 2019/8/7
 */
public class NameEntity {

  private Integer id;
  private Integer provinceId;
  private Integer project_type;
  private String type_name;
  private Integer project_id;
  private String agentName;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id=id;
  }

  public Integer getProvinceId() {
    return provinceId;
  }

  public void setProvinceId(Integer provinceId) {
    this.provinceId=provinceId;
  }

  public Integer getProject_type() {
    return project_type;
  }

  public void setProject_type(Integer project_type) {
    this.project_type=project_type;
  }

  public String getType_name() {
    return type_name;
  }

  public void setType_name(String type_name) {
    this.type_name=type_name;
  }

  public Integer getProject_id() {
    return project_id;
  }

  public void setProject_id(Integer project_id) {
    this.project_id=project_id;
  }

  public String getAgentName() {
    return agentName;
  }

  public void setAgentName(String agentName) {
    this.agentName=agentName;
  }

  public NameEntity() {
  }

  public NameEntity(Integer id,Integer provinceId,Integer project_type,String type_name,Integer project_id,String agentName) {
    this.id=id;
    this.provinceId=provinceId;
    this.project_type=project_type;
    this.type_name=type_name;
    this.project_id=project_id;
    this.agentName=agentName;
  }

  @Override
  public String toString() {
    return "NameEntity{" +
            "id=" + id +
            ", provinceId=" + provinceId +
            ", project_type=" + project_type +
            ", type_name='" + type_name + '\'' +
            ", project_id=" + project_id +
            ", agentName='" + agentName + '\'' +
            '}';
  }
}
