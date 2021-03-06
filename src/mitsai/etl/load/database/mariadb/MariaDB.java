package mitsai.etl.load.database.mariadb;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by junior on 12/21/16.
 */
public class MariaDB extends ConnectionHandler {
    private boolean firstTime = true;

    public MariaDB() throws IOException, ClassNotFoundException, SQLException {
        super();
    }

    @Override
    protected String insertIntoDatabase(HashMap<String, String> toInsert) {
        return !firstTime ? createLineToInsert(toInsert) :
                createTableInTheFirstTime(toInsert) + createLineToInsert(toInsert);
    }

    private String createTableInTheFirstTime(HashMap<String, String> toInsert) {
        firstTime = false;

        String fields = toInsert.keySet()
                .stream().collect(Collectors.joining(" TEXT,"));
        return "CREATE TABLE IF NOT EXISTS " + tableName + "(" + fields + " TEXT);";
    }

    private String createLineToInsert(HashMap<String, String> toInsert) {
        String values = toInsert.entrySet().stream()
                .map(Map.Entry::getValue)
                .collect(Collectors.joining("', '"));
        return "INSERT INTO " + tableName + " VALUES ('" + values + "');";
    }
}
