自己写的一个mybatis物理分页插件,支持mysql,oracle,db2,ms sql server2005-2008和ms sql server2012, 由于sql server2005的分页比较独特, 暂时只支持单order by 的情况, 多个order by会报错 , mysql,oracle,db2完美( sql server2012没有环境测试, 直接从网上查找改来的, 网友有环境的帮测试后给个消息哈)

offset:所有库都由1开始    limit:查询条数

<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration PUBLIC "-//mybatis.org//DTD Config 3.0//EN" "http://mybatis.org/dtd/mybatis-3-config.dtd">

<configuration>

    <!-- value="mssql58|mssql12|oracle|mysql|db2" -->

    <properties>

        <property name="dialect" value="mssql58" />

    </properties>


    <plugins>


    <plugin interceptor="com.gian.commons.dialect.PaginationInterceptor" />
    </plugins>


    
<mappers>

    </mappers>

</configuration>  


version1.1 
1.添加对sql server2012的支持 
2.修改sql server分页语句错误 