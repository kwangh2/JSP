package kr.co.mid.common;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisConnection {
    protected SqlSession sql;

    public enum Connetion{
        CONNECTION,
        DISCONNECTION,
        ING
    }

    public enum DataResource{
        HANUL("dbconn/conninfo.properties");
        private final String config;
        private DataResource (String config) {
            this.config = config;
        }

        public String getConfig() {
            return config;
        }//나중에 쓸려고 getter로만듬
    }

    public MybatisConnection(DataResource res){
        String resource = res.getConfig();
        InputStream inputStream;

        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            sql = sqlSessionFactory.openSession(true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
