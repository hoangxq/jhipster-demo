package com.demo.service.dto.utils;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.domain.Page;

@EqualsAndHashCode(callSuper = true)
@Data
public class PagingRes extends Response {

    private Pagination pagination;

    protected PagingRes(Page<?> page) {
        this.data = page.getContent();
        this.pagination = new Pagination(
            page.getNumber() + 1,
            page.getTotalPages(),
            page.getTotalElements()
        );
    }

    public static PagingRes of(Page<?> page) {
        return new PagingRes(page);
    }

    public static class Pagination {
        private int page;
        private long totalPage;
        private long totalRecord;

        public Pagination(int page, long totalPage, long totalRecord) {
            this.page = page;
            this.totalPage = totalPage;
            this.totalRecord = totalRecord;
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public long getTotalPage() {
            return totalPage;
        }

        public void setTotalPage(long totalPage) {
            this.totalPage = totalPage;
        }

        public long getTotalRecord() {
            return totalRecord;
        }

        public void setTotalRecord(long totalRecord) {
            this.totalRecord = totalRecord;
        }
    }

}
