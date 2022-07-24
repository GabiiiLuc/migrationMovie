package com.proiect.migration;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path="/api/v1/migration")
public class Controller {

    private MigrationService migrationService;

    @PostMapping(path="/start")
    public Migration startMigration(@RequestBody String url){
        Migration migration = migrationService.findByUrl(url);
        migration.setState("Started");
        return migration;
    }

    @PostMapping(path="/resume")
    public Migration resumeMigration(@RequestBody String url){
        Migration migration = migrationService.findByUrl(url);
        migration.setState("Resumed");
        return migration;
    }

    @GetMapping(path="/progress")
    public Migration migrationProgress(@RequestParam String url){
        Migration migration = migrationService.findByUrl(url);
        if(migration.getTotalItemsNumber()== migration.getMigratedItemsNumber())
            migration.setState("Ended");
        else
            migration.setState("Progress");
        return migration;
    }

    @GetMapping(path="/migrated")
    public String gettingMigratedItems(@RequestParam String url){
        Migration migration = migrationService.findByUrl(url);
        StringBuilder result = new StringBuilder("url: " + new String(migration.getUrl()) + " items : [");
        for (Movie movie : migration.getItems())
            result.append(movie.toString());
        result.append("]");
        return result.toString();
    }

    @GetMapping(path="/failed")
    public String gettingFailedItems(@RequestParam String url){
        Migration migration = migrationService.findByUrl(url);
        StringBuilder result = new StringBuilder("url: " + new String(migration.getUrl()) + " items : [");
        for (Movie movie : migration.getItems())
            result.append(movie.getId());
        result.append("]");
        result.append("\nfail reason:").append(migration.getFailReason());

        return result.toString();
    }
}
