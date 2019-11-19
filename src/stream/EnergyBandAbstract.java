package stream;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EnergyBandAbstract {
    public static void main(String[] args) throws IOException {
        List<String> lists = Files.readAllLines(Paths.get("E:\\CoreJavaLearningDemo\\resources\\gamma点--能带Q因子--排序.txt"), Charset.defaultCharset());
        PrintWriter out = new PrintWriter("E:\\CoreJavaLearningDemo\\resources\\gamma点_能带二.txt", "UTF-8");
        for (String str : lists){
            String[] results = str.split("\t");
            if (Double.valueOf(results[1]) > 90 && Double.valueOf(results[1]) < 150
                    && Long.valueOf(results[2]) > 2903817008.0 && Long.valueOf(results[2]) < 4839358984.0){
                out.print(str);
                out.print("\n");

            }
        }
        out.close();
    }
}
