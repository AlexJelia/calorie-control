package com.alex.repository;

import com.alex.model.Cost;

import java.time.LocalDateTime;
import java.util.List;

public interface CostRepository {
    Cost save(Cost cost, int userId);

    boolean delete(int id, int userId);

    Cost get(int id, int userId);

    List<Cost> getAll(int userId);

    List<Cost> getBetween(LocalDateTime startDate, LocalDateTime endDate, int userId);
}
