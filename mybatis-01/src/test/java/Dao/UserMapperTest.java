package Dao;

import impl.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.myBatisUtils;

import java.util.List;

public class UserMapperTest {

    @Test
    public void test(){

        // method 1 get mapper
        SqlSession sqlSession = myBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();

        for (User user:
             userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void getUserByID(){
        SqlSession sqlSession = myBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user1 = mapper.getUserByID(3);
        System.out.println(user1);

        sqlSession.close();
    }

    @Test
    public void insertUser(){
        SqlSession sqlSession = myBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user1 = new User(4, "Jessie", "19288");
        mapper.insertUser(user1);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void updateUser(){
        SqlSession sqlSession = myBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user1 = new User(4, "Lily", "192887");
        mapper.updateUser(user1);
        sqlSession.commit();
        sqlSession.close();


    }    @Test
    public void DeleteUserByID(){
        SqlSession sqlSession = myBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUserByID(4);
        sqlSession.commit();
        sqlSession.close();
    }
}