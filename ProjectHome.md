mybatis物理分页插件,支持mysql,oracle,db2和ms sql server.
在mybatis配置文件中加入
<!-- value="mssql|oracle|mysql|db2" -->


&lt;properties&gt;


> 

&lt;property name="dialect" value="mssql" /&gt;


> 

&lt;/properties&gt;



> 

&lt;plugins&gt;


> > 

&lt;plugin interceptor="com.gian.commons.dialect.PaginationInterceptor" /&gt;



> 

&lt;/plugins&gt;

