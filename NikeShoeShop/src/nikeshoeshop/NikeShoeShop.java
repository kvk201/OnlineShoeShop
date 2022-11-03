/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package nikeshoeshop;


import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.ServerAddress;
import com.mongodb.WriteConcern;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author vivek
 */

public class NikeShoeShop {
     
     public static int[] arr=new int[5];
     public static String Sname;
     public static String Semail;
     public static String Saddress;
     public static String Sphoneno;
     public static int COD=0;
     public static int Ccount=-1;
     public static double AMOUNT_to_pay ;
     public static String CUST_name;
     public static double ACC_no;
     public static double ACC_balance;
     public static double Cid[]=new double[20];
     public static double Csize[]=new double[20];
     public static double Cmrp[]=new double[20];
     public static double Cdiscount[]=new double[20];
     public static double Cprice[]=new double[20];
     public static double Cqtyleft[]=new double[20];
     
           
    
     public static ArrayList<String> Ccat=new ArrayList<String>();
     public static ArrayList<String> Cscat=new ArrayList<String>();
     public static ArrayList<String> Cpname=new ArrayList<String>();
     /**
     * 
     * @param args the command line arguments
     */
     @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}
