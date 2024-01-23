//获取远程主机IP地址
package telPro;
import java.net.*;


public class GetRemoteIP {
   public static void main(String[] args) {
       try {
           InetAddress inetAddress = InetAddress.getByName("www.baidu.com");
           System.out.println("Remote IP address: " + inetAddress.getHostAddress());
       } catch (UnknownHostException e) {
           e.printStackTrace();
       }
   }
}