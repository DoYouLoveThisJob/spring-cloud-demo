package com.czx.mybatis.generator;



import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.internal.DefaultCommentGenerator;

/**
 * 描述：
 * @since 1.9.10
 * @version 1.9.10
 * @作者：niexiaohui
 * @创建时间：2016年11月22日
 * @修改记录：
 */
public class MyCommentGenerator extends DefaultCommentGenerator {
    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        if(introspectedColumn.getRemarks() != null) {
            field.addJavaDocLine("/** " + introspectedColumn.getRemarks() + "*/");
        }
    }
}
