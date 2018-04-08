package comd.example.win.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void asdf() throws Exception {
        a a=new a();
        a.b="1";
        a b=a;
        b.b="2";
        System.out.println(a.b);
        System.out.println(b.b);
    }
    public class a{
        public String b;
    }
    @Test
    public void asfd() throws Exception {

    }
}