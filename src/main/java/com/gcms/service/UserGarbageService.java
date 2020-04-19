package com.gcms.service;

import com.gcms.pojo.UserGarbage;

public interface UserGarbageService {
    Object getAllByLimit(UserGarbage userGarbage);

    void save(UserGarbage userGarbage);
}
