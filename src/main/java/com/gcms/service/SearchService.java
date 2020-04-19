package com.gcms.service;

import com.gcms.pojo.Search;

public interface SearchService {
    Search getByContent(Search search);

    void update(Search search);

    void save(Search search);

    Object getAllByLimit(Search search);
}
