package com.example.thirdapi.util;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class Tess4JUtil {
    public static void main(String[] args) {
        //图片所在文件夹
        testTess4j("E:\\Tess4J-image");
    }
    public static void testTess4j(String filePath){
        File root = new File(filePath);
        ITesseract instance = new Tesseract();
        //Set the tessdata path
        instance.setDatapath("E:\\Tess4J-lib\\");
        instance.setLanguage("eng");//chi_sim ：简体中文， eng

        try {
            File[] files = root.listFiles();
            for (File file : files) {
                String result = instance.doOCR(file);
                System.out.println("图片名：" + file.toString() +" 识别结果："+result);
            }
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
}
