package org.spring.boot.common;

import lombok.Data;

@Data
public class Page {

    // 当前页
    private int pageNum;
    // 每页数量
    private int pageSize;
    // 当前页数量
    private int size;
    // 总记录数
    private long total;
    // 总页数
    private int pages;
    // 前一页
    private int prePage;
    // 下一页
    private int nextPage;
    // 所有导航页号
    private int[] navigatepageNums;
    // 导航条上的第一页
    private int navigateFirstPage;
    // 导航条上的最后一页
    private int navigateLastPage;

}
