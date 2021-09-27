/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fu.mathutil.core;

import static com.fu.mathuitl.core.MathUtil.getFactorial;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

/**
 *
 * @author ASUS
 */
@RunWith(value = Parameterized.class)
public class AdvancedFactorialTest {

    //data driven: tham số hóa việc test (tách data ra khỏi các lệnh kiểm tra)
    //chuẩn bị bộ data (data có thể là file .txt, .excel, database..)
    //input và output là những cặp
    //nhiều cặp cần test nên data là mảng 2 chiều
    
    @Parameters
    public static Object[][] initData() {
        return new Integer[][] {
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120}
        };
    }

    //map 2 cột vào 2 biến để bỏ vào hàm check gọi là parameterized testing
    @Parameter(value = 0)
    public int input;
    @Parameter(value = 1)
    public long expected;
    
    @Test
    public void checkFactorialGivenRightArgumentReturnsWell() {
        assertEquals(expected, getFactorial(input));
    }
}