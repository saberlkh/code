package cn.tedu.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author lkh
 */
public class Recordquery {
    private final Connection connection;
    public Recordquery(Connection connection) {
        this.connection = connection;
    }
    public <T> T query(RowHandler<T> handler,String sql,Object... params) throws SQLException {
        try (PreparedStatement statement=connection.prepareStatement(sql)){
            int index=1;
            for (Object param:params){
                statement.setObject(index++,param);
            }
            ResultSet set=statement.executeQuery();
            return handler.handle(set);
        }
    }
}
