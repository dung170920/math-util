/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil.main;

import com.fu.mathuitl.core.MathUtil;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        //test manual, đưa data, gọi hàm, so sánh
        //tất cả phải làm bằng mắt, cho từng tính huống
        System.out.println("0! = 1? " + MathUtil.getFactorial(0));
        System.out.println("1! = 1? " + MathUtil.getFactorial(1));
        System.out.println("2! = 2? " + MathUtil.getFactorial(2));
    }
}
