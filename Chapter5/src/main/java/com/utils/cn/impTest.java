package com.utils.cn;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class impTest {
    @Test
    public void test0() throws IOException {
        File file =new File("C:\\Users\\Administrator\\Desktop\\test.xls");
        new ExcelUtils().excelRead(file);
    }
}
