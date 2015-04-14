package no.ciber.github.model;

import no.ciber.github.TextUtil;

import java.util.Optional;

public class SearchRequest {
    private final String query;
    private final Optional<Integer> page;
    private final Optional<Integer> pageSize;
    private final Optional<String> sort;
    private final Optional<String> order;

    public SearchRequest(String query) {
        this(query, 1, 10);
    }

    public SearchRequest(String query, int page, int pageSize) {
        this(query, page, pageSize, null, null);
    }

    public SearchRequest(String query, int page, int pageSize, String sort) {
        this(query, page, pageSize, sort, "desc");
    }

    public SearchRequest(String query, Integer page, Integer pageSize, String sort, String order) {
        if (!TextUtil.hasText(query)) throw new IllegalArgumentException("Query must not be null");
        this.query = query;
        this.page = Optional.ofNullable(page);
        this.pageSize = Optional.ofNullable(pageSize);
        this.sort = Optional.ofNullable(sort);
        this.order = Optional.ofNullable(order);
    }

    public String getQuery() {
        return query;
    }

    public Optional<Integer> getPage() {
        return page;
    }

    public Optional<Integer> getPageSize() {
        return pageSize;
    }

    public Optional<String> getSort() {
        return sort;
    }

    public Optional<String> getOrder() {
        return order;
    }
}
