package com.gian.commons.dialect;

public abstract class Dialect
{
    public static enum Type
    {
        MYSQL, ORACLE, DB2, MSSQL
    }

    public abstract String getLimitString(String sql, int skipResults,
            int maxResults);

}