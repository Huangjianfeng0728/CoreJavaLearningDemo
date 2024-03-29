package internet;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class SimpleOperateWebSocket {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();
        socket.connect(new InetSocketAddress("www.baidu.com",80), 1000);
        System.out.println(socket.isConnected());
        InputStream inputStream = socket.getInputStream();
        Scanner scanner = new Scanner(inputStream);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
    }
}
