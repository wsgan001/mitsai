package mitsai.etl.load.helper;

import org.intellij.lang.annotations.MagicConstant;

import java.sql.*;

/**
 * Created by junior on 12/21/16.
 */
public class StatementMock implements Statement {

    private static final int ZERO = 0;
    private String sql = "";

    @Override
    public ResultSet executeQuery(String sql) throws SQLException {
        return null;
    }

    @Override
    public int executeUpdate(String sql) throws SQLException {
        this.sql += sql + ";";
        return ZERO;
    }

    @Override
    public void close() throws SQLException {

    }

    @Override
    public int getMaxFieldSize() throws SQLException {
        return ZERO;
    }

    @Override
    public void setMaxFieldSize(int max) throws SQLException {

    }

    @Override
    public int getMaxRows() throws SQLException {
        return ZERO;
    }

    @Override
    public void setMaxRows(int max) throws SQLException {

    }

    @Override
    public void setEscapeProcessing(boolean enable) throws SQLException {

    }

    @Override
    public int getQueryTimeout() throws SQLException {
        return ZERO;
    }

    @Override
    public void setQueryTimeout(int seconds) throws SQLException {

    }

    @Override
    public void cancel() throws SQLException {

    }

    @Override
    public SQLWarning getWarnings() throws SQLException {
        return null;
    }

    @Override
    public void clearWarnings() throws SQLException {

    }

    @Override
    public void setCursorName(String name) throws SQLException {

    }

    @Override
    public boolean execute(String sql) throws SQLException {
        this.sql += sql;
        return false;
    }

    @Override
    public ResultSet getResultSet() throws SQLException {
        return null;
    }

    @Override
    public int getUpdateCount() throws SQLException {
        return ZERO;
    }

    @Override
    public boolean getMoreResults() throws SQLException {
        return false;
    }

    @Override
    public void setFetchDirection(@MagicConstant(intValues = {ResultSet.FETCH_FORWARD,
            ResultSet.FETCH_REVERSE, ResultSet.FETCH_UNKNOWN}) int direction) throws SQLException {

    }

    @Override
    public int getFetchDirection() throws SQLException {
        return ZERO;
    }

    @Override
    public void setFetchSize(int rows) throws SQLException {

    }

    @Override
    public int getFetchSize() throws SQLException {
        return ZERO;
    }

    @Override
    public int getResultSetConcurrency() throws SQLException {
        return ZERO;
    }

    @Override
    public int getResultSetType() throws SQLException {
        return ZERO;
    }

    @Override
    public void addBatch(String sql) throws SQLException {

    }

    @Override
    public void clearBatch() throws SQLException {

    }

    @Override
    public int[] executeBatch() throws SQLException {
        return new int[ZERO];
    }

    @Override
    public Connection getConnection() throws SQLException {
        return null;
    }

    @Override
    public boolean getMoreResults(@MagicConstant(intValues = {Statement.CLOSE_CURRENT_RESULT, Statement.KEEP_CURRENT_RESULT, Statement.CLOSE_ALL_RESULTS}) int current) throws SQLException {
        return false;
    }

    @Override
    public ResultSet getGeneratedKeys() throws SQLException {
        return null;
    }

    @Override
    public int executeUpdate(String sql, @MagicConstant(intValues = {Statement.RETURN_GENERATED_KEYS, Statement.NO_GENERATED_KEYS}) int autoGeneratedKeys) throws SQLException {
        return ZERO;
    }

    @Override
    public int executeUpdate(String sql, int[] columnIndexes) throws SQLException {
        return ZERO;
    }

    @Override
    public int executeUpdate(String sql, String[] columnNames) throws SQLException {
        return ZERO;
    }

    @Override
    public boolean execute(String sql, int autoGeneratedKeys) throws SQLException {
        this.sql = sql;
        return false;
    }

    @Override
    public boolean execute(String sql, int[] columnIndexes) throws SQLException {
        return false;
    }

    @Override
    public boolean execute(String sql, String[] columnNames) throws SQLException {
        return false;
    }

    @Override
    public int getResultSetHoldability() throws SQLException {
        return ZERO;
    }

    @Override
    public boolean isClosed() throws SQLException {
        return false;
    }

    @Override
    public void setPoolable(boolean poolable) throws SQLException {

    }

    @Override
    public boolean isPoolable() throws SQLException {
        return false;
    }

    @Override
    public void closeOnCompletion() throws SQLException {

    }

    @Override
    public boolean isCloseOnCompletion() throws SQLException {
        return false;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }

    public String getSql() {
        return sql;
    }
}
