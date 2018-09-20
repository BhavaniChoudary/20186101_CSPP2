import java.io.*;
import java.util.*;
public final class Client {
    public static void main(String[] args) throws Exception {
        Network net = new Network();
        Scanner s = new Scanner(System.in);
        while(s.hasNext()) {
            String input = s.nextLine();
            String[] inputs = input.split(" ");
            switch(inputs[0]) {
                case "Create":
                int lineCount = 0;
                String content = "";
                String line;
                Scanner sc = new Scanner(System.in);
                while(lineCount < Integer.parseInt(inputs[1])) {
                    line = sc.nextLine();
                    if(lineCount == Integer.parseInt(inputs[1]) - 1) {
                        content = content + line;
                    }
                    else {
                        content = content + line + "\n";
                    }
                    lineCount++;
                }
                String r = content.replace(" ", "");
                String r2 = r.replace(".","");
                String[] network = r2.split("\n");
                for(String member : network) {
                    String[] userDetails = member.split("isconnectedto");
                    String[] conn = userDetails[1].split(",");
                    net.addUser(new User(userDetails[0], conn));
                }
                break;
                case "Network":
                net.showNetwork();
                break;
                case "addConnections":
                net.addConnections(inputs[1],inputs[2]);
                break;
                case "CommonConnections":
                String[] common = net.commonConnections(inputs[1],inputs[2]);
                System.out.print(Arrays.toString(common));
                break;
                case "getConnections":
                net.getConnections(inputs[1]);
                break;
                default:
                break;
            }
        }
    } 
}