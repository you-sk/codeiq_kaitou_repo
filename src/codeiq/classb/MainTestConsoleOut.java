package codeiq.classb;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import codeiq.util.StandardInputSnatcher;

public class MainTestConsoleOut {

    private StandardInputSnatcher in = new StandardInputSnatcher();


    @Before
    public void before() {
        System.setIn(in);
    }

    @After
    public void after() {
        System.setIn(null);
    }

	@Test
    public void test2() {

        in.inputln("95422357545868773174"); // 標準入力への入力はあらかじめ全部与える。
        Main.main(null); // テストターゲット実行
        //assertEquals(out.readLine(), "9257583174");
    }

}
