package Dao;

import impl.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.myBatisUtils;

import java.util.List;

public class UserDaoTest {

    @Test
    public void test(){

        // method 1 get mapper
        SqlSession sqlSession = myBatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> userList = mapper.getUserList();

        for (User user:
             userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
