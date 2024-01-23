//获取远程主机主机名
package telPro;
import java.net.*;


public class GetRemoteHostname {
   public static void main(String[] args) {
       try {
           InetAddress inetAddress = InetAddress.getByName("www.baidu.com");
           System.out.println("Remote hostname: " + inetAddress.getHostName());
       } catch (UnknownHostException e) {
           e.printStackTrace();
       }
   }
}