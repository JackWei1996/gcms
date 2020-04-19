package com.gcms.service;

import com.gcms.pojo.Categorization;

public interface CategorizationService {
    Object getAllByLimit(Categorization categorization);

    void deleteById(Long id);

    void add(Categorization categorization);
}
