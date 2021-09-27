/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil.core;

import com.fu.mathuitl.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author ASUS
 */
public class FactorialTest {
    @Test
    public void checkFactorialGivenRightArgumentReturnsWell() {
        long expected = 120;
        long actual = MathUtil.getFactorial(5);
        Assert.assertEquals(expected, actual);
        
        Assert.assertEquals(720, MathUtil.getFactorial(6));
        Assert.assertEquals(1, MathUtil.getFactorial(0));
    }
    
    //check ngoại lệ khi đưa data sai
    @Test(expected = IllegalArgumentException.class)
    public void checkFactorialGivenWrongArgumentThrowsException() {
        //ko thể dùng assert
        //ngoại lệ chỉ có thể thấy nó xuất hiện hay không
        MathUtil.getFactorial(-5);
    }
}



//quy ước xanh/đỏ
//xanh: khi tất cả đều xanh
//đỏ: chỉ cần 1 cái đỏ (hoặc bạn tính toán sai hoặc bạn kì vọng sai)
 


