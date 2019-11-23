package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class OperateFile {
    public static void main(String[] args) throws IOException {
//        Path workRelative = Paths.get("work");
//        Path relativePath = Paths.get("D:\\CoreJavaLearningDemo");
//        Path path = relativePath.resolve(workRelative);
//        System.out.println(path.toString());
//        Path rePath = relativePath.relativize(path);
//        System.out.println(rePath.toString());
        List<Path> list = Files.list(Paths.get("D:\\BaiduNetdiskDownload")).collect(Collectors.toList());
        for (Path path : list){
            System.out.println(path.toString());
        }
        List<Path> listSons = Files.walk(Paths.get("D:\\BaiduNetdiskDownload")).collect(Collectors.toList());
        for (Path path : listSons){
            System.out.println(path.toString());
        }
    }
}
