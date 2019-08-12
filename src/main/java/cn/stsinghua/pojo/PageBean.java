package cn.stsinghua.pojo;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @author stsinghua
 * @date 18-3-10下午12:47
 */
@Slf4j
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PageBean<T> extends BaseModel {

    private static final long serialVersionUID = 1L;
    /**
     * 当前页
     */
    private int pageCode;

    /**
     * 总页数=总记录数/每页显示的记录数
     */
    private int totalPage;

    /**
     * 总记录数
     */
    private int totalCount;

    /**
     * 每页显示的记录数
     */
    private int pageSize;

    /**
     * 每页显示的数据
     */
    private List<T> beanList;

}