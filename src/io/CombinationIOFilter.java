package io;

import java.io.*;

public class CombinationIOFilter {
    public static void main(String[] args) throws IOException {
//        System.out.println(System.getProperty("user.dir"));//打印工作目录
//        System.out.println(File.separator);//打印文件分隔符
        FileInputStream fis = new FileInputStream("D:\\CoreJavaLearningDemo\\resources\\FileInputStream.txt");//通过FileInputStream从文件读取数据
//        System.out.println("FileInputStream:");
//        while (true){
//            byte read = (byte)fis.read();
//            if (read == -1){
//                break;
//            }
//            System.out.print(read+",");
//        }
//        System.out.println();

        //通过嵌套过滤器来增强其功能
        //1,增加缓冲区
        BufferedInputStream bis = new BufferedInputStream(fis);
        int read;
        int i = 0;
        while ((read = bis.read())!=-1){
            if (i == 0){
                bis.mark(10);
            }
            if (i == 9){
                bis.reset();
            }
            i++;
            System.out.println(read);
        }
        bis.close();


    }
}
