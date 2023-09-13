package concepts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialize {
    public static void main(String[] args) {

        Demo obj=new Demo(1, "Geeks for geeks");
        String fileName="Serialize.txt";
        try{
            FileOutputStream fo=new FileOutputStream(fileName, false);
            ObjectOutputStream os=new ObjectOutputStream(fo);
            os.writeObject(obj);
            os.close();
            fo.close();
            System.out.println("Object has been serialized.");
        }catch(IOException e){
            System.out.println("Exception "+ e.getMessage());
        }

        Demo obj1=null;
        try{
            FileInputStream fi=new FileInputStream(fileName);
            ObjectInputStream oi=new ObjectInputStream(fi);
            obj1=(Demo)oi.readObject();
            fi.close();
            oi.close();
            System.out.println("Object has been deserialized.");
            System.out.println(obj1);

        }catch(IOException e){
            System.out.println(e);
        }catch(ClassNotFoundException e){
            System.out.println("Class not found "+e);
        }
       
    }
}

class Demo implements Serializable{
    private int a;
    private String b;

    public Demo(int a, String b){
        this.a=a;
        this.b=b;
    }
    public String toString(){
        return new StringBuilder(a+" "+b).toString();
    }
}
