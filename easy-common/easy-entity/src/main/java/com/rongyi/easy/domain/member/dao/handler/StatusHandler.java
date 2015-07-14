package com.rongyi.easy.domain.member.dao.handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import com.rongyi.easy.domain.member.Status;

/**
 * 
 * ClassName: StatusHandler <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 状态.<br/>
 * date: 2015年5月4日 下午10:34:24 <br/>
 * 
 * @author bin.zhang
 * @version
 * @since JDK 1.6
 */
public class StatusHandler extends BaseTypeHandler<Status> {

  /**
   * TODO 简单描述该方法的实现功能（可选）.
   * 
   * @see org.apache.ibatis.type.BaseTypeHandler#setNonNullParameter(java.sql.PreparedStatement,
   *      int, java.lang.Object, org.apache.ibatis.type.JdbcType)
   */
  @Override
  public void setNonNullParameter(PreparedStatement ps, int i, Status parameter, JdbcType jdbcType)
      throws SQLException {

    ps.setInt(i, parameter.getValue());

  }

  /**
   * TODO 简单描述该方法的实现功能（可选）.
   * 
   * @see org.apache.ibatis.type.BaseTypeHandler#getNullableResult(java.sql.ResultSet,
   *      java.lang.String)
   */
  @Override
  public Status getNullableResult(ResultSet rs, String columnName) throws SQLException {

    int value = rs.getInt(columnName);
    return Status.findByValue(value);
  }

  /**
   * TODO 简单描述该方法的实现功能（可选）.
   * 
   * @see org.apache.ibatis.type.BaseTypeHandler#getNullableResult(java.sql.ResultSet, int)
   */
  @Override
  public Status getNullableResult(ResultSet rs, int columnIndex) throws SQLException {

    int value = rs.getInt(columnIndex);
    return Status.findByValue(value);
  }

  /**
   * TODO 简单描述该方法的实现功能（可选）.
   * 
   * @see org.apache.ibatis.type.BaseTypeHandler#getNullableResult(java.sql.CallableStatement, int)
   */
  @Override
  public Status getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {

    int value = cs.getInt(columnIndex);
    return Status.findByValue(value);
  }

}
