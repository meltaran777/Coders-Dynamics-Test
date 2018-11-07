package com.fil.github_client.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class SearchResult {

    @SerializedName("total_count")
    @Expose
    Integer totalCount;

    @SerializedName("incomplete_results")
    @Expose
    Boolean incompleteResults;

    @SerializedName("items")
    @Expose
    List<GitRepository> repositories = new ArrayList<GitRepository>();

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Boolean getIncompleteResults() {
        return incompleteResults;
    }

    public void setIncompleteResults(Boolean incompleteResults) {
        this.incompleteResults = incompleteResults;
    }

    public List<GitRepository> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<GitRepository> repositories) {
        this.repositories = repositories;
    }
}
