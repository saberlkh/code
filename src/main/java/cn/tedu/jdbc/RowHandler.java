package cn.tedu.jdbc;

import java.sql.ResultSet;

/**
 * @Author lkh
 */
public interface RowHandler<T> {
    T handle(ResultSet rs);

}
