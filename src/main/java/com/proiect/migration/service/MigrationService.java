package com.proiect.migration.service;


import com.proiect.migration.domain.Migration;
import com.proiect.migration.repository.MigrationRepository;

public class MigrationService {
    private MigrationRepository migrationRepository;

    public Migration findByUrl(String url){
        for (Migration migration : migrationRepository.findAll()) {
            if (migration.getUrl().equals(url))
                return migration;
        }
        return null;
    }
}
