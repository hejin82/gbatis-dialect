�Լ�д��һ��mybatis�����ҳ���,֧��mysql,oracle,db2,ms sql server2005-2008��ms sql server2012, ����sql server2005�ķ�ҳ�Ƚ϶���, ��ʱֻ֧�ֵ�order by �����, ���order by�ᱨ�� , mysql,oracle,db2����( sql server2012û�л�������, ֱ�Ӵ����ϲ��Ҹ�����, �����л����İ���Ժ������Ϣ��)

offset:���пⶼ��1��ʼ    limit:��ѯ����

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
1.��Ӷ�sql server2012��֧�� 
2.�޸�sql server��ҳ������ 