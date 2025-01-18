package ChatApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

import static java.lang.System.out;

public class ServerSide {
    Vector<String> users = new Vector<String>();
    Vector<HandleClient> clients=new Vector<HandleClient>();

    public void process()throws Exception{
        ServerSocket serverSocket=new ServerSocket(9999,10);
        out.println("Server started : ");
        while(true){
            Socket client=serverSocket.accept();
            HandleClient c=new HandleClient(client);
            clients.add(c);
        }
    }

    public static void main(String[] args) throws Exception {
        new ServerSide().process();
    }

    public void broadcast(String user,String message){
        //send message to all users
        for(HandleClient c:clients){
            if(!c.getUsername().equals(user)){
                c.sendMessage(user,message);
            }
        }
    }
    class HandleClient extends Thread{
        String name="";
        BufferedReader input;
        PrintWriter output;

        public HandleClient(Socket client) throws IOException {
            input=new BufferedReader(new InputStreamReader(client.getInputStream()));
            output=new PrintWriter(client.getOutputStream(),true);
            name=input.readLine();
            users.add(name);
            start();
        }

        public void sendMessage(String uname,String msg){
            output.println(uname+"-"+msg);
        }

        public String getUsername(){
            return name;
        }

        public void run(){
            String line;
            try{
                while(true){
                    line= input.readLine();
                    if(line.equals("end")){
                        clients.remove(this);
                        users.remove(name);
                        break;
                    }
                    broadcast(name,line);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

