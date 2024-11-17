package Test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class LogicalTest_Ganesh {

public void reverseTheGivenString (){

String given = "Mahathuva Sri"; 

String result = "";

for(int i = given.length()-1;i>=0;i--){

char c =given.charAt(i);

result = result+c;
}

System.out.println("reverseTheGivenString  ---> "+result);
}


public void reverseTheGivenWordFromString(){

String given = "Mahathuva Sri"; 
String result = "";
String [] ans =given.split(" ");

for(int i =ans.length-1;i>=0;i--){
result = result+ans[i]+" ";

}
System.out.println("reverseTheGivenWordFromString --> "+result);

}


public void reverseTheGivenWordInTheSamePlaceFromString(){

String given = "Mahathuva Sri"; 
String result = "";

String [] ans = given.split(" ");

for(String  an :ans){

for(int i = an.length()-1;i>=0;i--){

char c = an.charAt(i);

result = result+c;

}
result = result+" ";
}
System.out.println("result "+result);
}
public void findTheOccuranceOfEachCharacterinGivenString(){
String given = "MahathuvaSri"; 
String result = "";

Map<Character, Integer> map = new LinkedHashMap<>();

for(int i =0; i<given.length();i++){
char c = given.charAt(i);
if(map.containsKey(c)){

Integer val = map.get(c);

map.put(c,val+1);
}

else {
map.put(c,1);
}

}
System.out.println(map);

}

public void removeDuplicateInegerArray(){

int [] given = {5,10,5,15,10,5,15};// 5,10,15
int [] result =new int[given.length];

Arrays.sort(given);//5,5,5,10,10,15,15

int count =0;
for(int i = 0; i<given.length-1;i++){

if(given[i]!=given[i+1]){

result[count]=given[i];
count++;
}
}
result[count]=given[given.length-1];

for(int i =0;i<=count;i++){

System.out.println(result[i]);
}

}

public void removeDuplicateStringArray(){
String [] given = {"java","sql","API","sql","java"};
String [] result = new String [given.length];

Arrays.sort(given);
int count =0;
for(int i=0; i<given.length-1;i++){
if (!(given[i].equals(given[i+1]))){
result [count]=given[i];
count ++;
}
}
result[count]=given[given.length-1];
for(int i =0; i<=count;i++){
System.out.println(result[i]);
}

}

public void SwappingTwoDifferentStringWithThirdVariable(){

String name1 = "Mahathuva";
String name2 = "Sri";
String name3 = name1+name2;
name2 = name1;
name1= name3.substring(name3.length()-name1.length());

System.out.println("name1 --> "+name1);

System.out.println("name2 --> "+name2);

}

public void SwappingTwoDifferentStringWithoutThirdVariable(){
String name1 = "Mahathuva";
String name2 = "Sri";
name2= name1+name2;
name1 = name2;
} 

public void findPalidrome(){
String given = "mahathuva";
String result = "";

for(int i = given.length()-1;i>=0;i--){
char c =given.charAt(i);
result = result+c;
}
 if(given.equalsIgnoreCase(result)){
System.out.println("Given is Palindrome");
}
else {
System.out.println("Given is not Palindrome") ;
}
}



public static void main(String[]args){
	
	LogicalTest_Ganesh l = new LogicalTest_Ganesh();
	l.reverseTheGivenString();
	l.reverseTheGivenWordFromString();
	l.reverseTheGivenWordInTheSamePlaceFromString();
	l.findTheOccuranceOfEachCharacterinGivenString();
	l.removeDuplicateInegerArray();
	l.removeDuplicateStringArray();
	l.SwappingTwoDifferentStringWithThirdVariable();
	l.SwappingTwoDifferentStringWithoutThirdVariable();
	l.findPalidrome();

}



}
