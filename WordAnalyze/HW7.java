/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw7;

import java.io.*;
import java.util.*;
/**
 *
 * @author Brian
 */
public class HW7 {

    /**
     * @param args the command line arguments
     */
    
    /*
    String line;
    while((line= in.readLine()) != null)
    {
    System.out.println(line);
    }
    in.close();
    */
    
    public static void main(String[] args) throws Exception {
       
        File myFile = new File("863-0.txt");
        FileReader myFr = new FileReader(myFile);
        BufferedReader myBr = new BufferedReader(myFr);
        
        StringBuilder lines = new StringBuilder();
        String line = new String();
        line += myBr.readLine();
        
        while (line != null){
            lines.append(line);
            lines.append(" ");
            line = myBr.readLine();
        }                               //2
        
        myBr.close();

        String completeText = lines.toString();
        completeText = completeText.toLowerCase();          //3a
        completeText = completeText.replaceAll("[^A-Za-z0-9\\s]", ""); //3a
        //completeText len = 303122
        
        
        stemmer s = new stemmer();
        char[] textChar = completeText.toCharArray();
        s.add(textChar, textChar.length);
        s.stem();
        String stemText = s.toString();
        //String stemText = new String(s.getResultBuffer(), 0, s.getResultLength());
        //stemText len = 303122
        
        String[] textArr;
        textArr = completeText.split("\\s+"); //3b
        //length 56439 without stemmer
        
        String[] textArr2;              //string array of text with stem 
        textArr2 = stemText.split("\\s+");
   
        
        HashMap<String, Integer> hM = new HashMap<>();

        for (int i = 0; i < textArr2.length; i++){
            String txt = textArr2[i];
            if (hM.containsKey(txt)){
                hM.put(txt, hM.get(txt)+1);
            }else
            {
                hM.put(txt, 1);
            }
        }           //#4

       
        List textList=new ArrayList(hM.entrySet());
    
        Collections.sort(textList,new Comparator(){
            public int compare(Object obj1, Object obj2){
                return ((Comparable)((Map.Entry)(obj2)).getValue
                    ()).compareTo(((Map.Entry)(obj1)).getValue());}
                            });
        
        List<String> sortedText = new ArrayList();      //sorted descending order
        
        for(int i = 0; i < textList.size(); i++){
            sortedText.add(textList.get(i).toString());
        }
        
        List<String> sortedT = new ArrayList();         //changed = to :
        
        for(int i = 0; i< sortedText.size(); i++){
             sortedT.add(sortedText.get(i).replace("=", ": "));
        }
        
        System.out.println("Total number of text: "+ textArr.length);
        System.out.println("Total number of unique words: "+ textArr2.length +" *****stem function did not work properly");
        
        File saveF = new File("WordCount.txt");
        FileWriter fW = new FileWriter(saveF);
        BufferedWriter bW = new BufferedWriter(fW);
        for (int i = 0 ; i < sortedT.size(); i++){
            bW.write(sortedT.get(i));
            bW.newLine();  
        }
        bW.flush();
        
        File saveDat = new File("WordCount.dat");
        FileOutputStream myFos = new FileOutputStream(saveDat);
        BufferedOutputStream myB = new BufferedOutputStream(myFos);
        ObjectOutputStream oOs = new ObjectOutputStream(myB);
        
//        for (int i = 0 ; i < sortedT.size(); i++){
//            bW2.write(sortedT.get(i));
//            bW2.newLine();  
//        }
        
        serializer serDat = new serializer(sortedT);
        oOs.writeObject(serDat);


        bW.close();
        oOs.close();
        
        
        File serFile = new File("WordCount.dat");
        FileInputStream sF = new FileInputStream(serFile);
        BufferedInputStream sB = new BufferedInputStream(sF);
        ObjectInputStream sO = new ObjectInputStream(sB);
        
        serializer serPrtin;
        serPrtin = (serializer)sO.readObject();
        serPrtin.getWords();
        //bW2.close();
  
    }
    
    
    
}
