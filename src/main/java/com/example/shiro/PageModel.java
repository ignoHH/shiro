package com.example.shiro;

import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 * Project：shiro
 * Date：2020/10/20
 * Time：17:23
 * Description：
 *
 * @author ignoHH
 * @version 1.0
 */
@Data
public class PageModel<D> implements Serializable {
    private int pageNum;
    private int pageSize;
    private long total;
    private int pages;
    private List<D> list;
}
