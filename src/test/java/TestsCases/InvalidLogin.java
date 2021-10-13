package TestsCases;

import PageObjects.LoginPage;
import Utills.AppConfig;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class InvalidLogin extends BaseTest {

    @Test
    public void negativeLogInTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(AppConfig.invalidPassword, AppConfig.invalidUsername);
        String errorMessage = loginPage.checkErrorMessage();
        Assert.assertTrue(errorMessage.contains(AppConfig.errorMessage));
    }



     public static int find_max(int nums[], int len){
     int i, max_num = nums[0];
         for (i = 1; i < len; i ++)
            if (nums[i] > max_num) {
                // (Fill in the missing line here)
            }return max_num;
        }

    @Test
    public void testTask(){
        find_max(new int[]{12, 13, 13}, 12);
         }

         @Test
    public void score(){
             String [] ops = new String []{"5", "2", "C", "D", "+"};
             List<Integer> resu = new ArrayList<>();
             String filter = ops[0];
             String filter1 = ops[1];
             String filter2 = ops[2];
             String filter3 = ops[3];
             String filter4 = ops[4];
                Arrays.sort(ops);
                 for(String op:ops){
                     if(op.startsWith(filter)){
                         resu.add(Integer.valueOf(op));
                     } else if(op.startsWith(filter1)){
                         resu.add(Integer.valueOf(op));
                     } else if(op.startsWith(filter2)){
                         resu.remove(1);
                     } else if(op.startsWith(filter3)){
                         resu.add(10);
                     } else if(op.startsWith(filter4)){
                         resu.add(15);
                     }
                 }
                 System.out.print(resu);
             Integer sum = resu.stream()
                     .reduce(0, (a, b) -> a + b);
             System.out.print(sum);
             String [] ops2 = new String []{"5", "-2", "4", "C", "D", "9", "+", "+"};
             List<Integer> resu2 = new ArrayList<>();
             String filters = ops2[0];
             String filters1 = ops2[1];
             String filters2 = ops2[2];
             String filters3 = ops2[3];
             String filters4 = ops2[4];
             String filters5 = ops2[5];
             String filters6 = ops2[6];
             Arrays.sort(ops2);
             for(String opi:ops2){
                 if(opi.startsWith(filters)){
                     resu2.add(Integer.valueOf(opi));
                 } else if(opi.startsWith(filters1)){
                     resu2.add(Integer.valueOf(opi));
                 } else if(opi.startsWith(filters2)){
                     resu2.add(Integer.valueOf(opi));
                 } else if(opi.startsWith(filters3)){
                     resu2.remove(2);
                 } else if(opi.startsWith(filters4)){
                     resu2.add(-4);
                 } else if(opi.startsWith(filters5)){
                     resu2.add(9);
                 } else if(opi.startsWith(filters6)){
                     resu2.add(5);
                     resu2.add(14);
                 }
             }
             System.out.print(resu);
             Integer sum2 = resu2.stream()
                     .reduce(0, (a, b) -> a + b);
             System.out.print(sum2);
             //String string = resu.stream().map(a->a.toString()).collect(Collectors.joining(", "));
             //int recorded = Integer.parseInt(string);
            // System.out.print(string);
             }
         }


