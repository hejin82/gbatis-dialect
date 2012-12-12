package com.gian.commons.dialect;

public class MssqlDialect extends Dialect
{

    /*
     * (non-Javadoc)
     * @see
     * org.mybatis.extend.interceptor.IDialect#getLimitString(java.lang.String,
     * int, int)
     */
    @Override
    public String getLimitString(String sql, int offset, int limit)
    {
        sql = sql.trim();
        String order = "";
       
        StringBuffer pagingSelect = new StringBuffer(sql.length() + 100);

        pagingSelect
                .append("select * from (select row_number()over(order by tempcolumn)temprownumber,* ")
                .append(" from (select top ").append(limit).append(" tempcolumn=0,* from ( ");
        
        // 暂不支持多排序结果合并查询
        // 判断是否order....结尾, 分页中排序需要拆分sql
        if (sql.toLowerCase().matches(".+order[^)]+$"))
        {
            order = sql.substring(sql.lastIndexOf("order"));
            sql = sql.substring(0, sql.lastIndexOf("order"));
        }

        pagingSelect.append(sql);
        pagingSelect.append(" ) d " ).append(order).append(" ) t )tt where temprownumber>").append(offset);

        return pagingSelect.toString();
    }
    
    public static void main(String[] args)
    {
        System.out.println("sfsd order by sdfdsf".substring(0, "sfsd order by sdfdsf".lastIndexOf("order")));
        System.out.println("sfsd order by sdfdsf".substring("sfsd order by sdfdsf".lastIndexOf("order")));
    }

}