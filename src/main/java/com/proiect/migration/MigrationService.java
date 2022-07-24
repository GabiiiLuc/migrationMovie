package com.proiect.migration;


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
