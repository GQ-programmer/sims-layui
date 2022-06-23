package pub.zgq;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author 孑然
 */
public class DormGradeControllerTest {
    @Test
    public void test(){
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
        System.out.println(dateFormat.format(date));
    }

    @Test
    public void test1(){

        boolean flag = false;
        if (flag = true){
            System.out.println("true");
        }else {
            System.out.println(false);
        }
    }
}
