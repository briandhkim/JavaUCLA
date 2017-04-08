/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw7;

import java.io.BufferedWriter;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Brian
 */
public class serializer implements Serializable {
    private BufferedWriter bufferedW;
        private List<String> list;
        public serializer(List<String> list){
            //this.bufferedW = bufferedW;
            this.list = list;
        }
        
        public void getWords(){
            for(int i = 0; i < list.size(); i++){
                System.out.println(list.get(i));
            }
        }

}
