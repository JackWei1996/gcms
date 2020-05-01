package com.gcms.service;

import com.gcms.pojo.Categorization;

import java.util.List;

public interface CategorizationService {
    Object getAllByLimit(Categorization categorization);

    void deleteById(Long id);

    void add(Categorization categorization);

    List<Categorization> searchWord(String word);

    void viewWord(String word);
}
