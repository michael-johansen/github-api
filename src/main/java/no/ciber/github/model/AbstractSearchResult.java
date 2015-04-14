package no.ciber.github.model;

import com.google.gson.annotations.SerializedName;

/**
 * User: Michael Johansen
 * Date: 14.04.2015
 * Time: 14:19
 */
public abstract class AbstractSearchResult {
    @SerializedName("total_count")
    private Long totalCount;
    @SerializedName("incomplete_results")
    private Boolean incompleteResults;

    public Boolean isIncompleteResults() {
        return incompleteResults;
    }

    public void setIncompleteResults(Boolean incompleteResults) {
        this.incompleteResults = incompleteResults;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }
}
