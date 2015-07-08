package edu.dzu.vo;

import java.awt.Font;

import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestHibernate {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Users users = new Users();
        users.setId(20121108);
        users.setName("张三");
        users.setAge(24);
        users.setTel("010-87654321");
        users.setAddress("上海黄浦");
        
        Users users2 = new Users();
        users2.setId(20121109);
        users2.setName("李四");
        users2.setAge(23);
        users2.setTel("010-12345678");
        users2.setAddress("北京朝阳");
        
        Session session = HibernateSessionFactory.getSession();
        Transaction trans = session.beginTransaction();
        session.persist(users);
        session.persist(users2);
        trans.commit();
        
        StringBuffer result = new StringBuffer();
        result.append("添加成功！往数据库中添加如下数据：\n");
        result.append("编号"+"地址"+"姓名"+"年龄"+"联系电话\t\r\n\r\n");
        result.append(users.getId()+" ");
        result.append(users.getAddress()+" ");
        result.append(users.getName()+" ");
        result.append(users.getAge()+" ");
        result.append(users.getTel()+"\t\n\r");
        
        result.append(users2.getId()+" ");
        result.append(users2.getAddress()+" ");
        result.append(users2.getName()+" ");
        result.append(users2.getAge()+" ");
        result.append(users2.getTel()+"\t\n\r");
        
        session.close();
        
        JOptionPane.getRootFrame().setFont(new Font("Arial", Font.BOLD, 14));
        JOptionPane.showMessageDialog(null, result.toString());
        
    }

}