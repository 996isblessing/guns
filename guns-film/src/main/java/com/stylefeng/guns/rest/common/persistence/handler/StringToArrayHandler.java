package com.stylefeng.guns.rest.common.persistence.handler;


import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StringToArrayHandler extends BaseTypeHandler<String[]> {
	//javabean:String[]----转成----数据库类型:String
	//preparedStatement编报表(pre说明在数据库操作之前)，preparedStatement.set<T>(colum,value)基本类型都有
	//preparedStatement.setString(index,hobbyString);填充编报表的列数index和列类值
	@Override
	public void setNonNullParameter(PreparedStatement preparedStatement, int index, String[] strings, JdbcType jdbcType) throws SQLException {

		StringBuffer sb = new StringBuffer();
		//绕道空指针异常，不绕道一个小的空指针就会耽误全部运行的其他进程
		if(strings.length==0){
			String hobbyString = sb.toString().substring(strings.length);
			preparedStatement.setString(index,hobbyString);
		}
		else {
			for (String hobby : strings) {
				sb.append(hobby).append("#");//将","变成"#"
			}
			String hobbyString = sb.substring(0,sb.length() - 1);
			preparedStatement.setString(index,hobbyString);
		}

	}

	//将数据库类型:Stirng---转换成----javabean类型String[]
	//resultSet结果集(result说明在数据库操作之后) resultSet.get<T>(columnLabel)基本类型都有
	//resultSet.getString(columnLabel);填充编报表的列数columnLabel
	@Override
	public String[] getNullableResult(ResultSet resultSet, String columnLabel) throws SQLException {
		String hobbyString = resultSet.getString(columnLabel);
		//绕道空指针异常，不绕道一个小的空指针就会耽误全部运行的其他进程
		String[] hobbyArray=null;
		if(hobbyString!=null){
			hobbyArray = hobbyString.split(",");
		}
		return hobbyArray;
	}

	@Override
	public String[] getNullableResult(ResultSet resultSet, int index) throws SQLException {
		String hobbyString = resultSet.getString(index);
		String[] hobbyArray=null;
		if(hobbyString!=null){
			hobbyArray = hobbyString.split(",");
		}
		return hobbyArray;
	}

	@Override
	public String[] getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
		String hobbyString = callableStatement.getString(i);
		String[] hobbyArray=null;
		if(hobbyString!=null){
			hobbyArray = hobbyString.split(",");
		}
		return hobbyArray;
	}
}
