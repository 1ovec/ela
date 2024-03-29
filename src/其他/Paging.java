package 其他;

/**
 * @author admin
 * @ClassName Paging
 * @Description
 * @Date 2019/8/9
 */
public class Paging {
  private Integer totalNum;//总条数
  private Integer totalPage;//总页数
  private Integer pageSize;//每页条数
  private Integer pageIndex;//当前页码
  private Integer queryIndex;//当前页从第几条开始查

  public static Paging pagination(Integer totalNum,Integer pageSize,Integer pageIndex){
    Paging page = new Paging();
    page.setTotalNum(totalNum);
    Integer totalPage = totalNum % pageSize == 0 ? totalNum / pageSize : totalNum / pageSize + 1;
    page.setTotalPage(totalPage);
    page.setPageIndex(pageIndex + 1);
    page.setPageSize(pageSize);
    page.setQueryIndex(pageSize * pageIndex);
    return page;
  }

  public Integer getTotalNum() {
    return totalNum;
  }

  public void setTotalNum(Integer totalNum) {
    this.totalNum = totalNum;
  }

  public Integer getTotalPage() {
    return totalPage;
  }

  public void setTotalPage(Integer totalPage) {
    this.totalPage = totalPage;
  }

  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public Integer getPageIndex() {
    return pageIndex;
  }

  public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
  }

  public Integer getQueryIndex() {
    return queryIndex;
  }

  public void setQueryIndex(Integer queryIndex) {
    this.queryIndex = queryIndex;
  }


}
