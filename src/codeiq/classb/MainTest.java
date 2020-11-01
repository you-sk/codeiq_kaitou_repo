package codeiq.classb;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import codeiq.util.StandardInputSnatcher;
import codeiq.util.StandardOutputSnatcher;

public class MainTest {

    private StandardOutputSnatcher out = new StandardOutputSnatcher();
    private StandardInputSnatcher in = new StandardInputSnatcher();


    @Before
    public void before() {
        System.setOut(out);
        System.setIn(in);
    }

    @After
    public void after() {
        System.setOut(null);
        System.setIn(null);
    }

	@Test
    public void test1() {
        in.inputln("95422357545868773174"); // 標準入力への入力はあらかじめ全部与える。
        Main.main(null); // テストターゲット実行
        assertEquals(out.readLine(), "9257583174");
    }

}
